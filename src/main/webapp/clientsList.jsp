<%@ page import="com.example.santander.model.ClientModel" %>
<%@ page import="java.util.List" %>
<% %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
    <%
        List<ClientModel> clientes = (List) request.getAttribute("clientes");
        for (ClientModel cliente: clientes) {
    %>
            <li> <%=cliente.getName()%> </li>
            <li> <%=cliente.getEmail()%> </li>
            <li> <%=cliente.getAgency()%> </li>
            <li> <%=cliente.getAccount()%> </li>
            <h1></h1>
    <%
        }
    %>

</ul>
</body>
</html>
