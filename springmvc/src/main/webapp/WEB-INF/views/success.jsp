<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Details</title>
<h2 class="text-center">${title}</h2>
<p class="text-center">${Desc}</p>
</head>
<body>
	<h2>The user name is : ${user.userName}</h2>
	<h2>The Email is : ${user.email}</h2>
	<h2>The PassWord is : ${user.password}</h2>

</body>
</html>