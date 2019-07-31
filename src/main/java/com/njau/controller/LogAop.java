package com.njau.controller;

import com.njau.entity.Syslog;
import com.njau.service.SyslogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author 张文军
 * @Description:日志记录的切面
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/7/3112:40
 */
@Component
@Aspect
public class LogAop {

    @Autowired
    private SyslogService syslogService;

    /**
     * 获取之前需要在web.xml中配置一个监听器
     */
    @Autowired
    private HttpServletRequest request;

    /**
     * 切入点表达式
     */
    @Pointcut("execution(* com.njau.controller.*.*(..))")
    private void pte() {
    }

    /**
     * 访问时间
     */
    private Date visitTime;

    /**
     * 当前访问的类
     */
    private Class clazz;


    /**
     * 当前访问的方法
     */
    private Method method;


    /**
     * 前置通知，拦截所有的Controller
     *
     * @param joinPoint
     */
    @Before("pte()")
    public void doBefore(JoinPoint joinPoint) throws NoSuchMethodException {
        visitTime = new Date();
        clazz = joinPoint.getTarget().getClass();
        String methodName = joinPoint.getSignature().getName();
        if (joinPoint.getArgs() == null || joinPoint.getArgs().length == 0) {
            method = clazz.getMethod(methodName);
        } else {
            Class[] classArgs = new Class[joinPoint.getArgs().length];
            for (int i = 0; i <classArgs.length; i++) {
                classArgs[i] = joinPoint.getArgs()[i].getClass();
            }
            method = clazz.getMethod(methodName, classArgs);
        }
    }

    /**
     * 后置通知，拦截所有的Controller
     *
     * @param joinPoint
     */
    @After("pte()")
    public void doAfter(JoinPoint joinPoint) {
        //获取访问的时长
        /**
         * 执行时长
         */
        long executionTime = System.currentTimeMillis() - visitTime.getTime();
        if (clazz != null && method != null && !method.getName().equals("toLogin") &&!method.getName().equals("login") && !method.getName().equals("failer") && clazz != LogAop.class) {
            //1.获取类上的@RequestMapping("/orders")
            RequestMapping classAnnotation = (RequestMapping) clazz.getAnnotation(RequestMapping.class);
            if (classAnnotation != null) {
                String[] classValue = classAnnotation.value();
                //2.获取方法上的@RequestMapping(xxx)
                RequestMapping methodAnnotation = method.getAnnotation(RequestMapping.class);
                if (methodAnnotation != null) {
                    String[] methodValue = methodAnnotation.value();
                    /**
                     * 访问资源url
                     */
                    String url = classValue[0] + methodValue[0];

                    //获取访问的ip
                    /**
                     * 访问IP
                     */
                    String ip = request.getRemoteAddr();

                    //获取当前操作的用户//从上下文中获了当前登录的用户
                    SecurityContext context = (SecurityContext) request.getSession().getAttribute("SPRING_SECURITY_CONTEXT");
//                    SecurityContext context = SecurityContextHolder.getContext();
                    User user = (User) context.getAuthentication().getPrincipal();

                    /**
                     * 操作者用户名
                     */
                    String username = user.getUsername();
                    /**
                     * 将日志相关信息封装到SysLog对象
                     */
                    Syslog sysLog = new Syslog();
                    sysLog.setExecutionTime((int) executionTime);
                    sysLog.setIp(ip);
                    sysLog.setMethod("[类名] " + clazz.getName() + "[方法名] " + method.getName());
                    sysLog.setUrl(url);
                    sysLog.setUsername(username);
                    sysLog.setVisitTime(visitTime);

                    //调用Service完成操作
                    syslogService.save(sysLog);
                }
            }
        }
    }

}
