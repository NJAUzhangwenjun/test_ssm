<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>微气候监测系统</title>
    <meta name="description" content="微气候监测系统">
    <meta name="keywords" content="微气候监测系统">
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">


    <link rel="stylesheet"
          href="/statics/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="/statics/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet"
          href="/statics/plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet"
          href="/statics/plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet"
          href="/statics/plugins/iCheck/square/blue.css">
</head>

<body class="hold-transition login-page" style="background-color:#5e5d68;">
<div class="login-box">
    <div class="login-logo">
        <a href="/main/toMain.do"><b>NJAU</b>微气候监测系统</a>
    </div>
    <!-- /.login-logo -->
    <div class="login-box-body">
        <p class="login-box-msg">登录系统</p>

        <form action="/login.do" method="post">
            <div class="form-group has-feedback">
                <input type="text" name="username" class="form-control"
                       placeholder="用户名"> <span
                    class="glyphicon glyphicon-envelope form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input type="password" name="password" class="form-control"
                       placeholder="密码"> <span
                    class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div class="row">
                <div class="col-xs-8">
                    <div class="checkbox icheck">
                        <label><input type="checkbox"> 记住 下次自动登录</label>
                    </div>
                </div>
                <!-- /.col -->
                <div class="col-xs-4">
                    <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
                </div>
                <!-- /.col -->
            </div>
        </form>

        <a href="#">忘记密码</a><br>


    </div>
    <!-- /.login-box-body -->
</div>
<!-- /.login-box -->

<!-- jQuery 2.2.3 -->
<!-- Bootstrap 3.3.6 -->
<!-- iCheck -->
<script
        src="/statics/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script
        src="/statics/plugins/bootstrap/js/bootstrap.min.js"></script>
<script
        src="/statics/plugins/iCheck/icheck.min.js"></script>
<script>
    $(function () {
        $('input').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass: 'iradio_square-blue',
            increaseArea: '20%' // optional
        });
    });
</script>
</body>

</html>
