<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Clientes</title>
<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />
<spring:url value="/resources/css/style_list.css" var="styleCss" />
<spring:url value="/resources/js/jquery-3.0.0.min.js" var="jquery" />
<spring:url value="/resources/js/list.js" var="js" />
<link href="${bootstrapCss}" rel="stylesheet" type="text/css" />
<link href="${styleCss}" rel="stylesheet" type="text/css" />
</head>
<body>

	<ul class="nav nav-tabs">
		<li role="presentation" id="home"><a href="#">Home</a></li>
		<li role="presentation" id="profile"><a / href="#">Perfil</a></li>
		<li role="presentation" id="exit"><a href="#">Sair</a></li>
	</ul>
	<div class="container">
		<div class="row">

			<section class="content">
			<h1>Lista de Clientes</h1>
			<div class="col-md-8 col-md-offset-2">
				<div class="panel panel-default">
					<div class="panel-body">
						<div class="pull-right">
							<div class="btn-group">
								<button type="button" class="btn btn-success btn-filter"
									data-target="pagado">Pago</button>
								<button type="button" class="btn btn-warning btn-filter"
									data-target="pendiente">Pendente</button>
								<button type="button" class="btn btn-danger btn-filter"
									data-target="cancelado">Cancelado</button>
								<button type="button" class="btn btn-default btn-filter"
									data-target="all">Todos</button>
							</div>
						</div>
						<div class="table-container">
							<table class="table table-filter">
								<tbody>
									<td><input type="checkbox" id="checkbox1"> <label
										for="checkbox1"></label></td>
									<td>
										<h6>Felipe Gualberto</h6>
									</td>
								</tbody>
							</table>
						</div>
					</div>
				</div>
				<div class="content-footer">
					<p>
						Page © - 2016 <br> Powered By Felipe Gualberto
					</p>
				</div>
			</div>
			</section>

		</div>
	</div>
</body>
<script type="text/javascript"
	src="/personaltrainer/resources/js/jquery-3.0.0.min.js"></script>
<script type="text/javascript" src="${js}"></script>
</html>