<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>

	<c:forEach items="${lista}" var="parola">
		<c:out value="${parola}"></c:out>
		<br>
	</c:forEach>

	<a href="home">Clicca per tornare alla home</a>

</body>
</html>