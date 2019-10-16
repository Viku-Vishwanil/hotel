<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Page</title>
</head>
<body>
<form action="searchhotel" method="post">
<label>Start Amount : </label>
<input type="text" name="sAmount" placeholder="Enter Amount" required="required"><br><br>
<label>End Amount : </label>
<input type="text" name="eAmount" placeholder="Enter Amount" required="required"><br><br>
<input type="submit" value="Search">
<input type="reset">
</form>
</body>
</html>