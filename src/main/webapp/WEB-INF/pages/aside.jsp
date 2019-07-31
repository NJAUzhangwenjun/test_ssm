<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="/statics/img/user2-160x160.jpg" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p><security:authentication property="principal.username"/></p>
                <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
            </div>
        </div>
        <!-- search form -->
        <form action="#" method="get" class="sidebar-form">
            <div class="input-group">
                <input type="text" name="q" class="form-control" placeholder="搜索...">
                <span class="input-group-btn">
        <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
        </button>
      </span>
            </div>
        </form>
        <!-- /.search form -->


        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="header">菜单</li>

            <li id="admin-index"><a href="../../index.jsp"><i class="fa fa-dashboard"></i> <span>首页</span></a></li>


            <!-- 菜单 1-->
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-folder"></i> <span>基础数据</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">

                    <li id="admin-login1">

                        <a href="/product/productList.do">
                            <i class="fa fa-circle-o"></i> 产品管理
                        </a>
                    </li>

                    <li id="admin-register1">
                        <a href="/orders/findAllPage.do?page=1&size=4">
                            <i class="fa fa-circle-o"></i> 订单管理
                        </a>
                    </li>

                </ul>
            </li>

            <!-- 菜单2 -->

            <%--只有是SUPER的角色的用户才能访问到--%>
            <security:authorize access="hasRole('SUPER')" >

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-folder"></i> <span>用户管理</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">

                    <li id="admin-login">
                        <a href="/users/findAll.do?page=1&size=4">
                            <i class="fa fa-circle-o"></i> 用户查询
                        </a>
                    </li>

                </ul>
            </li>

            <!-- 菜单3 -->
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-folder"></i> <span>角色管理</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">

                    <li>
                        <a href="/role/findAll.do?page=1&size=4">
                            <i class="fa fa-circle-o"></i> 角色列表
                        </a>
                    </li>

                </ul>
            </li>

            <!-- 菜单4 -->
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-folder"></i> <span>权限管理</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">

                    <li>
                        <a href="/permission/findAll.do?page=1&size=4">
                            <i class="fa fa-circle-o"></i> 权限列表
                        </a>
                    </li>

                </ul>
            </li>

            <!-- 菜单5 -->
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-folder"></i> <span>日志管理</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">

                    <li>
                        <a href="/syslog/findAll.do?page=1&size=4">
                            <i class="fa fa-circle-o"></i> 日志列表
                        </a>
                    </li>

                </ul>
            </li>

            </security:authorize>
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>
