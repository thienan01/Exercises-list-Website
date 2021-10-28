<%-- 
    Document   : index
    Created on : Oct 28, 2021, 5:46:01 PM
    Author     : An Le
--%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Join email list</title>
    <link rel="stylesheet" href="Chapter5_2/style.css" type="text/css"/>
</head>
<body>
<h1>Join our email list</h1>
<p>To join our email list, enter your name and
    email address below.</p>
<p><i>${message}</i></p>
<form action="testServlet" method="post">
    <input type="hidden" name="action" value="add">
    <label class="pad_top">Email:</label>
    <input type="email" name="email" value="${user.email}"><br>
    <label class="pad_top">First Name:</label>
    <input type="text" name="firstName" value="${user.firstName}"><br>
    <label class="pad_top">Last Name:</label>
    <input type="text" name="lastName" value="${user.lastName}"><br>
    <label>&nbsp;</label>
</form>
<form action="testServlet" method="post">
    <input type="submit" value="Join Now (Post Method)" class="margin_left">
    
</form>
<form action="testServlet" method="get">
    <label>&nbsp;</label>
    <input type="submit" value="Join Now (Get Method)" id="get">
</form><br>
<a href="Category?cate=returnDashboard">Return to list of exercises</a>
</body>
</html>
