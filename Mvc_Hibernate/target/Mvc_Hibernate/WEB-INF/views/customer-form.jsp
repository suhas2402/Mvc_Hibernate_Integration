<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring</title>
</head>
<body>
	<div align="center">
		<h2 class="text-center">Register</h2>

		<hr />
		<h1>Add Customer</h1>


		<form:form action="/Mvc_Hibernate/saveCustomer" method="Get"
			modelAttribute="customers">






			<form:hidden path="id" />    
First Name<form:input path="firstName" />
			<br />
			<br />
    
       
Last Name <form:input path="lastName" />
			<br />
			<br />
      

Email  <form:input path="email" />
			<br />
			<br />
			<input type="submit" value="submit" />

		</form:form>
	</div>
</body>
</html>