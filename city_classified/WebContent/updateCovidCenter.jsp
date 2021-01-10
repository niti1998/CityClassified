<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.zensar.bean.*,java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
	<%@include file="css/style.css" %>
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<% CovidCenter covidCenter = (CovidCenter)request.getAttribute("covidCenter");%>
<body>
<h2>Updated Employee Form</h2>
<form action="updateCovidCenter" method="post">
<input type="hidden" name="requestAction" value="updateCovidCenter" />
<table>
<tr>
<td>city Id:</td>
<td><input type="text" name="CityId" value=<%=covidCenter.getCityId()%>></td>
</tr>
<td>Hospital Id:</td>
<td><input type="text" name="HospitalId" value=<%=covidCenter.getHospitalId()%>></td>
</tr>
<tr>
<td>Hospital Name:</td>
<td><input type="text" name="HospitalName" value=<%=covidCenter.getHospitalName() %>></td>
</tr>
<tr>
<td>No of Beds:</td>
<td><input type="text" name="NoOfBeds" value=<%=covidCenter.getNoOfBeds() %>></td>
</tr>
<tr>
<td>Contact:</td>
<td><input type="text" name="HospPhoneNo" value=<%=covidCenter.getHospitalPhoneNumber() %>></td>
</tr>

 <tr>
   <td> <input type="submit" value="Update Covid Center Details"/></td>
   </tr>
</table>
<br><br>
<a href="logout.jsp">LOGOUT</a>
</form>
</body>
</html>