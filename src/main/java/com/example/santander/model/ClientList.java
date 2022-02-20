package com.example.santander.model;

import java.util.ArrayList;
import java.util.List;

public class ClientList {
    private static List<ClientModel> clients = new ArrayList<>();

    public void add(ClientModel cliente) {
        ClientList.clients.add(cliente);
    }

    public List<ClientModel> showClients() {
        return ClientList.clients;
    }
}
