<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Iniciar Sesion</title>
</head>
<body>
	<h2>Login</h2><br>
	<form method="post" action="${pageContext.request.contextPath}/validarlogin">
	<p>Username: <input type="text" name="username"/></p><br>
	<p>Password: <input type="password" name="password"/></p><br>
	<input type="submit" value="Iniciar Sesion"/>
	</form>
</body>
</html>