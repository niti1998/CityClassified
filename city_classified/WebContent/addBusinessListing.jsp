<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.util.*, com.zensar.bean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Covid Center</title>
</head>
<body>
<h2>Add Covid Center</h2>
<div align="center">
<form action = "addBusinessListing">
<input type="hidden" name="requestAction" value="addBusinessListing">

<% List<City> listOfAllCities = (List<City>)request.getAttribute("listOfAllCities");%>
<table>
	<tr>
		<td>Listing ID: </td>
		<td><input type = "text" name = "listingId"/></td>
	</tr>
	<tr>
		<td>Business Name: </td>
		<td><input type = "text" name = "businessName"/></td>
	</tr>
	<tr>
		<td>Business Description : </td>
		<td><input type = "text" name = "businessDiscription"/></td>
	</tr>
	<tr>
		<td>Address: </td>
		<td><input type = "text" name = "address"/></td>
	</tr>
	<tr>
	<!-- 	<td>City ID: </td>
		<td><input type = "text" name = "cityId"/></td>
		 -->
		 
		 <td>City Name:</td>
				<td>
						<select id="cityId" name = "cityId">
  						<option value=12>pune</option>
  						<option value=34 selected="selected">mumbai</option>
 						 <option value=23>delhi</option>
</select>
						</td>
		 
		
	</tr>
	
	<tr>
		<td>Category ID: </td>
<td>
						<select id="cityId" name = "categoryId">
  						<option value=1>covidCenter</option>
  						<option value=2 selected="selected">School</option>
 						 <option value=3>Hotel</option>
</select>
						</td>	</tr>
	<tr>
		<td>&nbsp;</td>
		<td><input type = "submit" value = "Add Business Listing"/></td>
	</tr>
</table>
</form>
</body>
</html>