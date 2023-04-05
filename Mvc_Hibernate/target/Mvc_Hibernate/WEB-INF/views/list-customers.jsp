<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
	<div align="center">
		<h2>Customer Management</h2>
		<hr />
		<form action="/Mvc_Hibernate/showForm">
			<input type="submit" value="Add" />
		</form>
		<br />

		<table border="1">
			<thead>
				<tr>
					<td>Id</td>
					<td>First Name</td>
					<td>Last Name</td>
					<td>Enail</td>
					<td>Action</td>
				</tr>

			</thead>





			<c:forEach items="${customers}" var="customer">
				<tbody>
					<tr>
						<td><c:out value="${customer.id}" /></td>
						<td><c:out value="${customer.firstName}" /></td>
						<td><c:out value="${customer.lastName}" /></td>
						<td><c:out value="${customer.email}" /></td>
						<td><a href="/Mvc_hibernate/updateForm?userId=${customer.id}">update</a>
							<a href="/Mvc_hibernate/delete?userId=${customer.id}"
							onclick="if(!(confirm('Are you Sure you want to delete this student')))return false">delete</a></td>
					</tr>
				</tbody>
			</c:forEach>

		</table>

	</div>

</body>
</html>