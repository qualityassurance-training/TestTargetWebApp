<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<spring:url var="css" value="/static/bootstrap/css/bootstrap.css" />
<link type="text/css" rel="stylesheet" href="${css}">
<title>Projeto Liga QA</title>
</head>
<body>

	<div class="container">

		<h1>Product List</h1>
		<hr>
		<div>
			<spring:url value="/product/add" var="add" />
			<a class="btn btn-secondary" href="${add }">Add</a>
		</div>
		<hr>


		<table class="table table-striped table-condensed">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Description</th>
				<th>Value</th>
				<th>Option</th>
			</tr>
			<c:forEach var="product" items="${products }">
				<tr>
					<td>${product.id }</td>
					<td>${product.name }</td>
					<td>${product.description }</td>
					<td>${product.value }</td>
					<td>
						<a href="#" class="btn btn-primary btn-sm" 
						onclick="return confirm('Are you sure ?')">Delete</a> | 
						
						<spring:url value="/product/edit/" var="edit" />
						<a class="btn btn-primary btn-sm" href="${edit}${product.id }">Edit</a>
					
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>