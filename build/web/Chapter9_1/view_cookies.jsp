<%-- 
    Document   : view_cookies
    Created on : Oct 26, 2021, 7:40:46 PM
    Author     : An Le
--%>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>View all cookies</title>
    <link rel="stylesheet" href="./Chapter9_1/downloadStyle.css" type="text/css"/>
</head>
<body>

<h1>Cookies</h1>

<p>Here's a table with all of the cookies that this 
browser is sending to the current server.</p>

<table>
  <tr>
    <th>Name</th>
    <th>Value</th>
  </tr>
  <c:forEach var="c" items="${cookie}">
  <tr>
    <td><c:out value="${c.value.name}" /></td>
    <td><c:out value="${c.value.value}" /></td>
  </tr>
  </c:forEach>  
</table>

<p><a href="download9?action=viewAlbums">View list of albums</a></p>

<p><a href="download9?action=deleteCookies">Delete all persistent cookies</a></p>

</body>
</html>
