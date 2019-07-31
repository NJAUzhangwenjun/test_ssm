<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*"%>
<!-- 页面头部 -->
<header class="main-header">


    <!-- Logo -->
    <a href="/index.jsp" class="logo">
        <!-- mini logo for sidebar mini 50x50 pixels -->
        <span class="logo-mini"><b>数据</b></span>
        <!-- logo for regular state and mobile devices -->
        <span class="logo-lg"><b>微气候监测系统</b></span>
    </a>


    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
        <!-- Sidebar toggle button-->
        <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only">Toggle navigation</span>
        </a>

        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
                <li class="dropdown user user-menu">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <img src="/statics/img/user2-160x160.jpg" class="user-image" alt="User Image">
                        <span class="hidden-xs">
                            <security:authentication property="principal.username"/>
                        </span>
                    </a>
                    <ul class="dropdown-menu">
                        <!-- User image -->
                        <li class="user-header">
                            <img src="/statics/img/user2-160x160.jpg" class="img-circle" alt="User Image">

                            <p>
                                <%--获取当前时间并显示--%>
                                <security:authentication property="principal.username"/> - 数据管理员

                                <%
                                    Date d = new Date();
                                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                    String now = df.format(d);
                                %>
                                <small>最后登录:<%=now %></small>
                            </p>
                        </li>
                      <%--  <li class="user-body">
                            <div class="row">
                                <div class="col-xs-4 text-center">
                                    <a href="#">个人主页</a>
                                </div>
                                <div class="col-xs-4 text-center">
                                    <a href="#">权限管理</a>
                                </div>
                                <div class="col-xs-4 text-center">
                                    <a href="#">权限分配</a>
                                </div>
                            </div>
                        </li>--%>

                        <!-- Menu Footer-->
                        <li class="user-footer">
                           <%-- <div class="pull-left">
                                <a href="#" class="btn btn-default btn-flat">修改密码</a>
                            </div>--%>
                            <div class="pull-right">
                                <a href="/logout.do" class="btn btn-default btn-flat">退出</a>
                            </div>
                        </li>
                    </ul>
                </li>

            </ul>
        </div>
    </nav>
</header>
<!-- 页面头部 /-->
