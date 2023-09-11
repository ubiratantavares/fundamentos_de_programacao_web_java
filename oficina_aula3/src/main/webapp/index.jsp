<%@ taglib uri ="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>página principal</title>
	</head>
	<body>
		<jsp:useBean id="agora" class="java.util.Date"/>
		<h3>Sistema de Estoque de Empresa de Roupas</h3><fmt:formatDate pattern="dd/MM/yyy - HH:mm:ss" value="${agora}" />		
		<p />
		<hr />
		<p />
		<a href="cadastro.jsp">Clique aqui</a> para cadastrar uma nova peça de roupa.
		<br />
		<br />
		<a href="Controle?flag=listar">Clique aqui</a> para listar as peças de roupa no estoque.
  		<br/><br/> 	
	</body>
</html>