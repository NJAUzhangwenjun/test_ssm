<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<html>
<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>微气候监测系统</title>
    <meta name="description" content="微气候监测系统">
    <meta name="keywords" content="微气候监测系统">
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">

    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <link rel="stylesheet" href="/statics/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/statics/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="/statics/plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="/statics/plugins/iCheck/square/blue.css">
    <link rel="stylesheet" href="/statics/plugins/morris/morris.css">
    <link rel="stylesheet" href="/statics/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet" href="/statics/plugins/datepicker/datepicker3.css">
    <link rel="stylesheet" href="/statics/plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet" href="/statics/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet" href="/statics/plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet" href="/statics/plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet" href="/statics/plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet" href="/statics/plugins/select2/select2.css">
    <link rel="stylesheet" href="/statics/plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet" href="/statics/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet" href="/statics/plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet" href="/statics/plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="/statics/css/style.css">
    <link rel="stylesheet" href="/statics/plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet" href="/statics/plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet" href="/statics/plugins/bootstrap-slider/slider.css">
    <link rel="stylesheet" href="/statics/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">
</head>

<body class="hold-transition skin-purple sidebar-mini">

<div class="wrapper">

    <!-- 页面头部 -->
    <jsp:include page="header.jsp"/>
    <!-- 页面头部 /-->

    <!-- 导航侧栏 -->
    <jsp:include page="aside.jsp"/>
    <!-- 导航侧栏 /-->


    <!-- 内容区域 /-->
    <div class="content-wrapper">

        <!-- 内容头部 -->
        <section class="content-header">
            <h1>
                角色管理
                <small>全部角色</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="${pageContext.request.contextPath}/index.jsp"><i
                        class="fa fa-dashboard"></i> 首页</a></li>
                <li><a
                        href="${pageContext.request.contextPath}/role/findAll.do">角色管理</a></li>

                <li class="active">全部角色</li>
            </ol>
        </section>
        <!-- 内容头部 /-->

        <!-- 正文区域 -->
        <section class="content"> <!-- .box-body -->
            <div class="box box-primary">
                <div class="box-header with-border">
                    <h3 class="box-title">列表</h3>
                </div>

                <div class="box-body">

                    <!-- 数据表格 -->
                    <div class="table-box">

                        <!--工具栏-->
                        <div class="pull-left">
                            <div class="form-group form-inline">
                                <div class="btn-group">
                                    <button type="button" class="btn btn-default" title="新建"
                                            onclick="location.href='${pageContext.request.contextPath}/role/toAdd.do'">
                                        <i class="fa fa-file-o"></i> 新建
                                    </button>

                                    <button type="button" class="btn btn-default" title="刷新">
                                        <i class="fa fa-refresh"></i> 刷新
                                    </button>
                                </div>
                            </div>
                        </div>
                        <div class="box-tools pull-right">
                            <div class="has-feedback">
                                <input type="text" class="form-control input-sm"
                                       placeholder="搜索"> <span
                                    class="glyphicon glyphicon-search form-control-feedback"></span>
                            </div>
                        </div>
                        <!--工具栏/-->

                        <!--数据列表-->
                        <table id="dataList"
                               class="table table-bordered table-striped table-hover dataTable">
                            <thead>
                            <tr>
                                <th class="" style="padding-right: 0px"><input
                                        id="selall" type="checkbox" class="icheckbox_square-blue">
                                </th>
                                <th class="sorting_asc">ID</th>
                                <th class="sorting_desc">角色名称</th>
                                <th class="sorting_asc sorting_asc_disabled">描述</th>
                                <th class="text-center">操作</th>
                            </tr>
                            </thead>
                            <tbody>

                            <c:forEach items="${roleList}" var="role">
                                <tr>
                                    <td><input name="ids" type="checkbox"></td>
                                    <td>${role.id }</td>
                                    <td>${role.roleName }</td>
                                    <td>${role.roleDesc }</td>
                                    <td class="text-center">
                                        <a href="${pageContext.request.contextPath}/role/findById.do?id=${role.id}"
                                           class="btn bg-olive btn-xs">详情</a>
                                        <a href="${pageContext.request.contextPath}/role/findRoleByIdAndAllPermission.do?id=${role.id}"
                                           class="btn bg-olive btn-xs">添加角色</a>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                            <!--
                        <tfoot>
                        <tr>
                        <th>Rendering engine</th>
                        <th>Browser</th>
                        <th>Platform(s)</th>
                        <th>Engine version</th>
                        <th>CSS grade</th>
                        </tr>
                        </tfoot>-->
                        </table>
                        <!--数据列表/-->

                    </div>
                    <!-- 数据表格 /-->

                </div>
                <!-- /.box-body -->

                <!-- .box-footer-->
                <div class="box-footer">
                    <div class="pull-left">
                        <div class="form-group form-inline">
                            总共${pages}页，共${page.total} 条数据。 每页
                            <select class="form-control" id="changePageSize" onchange="changePageSize()">
                                <option>${page.size}</option>
                                <option>2</option>
                                <option>3</option>
                                <option>5</option>
                                <option>7</option>
                                <option>10</option>
                                <option>15</option>
                                <option>20</option>
                            </select> 条，当前第${page.current}页
                        </div>
                    </div>

                    <div class="box-tools pull-right">
                        <ul class="pagination">
                            <li>
                                <a href="/role/findAll.do?page=1&size=${page.size}" aria-label="Previous">首页</a>
                            </li>

                            <c:if test="${page.hasPrevious()}">
                                <li><a href="/role/findAll.do?page=${page.current-1}&size=${page.size}">上一页</a>
                                </li>
                                <li>
                                    <a href="/role/findAll.do?page=${page.current-1}&size=${page.size}">${page.current-1}</a>
                                </li>
                            </c:if>
                            <li><a class="btn bg-olive"
                                   href="/role/findAll.do?page=${page.current}&size=${page.size}">${page.current}</a>
                            </li>
                            <c:if test="${page.hasNext()}">
                                <li>
                                    <a href="/role/findAll.do?page=${page.current+1}&size=${page.size}">${page.current+1}</a>
                                </li>
                                <li><a href="/role/findAll.do?page=${page.current+1}&size=${page.size}">下一页</a>
                                </li>
                            </c:if>
                            <li>
                                <a href="/role/findAll.do?page=${pages}&size=${page.size}"
                                   aria-label="Next">尾页</a>
                            </li>
                        </ul>
                    </div>

                </div>
                <!-- /.box-footer-->

            </div>

        </section>
        <!-- 正文区域 /-->

    </div>
    <!-- @@close -->
    <!-- 内容区域 /-->
    <!-- 底部导航 -->
    <jsp:include page="footer.jsp"/>
    <!-- 底部导航 /-->
