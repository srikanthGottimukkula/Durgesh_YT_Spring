<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is Help Page</title>
</head>
<body>
	<%-- <%
	String name = (String) request.getAttribute("name");
	Integer age = (Integer) request.getAttribute("age");
	LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	%> --%>




	<h1>
		My name is :
		<%-- 	<%=name%> --%>
		${name}
	</h1>
	<h2>
		I am :

		<%-- 	 <%=age%> --%>
		${age}
	</h2>
	<h3>
		The Current Time is :

		<%-- <%=time%> --%>
		${time}
	</h3>

	<c:forEach var="list" items="${list}">
		<%-- <h1>${list}</h1> --%>
		<h1>
			<c:out value="${list}"></c:out></h1>
	</c:forEach>


</body>
</html>