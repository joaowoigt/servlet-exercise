package com.example.santander.model;


public class ClientModel {
    private String name;
    private String email;
    private String agency;
    private String account;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAgency() {
        return agency;
    }

    public String getAccount() {
        return account;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
