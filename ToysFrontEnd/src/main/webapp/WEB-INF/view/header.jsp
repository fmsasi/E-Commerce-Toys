<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 

<title>Header</title>
</head>
<body>
<h2 align="center">My First Website Page in E-commerce Project</h2>
<nav class="navbar navbar-inverse">
  <div class="container">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">TeddyBear</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="">Home</a></li> 
      <li><a href="about">About us</a></li>
      <li><a href="contactus">Contact us</a></li>
      <%--<li class="active"><a href="<c:url value='/'></c:url>">Home</a></li> 
       <li><a href="<c:url value='about'></c:url>">About Us</a></li>
      <li><a href="<c:url value='contactus'></c:url>">Contact Us</a></li> --%>
      </ul>
     <ul class="nav navbar-nav navbar-right">
      <li><a href="registration"><span class="glyphicon glyphicon-user"></span> Registration</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
    </div>
</nav>


</body>
</html>