<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>train details</title>
</head>
<body>
<TABLE>
					<thead>
							<tr>
								<th>Sl no</th>
								<th>Hotel Name</th>
								<th>City</th>
								<th>State</th>
								<th>No of Room</th>
								<th>Price per Room</th>
								
							</tr>
						</thead>
						<tbody>
 <c:forEach items="${hotelsInfo}" var="hotel">
  <tr>
    <td>${hotel.slNo}</td>
    <td>${hotel.hotelName}</td>
    <td>${hotel.city}</td>
    <td>${hotel.state}</td>
    <td>${hotel.noOfRooms}</td>
    <td>${hotel.pricePerRoom}</td>
    <td>${hotel.startAmount}</td>
    <td>${hotel.endAmount}</td>
    
     </tr>
</c:forEach>
</tbody>
</TABLE>

</body>
</html>