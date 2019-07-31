package com.njau.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/7/2719:39
 */
@Controller
@RequestMapping("main")
public class Main {

    /**
     * 跳转到首页
     */
    @RequestMapping("toMain.do")
    public String toMain() {
        return"main";
    }
    /**
     * 跳转到首页
     */
    @RequestMapping("toError.do")
    public String toError404() {
        return"error";
    }
}
