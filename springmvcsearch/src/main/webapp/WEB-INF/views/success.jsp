<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Student name is : ${student.name}</h2>
<h2>Student id  is : ${student.id}</h2>
<h2>Student Date is : ${student.date}</h2>
<h2>Student Subjects is : ${student.subjects}</h2>
<h2>Student type is : ${student.gender}</h2>
<h2>Student street is : ${student.address.street}</h2>
<h2>Student city is : ${student.address.city}</h2>




</body>
</html>