<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
	<%@include file="css/style.css" %>
</style>


<style>
/* unvisited link */
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 4px solid #f1f1f1;}

a:link {
  color: red;
}

/* visited link */
a:visited {
  color: green;
}

/* mouse over link */
a:hover {
  color: blue;
}

/* selected link */
a:active {
  color: red;
}
</style>
</head>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

</head>
<div class="w-50 m-auto text-center p-4 rounded shadow" class="row container text-center m-auto">

<body >
<h2 class="text-center pt-4 mt-4">Welcome  to our  Application</h2>
<div class="row container text-center m-auto">
<a class="btn btn-outline-primary text-dark col-md-2 m-auto" href="addCity.jsp">Add a New City</a>

<a class="btn btn-outline-primary text-dark col-md-2 m-auto" href="admin?requestAction=viewAll">View City Classified</a>

<a class="btn btn-outline-primary text-dark col-md-2 m-auto" href="addCovidCenter.jsp">Add a Covid Center</a>
</div>
<%-- <a href="viewCovidCenter.jsp">CLick here to view Covid Center</a>
<br>
--%>
</div>
</body>
</html>