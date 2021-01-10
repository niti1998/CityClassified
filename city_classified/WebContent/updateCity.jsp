<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.zensar.bean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
	<%@include file="css/style.css" %>
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<% City city = (City)request.getAttribute("city");%>
<% CovidCenter cc = (CovidCenter)request.getAttribute("cc");%>
<body>
<h2>Updated City and Center Details</h2>
<form action="admin" method="post">
<input type="hidden" name="requestAction" value="update" />
<table>
<tr>
<td>City:</td>
<td>
<select name="city">
<option value="Pune" label="Pune" <%if(city.getCityName().equalsIgnoreCase("Pune")){ %>selected<%} %> />
<option value="Mumbai" label="Mumbai" <%if(city.getCityName().equalsIgnoreCase("Mumbai")){ %>selected<%} %>/>
<option value="Delhi" label="Delhi" <%if(city.getCityName().equalsIgnoreCase("Delhi")){ %>selected<%} %>/>
</select>
</td>
 </tr>
 <tr>
<td>Hopsital Id:</td>
<td><input type="text" name="HospitalId" value='<%=cc.getHospitalId()%>'/></td>
</tr>
<tr>
<td>Hospital Name:</td>
<td><input type="text" name="HospitalName" value='<%=cc.getHospitalName() %>'/></td>
</tr>
<tr>
<td>No of Beds:</td>
<td><input type="text" name="NoOfBeds" value='<%=cc.getNoOfBeds() %>'/></td>
</tr>
<tr>
<td>Contact:</td>
<td><input type="text" name="HospPhoneNo" value='<%=cc.getHospitalPhoneNumber() %>'/></td>
</tr>
 
 <tr>
   <td> <input type="submit" value="Update City and Centers" name="updateCity" value="updateCity"/></td>
   </tr>
</table>
<br><br>
<a href="logout.jsp">LOGOUT</a>
</form>
</body>
</html>