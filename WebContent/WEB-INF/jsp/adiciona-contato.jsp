<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="ifglza" %>
<!DOCTYPE>
<html>
<head>
	<link href="css/jquery.css" rel="stylesheet">
	<script src="js/jquery.js"></script>
	<script src="js/jquery-ui.js"></script>
	<title>Formul�rio</title>
</head>
<body>
	<c:import url="cabecalho.jsp" />


	<h1>Adiciona Contatos</h1>
	<hr />
	<form action="adicionaContato">
		Nome: <input type="text" name="nome" /><br /> 
		E-mail: <input type="text" name="email" /><br /> 
		Endere�o: <input type="text" name="endereco" /><br /> 
		Data Nascimento: <ifglza:campoData id="dataNascimento" /><br />
		 
		<input type="submit" value="Gravar" />
	</form>

	<c:import url="rodape.jsp" />
</body>
</html>