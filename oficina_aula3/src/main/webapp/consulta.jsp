<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="f"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Página de consulta do estoque de roupas</title>
	</head>
	<body>
		<jsp:useBean id="agora" class="java.util.Date"/>

		<h3>Lista das peças no estoque</h3><fmt:formatDate pattern="dd/MM/yyy - HH:mm:ss" value="${agora}" />	
		
		<p /><hr /><p />
		<c:if test="${not empty pecas}">
			<table border="1">
				<tr>
					<th>Código</th>
					<th>Tipo de roupa</th>
					<th>Marca</th>
					<th>Quantidade</th>
					<th>Valor</th>
					<th>Excluir</th>
					<th>Alterar</th>
				</tr>
				
			<c:forEach items="${pecas}" var="p">
				<tr>
					<td><c:out value="${p.id}" /></td>
					<td><c:out value="${p.tipo}" /></td>
					<td><c:out value="${p.marca}" /></td>
					<td><c:out value="${p.quantidade}" /></td>
					<td><fmt:formatNumber value="${p.valor}" pattern="R$ #.00" /></td>
					<td><a href="">Excluir</a></td>
					<td><a href="">Alterar</a></td>
				</tr>
			</c:forEach>
			</table>
			
			<p />
			<c:out value="Total de itens em estoque: ${f:length(pecas)}" />
			<p />
						
		</c:if>
		
		<p />
		${msg}
		<p />
		<a href="index.jsp">Clique aqui</a> para retornar a página inicial.
	</body>
</html>