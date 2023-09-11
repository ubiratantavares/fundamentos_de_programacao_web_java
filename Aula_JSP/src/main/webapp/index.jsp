<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Bem-vindo!</title>
	</head>
	<body>
		<h2>Oi, seja bem-vindo! <%= new java.util.Date() %></h2>
		
		<%-- Criando o contador: --%>		
		<%!int contador = 1; %>

		<%-- Iniciando as contagens de visita: --%>
		<% if (contador == 1) {	%>
		
		<h2>Essa é a sua visita número <%= contador %>. Seja Bem-vindo!</h2> 
			
		<%--  Inserindo um bloco else: --%>
		
		<% } else { %>
		
		<h2>Essa é a sua visita número <%=contador%>. Seja Bem-vindo!</h2>
			
		<%--  Incrementando o contador:--%>
		<% 
		   } 
		   contador++;
		%> 
	</body>
</html>