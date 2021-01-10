<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.zensar.bean.*, java.util.List" %>
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
<body class="container">
<h2>List of All Cities</h2>
<%List<City> listOfAllCities=(List<City>) request.getAttribute("listOfAllCities"); %>

<table border="1" class="table w-50 m-auto">
<tr>
  <th>City ID</th>
  <th>City Name</th>
  <th>Action</th>
</tr>
    <%for(City city:listOfAllCities){ %>
  <tr>
      <td><%=city.getCityId() %></td>
      <td><%=city.getCityName() %></td>
      
      <td>
       <a class="btn btn-warning" href="user?requestAction=usercovidCenterDetails&cityId=<%=city.getCityId()%>">details</a>
      </td>
     
  </tr>
  <%}%>
</table>
</body>
</html>