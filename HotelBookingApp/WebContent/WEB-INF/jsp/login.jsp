<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form action="logindata" method="post">
<label>UserName : </label>
<input type="text"  name="username"required="required" placeholder="Enter User Name"><br><br>
<label>Password : </label>
<input type="password" name="pswd" required="required" placeholder="Enter password"><br><br>
<input type="submit" value="Login">
<input type="reset">
</form>
</body>
</html>