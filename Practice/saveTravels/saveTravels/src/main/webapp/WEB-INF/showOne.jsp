<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Showing One</title>
</head>
<body>
	<h1>Name: <c:out value="${expense.name}"/></h1>
	<h3>Vendor: <c:out value="${expense.vendor}"/></h3>
	<h3>Amount: <c:out value="${expense.amount}"/></h3>
	<a href="/">Home</a>
	
</body>
</html>