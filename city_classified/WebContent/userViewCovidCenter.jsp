<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List, com.zensar.bean.* "%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
	<%@include file="css/style.css" %>
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

</head>
<%List<CovidCenter> listOfAllCovidCenter =(List<CovidCenter>) request.getAttribute("listOfAllCovidCenter"); %>

<body class="container">
<h2 class="text-center pt-4 mt-4">Covid Centers</h2>
<form action="user" class="w-50 m-auto" method="post">
<input type="hidden" name="usercovidCenterDetails" value="usercovidCenterDetails" />
<table border="1" class="table  m-auto">
<tr>
 <th> City ID:</th>
  <th>Hospital Id:</th>
  <th>Hospital Name:</th>
  <th>No of Beds:</th>
  <th>Telephone:</th>
  <th>Actions:</th>
  </tr>
  <%for(CovidCenter covidCenter :listOfAllCovidCenter){ %>
<tr>
<td><%=covidCenter.getCityId()%></td>
<td><%=covidCenter.getHospitalId()%></td>
<td><%=covidCenter.getHospitalName()%></td>
<td><%=covidCenter.getNoOfBeds()%></td>
<td><%=covidCenter.getHospitalPhoneNumber()%></td>
<td>
</td>
</tr>
<%} %>
</table>
</form>
</body>
</html>



