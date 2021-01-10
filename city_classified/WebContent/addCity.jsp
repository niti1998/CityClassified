<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

<title>Add City Form</title>
</head>
<div class="w-50 m-auto text-center p-4 rounded shadow" class="row container text-center m-auto">

<body>
<div class="w-50 m-auto text-center">
<h2 class="text-center pt-4 mt-4">Add City</h2>
<form action = "admin">
<input type="hidden" name="requestAction" value="add">
<div class="w-50 m-auto m-auto">

	<div class="mb-3">
	<label for="exampleFormControlInput1" class="form-label">City ID:</label>
		  <input type="text" class="form-control" name="cityId" required />
	</div>
	<div class="mb-3">
	<label for="exampleFormControlInput1" class="form-label">City Name:</label>
		  <input type="text" class="form-control" name="cityName" required />
	</div>
	<div class="col-auto">

		<button type="submit" class="btn btn-success mb-3" name="addCity" value="addCity">Add City</button>
	</div>
</div>
</form>
</body>
</html>