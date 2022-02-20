package com.example.santander;

import com.example.santander.model.ClientModel;
import com.example.santander.model.ClientList;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "Cliente", value = "/cliente")
public class Client extends HttpServlet {

    ClientList listaClientes = new ClientList();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nameClient = request.getParameter("nameClient");
        String emailClient = request.getParameter("emailClient");
        String agencyClient = request.getParameter("agencyClient");
        String accountClient = request.getParameter("accountClient");
        response.setContentType("text/html");
        ClientModel cliente = new ClientModel();
        cliente.setName(nameClient);
        cliente.setEmail(emailClient);
        cliente.setAgency(agencyClient);
        cliente.setAccount(accountClient);


        listaClientes.add(cliente);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("registerClient.jsp");
        request.setAttribute("cliente", cliente.getName());
        requestDispatcher.forward(request, response);
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ClientModel> lista = listaClientes.showClients();
        request.setAttribute("clientes", lista);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("clientsList.jsp");
        requestDispatcher.forward(request, response);
    }

}
