<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset= UTF-8">
		<title>Clinica Médica - Home</title>
		<link rel="stylesheet" type="text/css" href="CSS/style.css">
	</head>
	<body>
		<div id="topo">	
			<h1>Clínica Médica</h1>
		</div>	
		
      	<div id="menu_lateral">
	        <ul>
	            <li><a href="index.jsp">Home</a></li>
	            <li><a href="especialidades.jsp">Especialidades</a></li>
	            <li><a href= "contato.jsp">Contato</a></li>
	            </ul>
    	</div>
    	
   	   	<form action="Principal" method="post">
			Nome: <input type="text" name="nome" /><br />
			Idade: <input type="text" name="idade" /><br />
			Sexo: <select name="sexo">
					<option value="Masculino">Masculino</option>
					<option value="Feminino">Feminino</option>
				  </select><br />
			E-mail: <input type="text" name="email" /><br />
			Melhorias: <textarea rows="2" cols="80" name="melhorias"></textarea><br />
			<input type="submit" value="Enviar" />
		</form>
		
	    <div id="rodape">
	        Todos os direitos reservados © 2022 <br/> 
	        Desenvolvido por Ubiratan Tavares.
	    </div>		
	</body>
</html>