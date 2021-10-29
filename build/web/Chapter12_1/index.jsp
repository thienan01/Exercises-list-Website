<%-- 
    Document   : index
    Created on : Oct 28, 2021, 11:11:13 PM
    Author     : An Le
--%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Excute query</title>
    <link rel="stylesheet" href="Chapter12_1/style.css" type="text/css"/>
</head>
<body>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${sqlStatement == null}">
    <c:set var="sqlStatement" value="select * from User" />
</c:if>
    
<h1>The SQL Gateway</h1>
<p>Enter an SQL statement and click the Execute button.</p>

<p><b>SQL statement:</b></p>
<form action="sqlGateway" method="post">
    <textarea name="sqlStatement" cols="60" rows="8">${sqlStatement}</textarea>
    <input type="submit" value="Execute">
</form>

<p><b>SQL result:</b></p>
${sqlResult}
<br>
<a href="/homework.html">Return to list of exercises</a>
</body>
</html>
