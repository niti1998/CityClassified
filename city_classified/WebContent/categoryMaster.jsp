<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add City Form</title>
</head>
<body>
<h2>Add city</h2>
<div align="center">
<form action = "addCategoryMaster">
<input type="hidden" name="requestAction" value="addCategoryMaster">

<table>
	<tr>
		<td>Category ID: </td>
		<td><input type = "text" name = "categoryId"/></td>
	</tr>
	<tr>
		<td>Category Name: </td>
		<td><input type = "text" name = "categoryName"/></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td><input type = "submit" value = "Add Category"/></td>
	</tr>
</table>
</body>
</html>