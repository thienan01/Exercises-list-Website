<%-- 
    Document   : thanks.jsp
    Created on : Oct 21, 2021, 6:07:38 PM
    Author     : An Le
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thanks</title>
        <link rel="stylesheet" href="Chapter5/style.css">
    </head>
    <body>
        <h1>Thank for joining our email list</h1>
        
        <p>Here are information that you entered:</p>
        
        <label>Email:</label>
        <span>${user.email}</span><br>
        
        <label>Fist Name:</label>
        <span>${user.firstName}</span><br>
        
        <label>Last Name:</label>
        <span>${user.lastName}</span><br>
        
        <p>To enter another email address, click on back button shown below</p>
        
        <form action="emailList" method="get">
            <input type="hidden" name="action" value="join">
            <input type="submit" value="Return">
        </form><br>
        <form action="Category" method="get">
            <input type="hidden" name="cate" value="returnDashboard">
            <input type="submit" value="Return to dashboard">
        </form>
        
    </body>
</html>
