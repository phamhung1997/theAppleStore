<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check out</title>
        <!-- Custom Fonts -->
        <script defer src="font-awesome/js/fontawesome-all.js"></script>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css">
        <!-- Custom CSS -->
        <link rel="stylesheet" href="css/common.css">

        <style>
            .btn-number{
                padding: 2px 8px;
            }
        </style>
    </head>
    <body>
        <%@include file="common/nav.jsp"%>

        <div class="container mt-5">
            <h4>Danh sách sản phẩm:</h4>
            <table class="table table-striped mt-3">
                <thead>
                    <tr>
                        <th scope="col">STT</th>
                        <th scope="col">Tên sản phẩm</th>
                        <th scope="col">Giá</th>
                        <th scope="col">Số lượng</th>
                        <th scope="col">Tổng</th>
                        <th scope="col">Action</th>
                    </tr>
                </thead>
                <tbody>
                    <%int no = 1;
                        double price = 0;%>
                    <c:if test="${listOrder.size() == 0}">
                        <tr>
                            <td colspan="6">
                                Không có sản phẩm nào trong giỏ hàng.
                            </td>
                        </tr>
                
                    </c:if>
                    <c:if test="${listOrder.size() > 0}">
                        <c:forEach items="${listOrder}" var="i">
                            <tr>
                                <th scope="row"><%=no++%></th>
                                <td>${i.name}</td>
                                <td>${i.unitPrice}<sup>$</sup></td>
                                <td>
                                    <a class="btn-number" href="subProduct?productId=${i.productId}">-</a>
                                    ${i.quantity}
                                    <a class="btn-number" href="plusProduct?productId=${i.productId}">+</a>
                                </td>
                                <td>${i.unitPrice * i.quantity}<sup>$</sup></td> 
                                <td>
                                    <a href="removeProduct?productId=${i.productId}">Xóa</a>
                                </td>
                            </tr>
                        </c:forEach> 
                    </c:if>
                </tbody>
            </table>
            <a href="removeCart" class="btn btn-danger float-right mt-3">Xóa giỏ hàng</a>
            <a href="filter" class="btn btn-success float-right mt-3 mr-2">Tiếp tục</a>
        </div>
    </body>
</html>
