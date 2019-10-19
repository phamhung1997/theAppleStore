<%-- 
    Document   : nav
    Created on : Aug 24, 2018, 7:57:01 PM
    Author     : Shado
--%>

<%@page import="entity.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Account account = (Account) session.getAttribute("currentLoginAccount");
%>
<!-- Nav -->
<nav class="navbar navbar-expand-md bg-light navbar-light">
    <div class="container">
        <a class="mr-4" href="products.jsp"><img src="assets/images/products/logo-thinh.png" style="height:95px !important;"></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="collapsibleNavbar">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="#">HOT</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">NEW</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Giảm giá</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Phụ kiện</a>
                </li>
            </ul>
            <div class="ml-auto">
                <ul class="navbar-nav">
                    <form class="form-inline mr-3" action="search" method="get">
                        <div class="input-group">
                            <input type="text" class="form-control" name="txtSearch" placeholder="Tìm kiếm">
                            <div class="input-group-append">
                                <button type="submit" name="btn-search" class="input-group-text"><i class="fas fa-search fa-fw icon-color"></i></button>
                            </div>
                        </div>
                    </form>
                    <li class="nav-item mr-2">
                        <a class="nav-link" href="cart.jsp">
                            <i class="fas fa-cart-arrow-down fa-fw" style="font-size: 18px;"></i> Giỏ hàng
                        </a>
                    </li>
                <%
                    if(account != null){
                %>    
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="fas fa-user mr-2"></i><%=account.getEmail()%>
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="#">Thông tin cá nhân</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="logout">Đăng xuất</a>
                        </div>
                    </li>
                <%
                    } else {
                %>    
                    <li class="nav-item">
                        <a class="nav-link" href="register.jsp"><i class="fas fa-edit mr-1"></i>Đăng ký</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="login.jsp"><i class="fas fa-user-plus mr-1"></i>Đăng nhập</a>
                    </li>
                <%
                    }
                %>  
                </ul>
            </div>
        </div>
    </div>
</nav>