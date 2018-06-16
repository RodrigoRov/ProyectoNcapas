<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
 <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
 <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="resources/jquery-ui/jquery-ui.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		$(function(){
			$("#fechaFin").datepicker({ dateFormat: 'dd/mm/yyyy'});
		});
		</script>
	<script type="text/javascript">
		$(function(){
			$("#fechaInicio").datepicker({ dateFormat: 'dd/mm/yyyy'});
		});
	</script>
	<form method="post" action="${pageContext.request.contextPath}/">
		<p>Desde: <input type = "text" name = "fechaInicio" id="fechaInicio"></p>
		
		<p>Hasta: <input type = "text" name = "fechaFin" id="fechaFin"></p>
		
	
		<input type = submit value="Filtrar">
		
	</form>
	
	<table>
		<tr>
			<th>Correlativo</th>
			<th>Tipo de operacion</th>
			<th>Fecha de operacion</th>
			<th>Monto</th>
			<th>Concepto</th>
			<th>Emisor</th>
			<th>Receptor</th>
			<th>Estado</th>
		</tr>
		<c:forEach var="op" items="${operaciones}">
			<tr>
				<td>${op.coperacion}</td>
				<td>${op.tipoDelegate}</td>
				<td>${op.fechaOpeDelegate}</td>
				<td>${op.montoDelegate}</td>
				<td>${op.sconcepto}</td>
				<td>${op.ucuentaemisora}</td>
				<td>${op.ucuentareceptora}</td>
				<td>${op.estadoDelegate}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>