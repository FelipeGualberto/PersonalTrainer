<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />
<spring:url value="/resources/css/profile.css" var="styleCss" />
<link href="${bootstrapCss}" rel="stylesheet" type="text/css" />
<link href="${styleCss}" rel="stylesheet" type="text/css" />
<title>Profile</title>
</head>
<body>
	<div class="container">
		<div class="row profile">
			<div class="profile-content">
				<form role="form">
					<div class="form-group">
						<label for="text">Nome:</label> <input type="text"
							class="form-control" id="nome">
					</div>
					<div class="form-group">
						<label for="email">Email address:</label> <input type="email"
							class="form-control" id="email">
					</div>
					<div class="form-group">
						<label for="pwd">Password:</label> <input type="password"
							class="form-control" id="pwd">
					</div>
					<button type="submit" class="btn btn-default">Editar</button>
				</form>

			</div>
		</div>
	</div>
	</div>
	<center>
		<strong>Powered by >Felipe Gualberto</a></strong>
	</center>
	<br>
	<br>
</body>
</html>