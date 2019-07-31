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
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                error 错误页面
            </h1>

            <ol class="breadcrumb">
                <li><a href="/index.jsp"><i class="fa fa-dashboard"></i> 首页</a></li>
                <li class="active">error 错误</li>
            </ol>

        </section>

        <!-- Main content -->
        <section class="content">
            <div class="error-page">
                <h2 class="headline text-yellow"> error</h2>

                <div class="error-content">
                    <h3><i class="fa fa-warning text-yellow"></i> Oops! 页面没有找到.</h3>

                    <p>
                        没有找到你请求的页面, 你可以 <a href="/index.jsp">返回到首页</a>
                    </p>

                    <div class="box-tools text-center">
                        <button type="button" class="btn bg-default"
                                onclick="history.back(-1);">返回上一页
                        </button>
                    </div>
                </div>
                <!-- /.error-content -->
            </div>
            <!-- /.error-page -->
        </section>
        <!-- /.content -->
    </div>


    <!-- 内容区域 -->

    <!-- 底部导航 -->
    <jsp:include page="footer.jsp"/>
    <!-- 底部导航 /-->
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

    $(document).ready(function() {
        // 选择框
        $(".select2").select2();

        // WYSIHTML5编辑器
        $(".textarea").wysihtml5({
            locale : 'zh-CN'
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

    $(document).ready(function() {
        // 激活导航位置
        setSidebarActive("admin-index");
    });
</script>
</body>

</html>