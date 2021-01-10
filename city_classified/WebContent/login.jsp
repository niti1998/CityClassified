<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
	<%@include file="css/style.css" %>
	
</style>


<head>
<meta   name="viewport" content="width=device-width, initial-scale=1" >
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
	
<style >
</style>
</head>
<body class="container m-auto" >

<%
	if(null != request.getAttribute("errorMessage")){
%>
<div class="alert alert-danger w-50 m-auto mb-4 alert-dismissible fade show" role="alert"><%=request.getAttribute("errorMessage") %><button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button></div>
<%
	}
%>

<div class="w-50 m-auto text-center p-4 rounded shadow" class="row container text-center m-auto">
	<h2>Login form</h2>
	<form action="admin">
		<div class="mb-3">
		  <label for="exampleFormControlInput1" class="form-label">Username</label>
		  <input type="text" class="form-control" name="userName" required placeholder="Enter Username">
		</div>
		<div class="mb-3">
		  <label for="exampleFormControlInput1" class="form-label">Password</label>
		  <input type="password" class="form-control" placeholder="Enter Password" name="password" required>
		</div>
		<input type="hidden" name="requestAction" value="login"/>
		<div class="col-auto">
		    <button type="submit" class="btn btn-success mb-3" name="requestAction" value="login">Login</button>
		  </div>	
		
	</form>
</div>

<%--<form action="login" class="border rounded"  >
<input type="hidden" name="requestAction" value="login"/>
  <div class=" " >
 
   
  <img src="./WebContent/image/img_avatar2.png" alt="Avatar" class="">

  </div>

  <div class="">
    <label for="userName"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="userName" required>

    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
        
    <button type="submit">Login</button>
    
    <h3 style="color:red ">
		<%
			if(null != request.getAttribute("errorMessage")){
		%>
		<%=request.getAttribute("errorMessage") %>
		<%
			}
		%>
  </div>

 </form>--%>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>

</body>
</html>
