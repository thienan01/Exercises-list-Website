<%-- 
    Document   : index
    Created on : Oct 28, 2021, 4:47:17 PM
    Author     : An Le
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>CD List</title>
    <link rel="stylesheet" href="Chapter9_2/style.css" type="text/css"/>
</head>
<body>

<h1>CD list</h1>
<table>
    <tr>
        <th>Description</th>
        <th class="right">Price</th>
        <th>&nbsp;</th>
    </tr>

    <c:forEach var="product" items="${products}">
        <tr>
            <td>${product.description}</td>
            <td class="right">$<c:out value="${product.price}" /></td>
            <td>
                <form action="cart92" method="post">
                    <input type="hidden" name="productCode" value="<c:out value='${product.code}'/>">
                    <input type="submit" value="Add To Cart">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<a href="Category?cate=returnDashboard">Return to list of exercises</a>
</body>

</html>