</div>
<!-- 内容区域 -->

</div>


<script src="/statics/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="/statics/plugins/jQueryUI/jquery-ui.min.js"></script>
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<script src="/statics/plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="/statics/plugins/raphael/raphael-min.js"></script>
<script src="/statics/plugins/morris/morris.min.js"></script>
<script src="/statics/plugins/sparkline/jquery.sparkline.min.js"></script>
<script src="/statics/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="/statics/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script src="/statics/plugins/knob/jquery.knob.js"></script>
<script src="/statics/plugins/daterangepicker/moment.min.js"></script>
<script src="/statics/plugins/daterangepicker/daterangepicker.js"></script>
<script src="/statics/plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
<script src="/statics/plugins/datepicker/bootstrap-datepicker.js"></script>
<script src="/statics/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
<script src="/statics/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script src="/statics/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script src="/statics/plugins/fastclick/fastclick.js"></script>
<script src="/statics/plugins/iCheck/icheck.min.js"></script>
<script src="/statics/plugins/adminLTE/js/app.min.js"></script>
<script src="/statics/plugins/treeTable/jquery.treetable.js"></script>
<script src="/statics/plugins/select2/select2.full.min.js"></script>
<script src="/statics/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<script src="/statics/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
<script src="/statics/plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
<script src="/statics/plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
<script src="/statics/plugins/bootstrap-markdown/js/markdown.js"></script>
<script src="/statics/plugins/bootstrap-markdown/js/to-markdown.js"></script>
<script src="/statics/plugins/ckeditor/ckeditor.js"></script>
<script src="/statics/plugins/input-mask/jquery.inputmask.js"></script>
<script src="/statics/plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
<script src="/statics/plugins/input-mask/jquery.inputmask.extensions.js"></script>
<script src="/statics/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="/statics/plugins/datatables/dataTables.bootstrap.min.js"></script>
<script src="/statics/plugins/chartjs/Chart.min.js"></script>
<script src="/statics/plugins/flot/jquery.flot.min.js"></script>
<script src="/statics/plugins/flot/jquery.flot.resize.min.js"></script>
<script src="/statics/plugins/flot/jquery.flot.pie.min.js"></script>
<script src="/statics/plugins/flot/jquery.flot.categories.min.js"></script>
<script src="/statics/plugins/ionslider/ion.rangeSlider.min.js"></script>
<script src="/statics/plugins/bootstrap-slider/bootstrap-slider.js"></script>
<script src="/statics/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
<script src="/statics/plugins/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>
<script>

    $(document).ready(function () {
        // 选择框
        $(".select2").select2();

        // WYSIHTML5编辑器
        $(".textarea").wysihtml5({
            locale: 'zh-CN'
        });
    });

    // 设置激活菜单
    function setSidebarActive(tagUri) {
        var liObj = $("#" + tagUri);
        if (liObj.length > 0) {
            liObj.parent().parent().addClass("active");
            liObj.addClass("active");
        }
    }

    $(document).ready(function () {
        // 激活导航位置
        setSidebarActive("admin-index");
    });


    /**
     * 当下拉框选择改变时发送分页请求
     * */
    function changePageSize() {
        //获取下拉框的值
        var pageSize = $("#changePageSize").val();
        //向服务器发送请求，改变没页显示条数
        location.href = "/role/findAll.do?page=${page.current}&size=" + pageSize;
    }


    $(document)
        .ready(
            function () {

                // 激活导航位置
                setSidebarActive("admin-datalist");

                // 列表按钮
                $("#dataList td input[type='checkbox']")
                    .iCheck(
                        {
                            checkboxClass: 'icheckbox_square-blue',
                            increaseArea: '20%'
                        });
                // 全选操作
                $("#selall")
                    .click(
                        function () {
                            var clicks = $(this).is(
                                ':checked');
                            if (!clicks) {
                                $(
                                    "#dataList td input[type='checkbox']")
                                    .iCheck(
                                        "uncheck");
                            } else {
                                $(
                                    "#dataList td input[type='checkbox']")
                                    .iCheck("check");
                            }
                            $(this).data("clicks",
                                !clicks);
                        });
            });

</script>
</body>

</html>
