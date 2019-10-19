<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Kích hoạt tài khoản</title>
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
                        <a href="index.jsp"><img src="assets/images/products/logo.png" style="width: 55%"></a>
                    </div>
                    <p class="notification"> ${message}&nbsp; </p>
                    <form action="active" method="POST">
                        <div class="form-group">
                            <label>
                                <i class="fas fa-terminal"></i>
                            </label>
                            <input type="text" class="form-control" placeholder="Nhập mã kích hoạt" name="txtActiveCode">
                        </div>
                        <div class="form-group">
                            <div class="col">
                                <button type="submit" class="btn btn-sm">
                                    <i class="fas fa-arrow-right mr-1"></i> Xác nhận
                                </button>
                            </div>
                        </div>
                        <div class="form-group mt-3">
                            <div class="col">
                                <a class="link-effect mt-1" href="login.jsp">
                                    <i class="fas fa-sign-in-alt mr-1"></i> Đăng nhập
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
                © 2018-2019 SunCEX.com All Rights Reserved
            </p>
        </footer>

        <!-- jQuery -->
        <script src="js/jquery/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="js/bootstrap/bootstrap.min.js"></script>
    </body>
</html>
