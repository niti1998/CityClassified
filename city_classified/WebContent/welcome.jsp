<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
	<%@include file="css/style.css" %>
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

<head>
<style>

img:hover
{
opacity:1.0;
filter:alpha(opacity=100); /* For IE8 and earlier */
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<div class="w-50 m-auto text-center p-4 rounded shadow" class="row container text-center m-auto">

<body>
<center>
<h2 class="text-center pt-4 mt-4">Welcome to our Application</h2>
</center>
<center>
<a class="btn btn-outline-primary text-dark col-md-2 m-auto" href="login.jsp">ADMIN</a>
</center>
<br>
<br>
<center>

<a class="btn btn-outline-primary text-dark col-md-2 m-auto" href="user?requestAction=userViewAll">View City Classified</a>

</center>
</body>
</div>
</html>