<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<link href="<c:url value='/resources/css/registration.css'></c:url>" rel="stylesheet">
<script type="text/javascript"
	src="https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script>
	<script type="text/javascript">

	</script>
</head>

<body>
<h3>Welcome to the Toys Store for little ones</h3>
<hr>
<h5>Start Your Shopping Happily</h5>

	<div class="container">
		
			<form:label path="firstname">Enter Firstname</form:label>
			<form:input path="firstname" id="firstname" />

			<form:label path="lastname">Enter Lastname</form:label>
			<form:input path="lastname" id="lastname" />

			<form:label path="phonenumber">Enter Phonenumber</form:label>
			<form:input path="phonenumber" id="phonenumber" />

			<hr>
			<b>Login Credentials</b>
			<br>
			<form:label path="user.email">Enter Email</form:label>
			<form:input path="user.email" id="user.email" type="email" />
			<span style="color: red">${error}</span>
			<form:label path="user.password">Enter password</form:label>
			<form:input path="user.password" id="user.password" type="password" />
</div>

</body>
</html>
