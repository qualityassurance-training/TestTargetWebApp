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
<title>Edit Product</title>
</head>
<body>
	<div class="container">

		<h1>Edit Product</h1>

		<hr>

		<form method="post" action="product?action=update" class="card">
			${error }
			<table class="table">
				<tr>
					<td>Id</td>
					<td>${product.id } <input type="hidden" name="id"
						value="${product.id }">
					</td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" value="${product.name }">
					</td>
				</tr>
				<tr>
					<td>Description</td>
					<td><input type="text" name="description"
						value="${product.description }"></td>
				</tr>
				<tr>
					<td>Value</td>
					<td><input type="text" name="value" value="${product.value }">
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td><input type="submit" value="Update" class="btn btn-primary"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>