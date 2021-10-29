<%-- 
    Document   : user
    Created on : Oct 29, 2021, 10:25:48 PM
    Author     : An Le
--%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Update user</title>
    <link rel="stylesheet" href="Chapter12_2/style.css" type="text/css"/>
</head>
<body>
    <h1>Update User</h1>
    <p>NOTE: You can't update the email address.</p>
    <form action="userAdmin" method="post">
        <input type="hidden" name="action" value="update_user">        
        <label class="pad_top">Email:</label>
        <input type="email" name="email" value="${user.email}" readonly><br>
        <label class="pad_top">First Name:</label>
        <input type="text" name="firstName" value="${user.firstName}" 
               required><br>
        <label class="pad_top">Last Name:</label>
        <input type="text" name="lastName" value="${user.lastName}"  
               required><br>        
        <label>&nbsp;</label>
        <input type="submit" value="Update" class="margin_left">
    </form>
</body>
</html>
