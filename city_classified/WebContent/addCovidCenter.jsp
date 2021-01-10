 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
	<%@include file="css/style.css" %>
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

<title>Add Covid Center</title>
</head>
<div class="w-50 m-auto text-center p-4 rounded shadow" class="row container text-center m-auto">

<body>
<h2 class = "text-center pt-4 mt-4">Add Covid Center</h2>
<div align="center">
<form action = "admin">
<input type="hidden" name="requestAction" value="addCovid">
<div class="w-50 m-auto m-auto">

<table>
	<!-- <tr>
		<td>City ID: </td>
			<select id="cityId" name = "cityId">
			<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">
  						<option value=12>pune</option>
  						<option value=23 selected="selected">delhi</option>
 						 <option value=34>mumbai</option>
 					</label>	 </div>
</select>
	</tr> -->
	
	<tr>
		<td>City Id: </td>
		<td><input type = "text" name = "cityId"/></td>
	</tr>
	
	
	<tr>
		<td>Hospital Id: </td>
		<td><input type = "text" name = "hospitalId"/></td>
	</tr>
	<tr>
		<td>Hospital Name: </td>
		<td><input type = "text" name = "hospitalName"/></td>
	</tr>
	<tr>
		<td>Number of Beds: </td>
		<td><input type = "text" name = "noOfBeds"/></td>
	</tr>
	<tr>
		<td>Hospital Phone Number: </td>
		<td><input type = "text" name = "hospitalPhoneNumber"/></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		
		
		<td><input type = "submit" class="btn btn-success mb-3" value = "addCovid" name="addCovid" /></td>
	</tr>
</table>
</div>
</form>
</body>
</html>