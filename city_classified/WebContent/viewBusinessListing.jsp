<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List, com.zensar.bean.* "%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%List<BusinessListing> listOfBusinessListing =(List<BusinessListing>) request.getAttribute("listOfBusinessListing"); %>

<body>
<form action="viewBusinessListing" method="post">
<input type="hidden" name="requestAction" value="viewBusinessListing" />
<table border="1">


<td>City id</td>
						<select id="cityId" name = "cityId">
  						<option value=12>pune</option>
  						<option value=23 selected="selected">delhi</option>
 						 <option value=34>mumbai</option>
</select>
</id>
<td>category Id</td>
						<select id="categoryId" name = "categoryId">
  						<option value=1>covidCenter</option>
  						<option value=2 selected="selected">School</option>
 						 <option value=3>Hotel</option>
</select>
</id>

<tr>
 <th> Listing Id:</th>
  <th>Business Name:</th>
  <th>Business Description:</th>
  <th>Address:</th>
  <th>City Id:</th>
   <th>Category Id:</th>
  </tr>
  <%for(BusinessListing businessListing :listOfBusinessListing){ %>
<tr>
<td><%=businessListing.getListingId()%></td>
<td><%=businessListing.getBusinessName()%></td>
<td><%=businessListing.getBusinessDiscription()%></td>
<td><%=businessListing.getAddress()%></td>
<td><%=businessListing.getCityId()%></td>
<td><%=businessListing.getCategoryId()%></td>
<td>
</td>
</tr>
<%} %>
</table>
 
<br><br>
<a href="logout.jsp">Logout</a>
</form>
</body>
</html>



