<%@page import="entity.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="/WEB-INF/tlds/controller" prefix="controller" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sản phẩm</title>
        <!-- Custom Fonts -->
        <script defer src="font-awesome/js/fontawesome-all.js"></script>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css">
        <!-- Custom CSS -->
        <link rel="stylesheet" href="css/common.css">
        <link rel="stylesheet" href="css/products.css">
    </head>
    <body>
        <%@include file="common/nav.jsp"%>

        <!-- Cover -->
        <div id="main-contain" class="container">
            <div class="row">
                <div class="col-md-3">
                    <div class="left-side">
                        <div class="row title">
                            <div class="col-md-12">
                                <h6>Danh mục sản phẩm</h6>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="side-nav">
                                    <ul class="navbar-nav ml-auto">
                                        <li class="nav-item">
                                            <a class="nav-link active" href="filter">
                                                <i class="far fa-circle fa-fw fa-xs mg-bottom-1 mr-2"></i> Tất cả 
                                            </a>
                                        </li>
                                        <controller:Controller className="client.services.CategoryService" 
                                                               methodName="getCategoris" returnedAttribute="listCategory" /> 
                                        <c:forEach items="${listCategory}" var="i">
                                            <li class="nav-item">
                                                <a class="nav-link" href="filter?categoryId=${i.id}">
                                                    <i class="far fa-circle fa-fw fa-xs mg-bottom-1 mr-2"></i> ${i.category}
                                                </a>
                                            </li>
                                        </c:forEach>                                                                           
                                    </ul>
                                </div>
                            </div>
                        </div>

                        <div class="row title mt-4">
                            <div class="col-md-12">
                                <h6>Khoảng giá</h6>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="side-nav">
                                    <ul class="navbar-nav ml-auto">
                                        <li class="nav-item">
                                            <a class="nav-link active" href="filter">
                                                <i class="far fa-circle fa-fw fa-xs mg-bottom-1 mr-2"></i> Tất cả 
                                            </a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="filter?min=1&max=1000">
                                                <i class="far fa-circle fa-fw fa-xs mg-bottom-1 mr-2"></i> Dưới 1000<sup>$</sup>
                                            </a>
                                        </li>    
                                        <li class="nav-item">
                                            <a class="nav-link" href="filter?min=1000&max=2000">
                                                <i class="far fa-circle fa-fw fa-xs mg-bottom-1 mr-2"></i> 1000<sup>$</sup> - 2000<sup>$</sup>
                                            </a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="filter?min=2000&max=3000">
                                                <i class="far fa-circle fa-fw fa-xs mg-bottom-1 mr-2"></i> 2000<sup>$</sup> - 3000<sup>$</sup>
                                            </a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="filter?min=3000&max=10000">
                                                <i class="far fa-circle fa-fw fa-xs mg-bottom-1 mr-2"></i> Trên 3000<sup>$</sup>
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-9">
                    <div class="right-side">
                        <div class="row title">
                            <div class="col-md-12">
                                <h6>
                                    Sản phẩm
                                    <span class="float-right sort" style="font-size: 1rem;">
                                        Sắp xếp giá:
                                        <a href=""><i class="fas fa-sort-amount-up ml-2 mr-2"></i></a>
                                        <a href=""><i class="fas fa-sort-amount-down"></i></a>
                                    </span>
                                </h6>
                            </div>
                        </div>

                        <div class="row mt-2">
                            <controller:Controller className="client.services.ProductService" 
                                                   methodName="getProductsByCategory" returnedAttribute="listProduct" />  

                            <c:if test="${listProduct.size() == 0}">
                                <div class="col-12">
                                    <h5 class="text-center">Không tìm thấy sản phẩm nào.</h5>
                                </div>
                            </c:if>
                            <c:forEach items="${listProduct}" var="i">
                                <c:if test="${i.status != 4}">
                                    <div class="col-6 col-md-3 mb-4">
                                        <div class="product">
                                            <c:if test="${i.status == 2}">
                                                <div class="status">
                                                    <img src="assets/images/icon-sale.png" alt="icon-sale">
                                                </div>
                                            </c:if>
                                            <div class="img">
                                                <a href="">
                                                    <img src="assets/images/products/${i.imageLink}" alt="${i.imageLink}">                                                           
                                                </a>
                                                <div class="overlay">
                                                    <p>
                                                        <a href="addtocart?id=${i.id}">
                                                            <i class="fas fa-cart-plus fa-fw mr-1" style="font-size: 15px;"></i> Thêm vào giỏ
                                                        </a>
                                                    </p>
                                                </div>
                                            </div>
                                            <div class="description text-center">
                                                <h6><a href="product/detail?id=${i.id}">${i.name}</a></h6>

                                                <p>${i.price}<sup>$</sup></p>
                                            </div>
                                        </div>
                                    </div>
                                </c:if> 
                            </c:forEach> 
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </body>
</html>
