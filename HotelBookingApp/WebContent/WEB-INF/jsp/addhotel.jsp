<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Hotel</title>
</head>
<body>
<form action="savehotel" method="post">
<label>SL No : </label>
<input type="number" name="slno" placeholder="Enter sl no" required="required"><br><br>
<label>Hotel Name : </label>
<input type="text" name="hname" placeholder="Enter hotel name" required="required"><br><br>
<label>City : </label>
<input type="text" name="city" placeholder="Enter city" required="required"><br><br>
<label>State : </label>
<input type="text" name="state" placeholder="Enter state" required="required"><br><br>
<label>No Of Rooms : </label>
<input type="number" name="noOfRooms" placeholder="Enter no of rooms" required="required"><br><br>
<label>Price Per Room: </label>
<input type="number" name="pricePerRoom" placeholder="Enter price" required="required"><br><br>
<label>Starting Amount: </label>
<input type="number" name="startAmount" placeholder="Enter sAmount" required="required"><br><br>
<label>End Amount: </label>
<input type="number" name="endAmount" placeholder="Enter eAmount" required="required"><br><br>
<input type="submit" value="submit">
<input type="reset">
</form>
</body>
</html>