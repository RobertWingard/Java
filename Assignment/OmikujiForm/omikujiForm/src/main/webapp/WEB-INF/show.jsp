<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Omikuji Show</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>



<body class="box" style="padding:0 20%">

    <h1 class="text-center"> Here's Your Omikuji!</h1>
    <div class="p-3 mb-2 bg-info text-white border border-dark">
    	<h2>In <c:out value="${showNumber}"/> years you will live in <c:out value="${showCity}"/> with <c:out value="${showPerson}"/> as your roommate, <c:out value="${showHobby}"/> for a living. The next time you see a <c:out value="${showThing}"/>, you will have good luck. <c:out value="${showText}"/></h2>
    </div>
    <p class="link"><a href="/omikuji">Try again</a></p>
</body>