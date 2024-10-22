<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>Welcome to the home page controller!!</h1>
	<%
	String name = (String) request.getAttribute("name");
	List<String> names = (List<String>) request.getAttribute("frds");
	%>

	<h2><%=name%>
	</h2>
	<%
	for (String s : names) {
	%>
	<h1><%=s%></h1>
	<%
	}
	%>
	<%-- 	<h2><%=names %></h2> --%>
</body>

</html>