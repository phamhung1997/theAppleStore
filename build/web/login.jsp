<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Đăng nhập</title>
        <!-- Custom Fonts -->
        <script defer src="font-awesome/js/fontawesome-all.js"></script>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css">
        <!-- Custom CSS -->
        <link rel="stylesheet" type="text/css" href="css/form.css">
    </head>
    <body>
        <div id="intro">
            <div class="middle signin">
                <div class="login-panel">
                    <div class="logo text-center">
                        <a href="index.jsp"><img src="assets/images/products/logo-thinh.png" style="width: 55%"></a>
                    </div>
                    <p class="notification"> ${message}&nbsp; </p>
                    <form action="login" method="post">
                        <div class="form-group">
                            <label>
                                <i class="far fa-envelope"></i>
                            </label>
                            <input type="email" class="form-control" placeholder="Nhập Email" name="txtEmail">
                        </div>
                        <div class="form-group">
                            <label>
                                <i class="fas fa-key"></i>
                            </label>
                            <input type="password" class="form-control" placeholder="Nhập mật khẩu" name="txtPassword">
                        </div>
                        <div class="form-group">
                            <div class="col">
                                <label class="custom-control custom-checkbox">
                                    <input type="checkbox" class="custom-control-input" id="login-remember-me" name="login-remember-me">
                                    <span class="custom-control-indicator"></span>
                                    <span class="custom-control-description">Remember Me</span>
                                </label>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col">
                                <button type="submit" class="btn btn-sm">
                                    <i class="fas fa-sign-in-alt mr-1"></i> Đăng nhập
                                </button>
                            </div>
                        </div>
                        <div class="form-group" style="margin-top: 10px;">
                            <div class="col">
                                <a class="link-effect mt-1 mr-1" href="reminder_password.jsp">
                                    <i class="fas fa-lock mr-1" aria-hidden="true"></i> Quên mật khẩu?
                                </a>
                                <a class="link-effect mt-1 float-right" href="register.jsp">
                                    <i class="fas fa-user-plus mr-1"></i> Đăng ký
                                </a>
                            </div>
                        </div>
                    </form>

                </div>
            </div>
        </div>

        <footer>
            <p>
                © 2019 SE1304 PRJ321 Đăng Tùng Thịnh
            </p>
        </footer>
    </body>
</html>
