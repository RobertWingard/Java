<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Omikuji Form</title>
    <link rel="stylesheet" type="text/css" href="css/form.css">
   	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body class="box">
    <h1 class="text-center">Send an Omikuji!</h1>
    <!-- The submitted form will be sent to @PostMapping("/send") as a POST request -->
    <form action="/send" method="post" class="form d-flex flex-column align-items-center" style="padding:0 20%">
    	<label>Pick any number from 5 to 25:</label>
    	<!-- input type="number" creates input box for numbers only, and min and max are the range of acceptable numbers -->
    	<input type="number" min=5 max=25 name="number" class="form-control">
    	<label>Enter the name of any city:</label>
    	<input type="text" name="city" class="form-control">
    	<label>Enter the name of any real person:</label>
    	<input type="text" name="person" class="form-control">
    	<label>Enter professional endeavor or hobby:</label>
    	<input type="text" name="hobby" class="form-control">
    	<label>Enter any type of living thing:</label>
    	<input type="text" name="thing" class="form-control">
    	<label>Say something nice to someone:</label>
    	<textarea name="text" rows=4 cols=30></textarea>
    	<label>Send and show a friend</label>
    	<input type="submit" value="Click me!" class="button">
    </form>
</body>