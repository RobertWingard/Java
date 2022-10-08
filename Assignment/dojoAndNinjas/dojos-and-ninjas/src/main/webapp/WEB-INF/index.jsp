<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
<h1>New Dojo</h1>

<form:form action="/dojos" method="post" modelAttribute="dojo">
    <p>
        <form:label path="name">Dojo Name:</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
   
    <input type="submit" value="Add Me!"/>
    
    <a href="/create">Add a Ninja</a>
</form:form>
</body>
</html>