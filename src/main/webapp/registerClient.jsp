<%
    String nomeCliente = (String) request.getAttribute("cliente");
%>
<html>
<head>
    <title>Cliente cadastrado</title>
</head>
<body>
    <h1><%=nomeCliente%> Cadastrado com sucesso</h1>
</body>
</html>
