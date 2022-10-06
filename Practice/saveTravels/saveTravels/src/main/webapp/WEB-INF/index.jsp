<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Travels</title>
</head>
<body>
<h1>Save Travels</h1>
<table>
<thead>
	<tr>
		<th>Expense</th>
		<th>Vendor</th>
		<th>Amount</th>
		<th>Actions</th>
	</tr>
</thead>
<tbody>
	<c:forEach var="expense" items="${expenses}">
		<tr>
			<td><c:out value="${expense.name}"></c:out></td>
			<td><c:out value="${expense.vendor}"></c:out></td>
			<td><c:out value=" $ ${expense.amount}"></c:out></td>
			<td><a href="/expenses/${expense.id}/edit">Edit</a></td>
		</tr>
	</c:forEach>
</tbody>		
</table>
<h1>Add a Expense</h1>
<form:form action="/expenses" method="post" modelAttribute="expense">
	
	
	<form:label path="name">Expense Name: </form:label>
	<form:errors path="name"/>
	<form:input path="name"/>
	
	<form:label path="vendor">Vendor: </form:label>
	<form:errors path="vendor"/>
	<form:input path="vendor"/>
	
	<form:label path="amount">Amount: </form:label>
	<form:errors path="amount"/>
	<form:input path="amount"/>
	
	<form:label path="description">Description: </form:label>
	<form:errors path="description"/>
	<form:input path="description"/>
	
	<input type="submit" value="ADD"/>
	
	
	
	</form:form>
</body>
</html>