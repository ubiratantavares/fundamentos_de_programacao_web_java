<%@ taglib uri ="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Página de cadastro de peça</title>
	</head>
	<body>
		<jsp:useBean id="agora" class="java.util.Date"/>

		<h3>Cadastro de Peça</h3><fmt:formatDate pattern="dd/MM/yyy - HH:mm:ss" value="${agora}" />	
			
		<p />
		<hr />
		<p />	
			
		<form action="Controle?flag=cadastrar" method="post">
			Tipo de roupa: <input type="text" name="tipo" size="80" maxlength="80" />
			<br /><br />
			Marca: <input type="text" name="marca" size="80" maxlength="80" />
			<br /><br />
			Quantidade: <input type="text" name="quantidade" size="80" maxlength="80" />
			<br /><br />
			Valor: <input type="text" name="valor" size="10" maxlength="10" />
			<br /><br />
			<input type="submit" value="Enviar" />
			<br /><br />
		</form>

		<p />
		${msg}
		<p />	
		
		<a href="index.jsp">Clique aqui</a> para retornar à página principal.	
			
	</body>
</html>