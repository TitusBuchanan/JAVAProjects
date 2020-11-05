package com.Hotel;

import java.lang.reflect.Member;

public class Client {
    private int idClient;
    private String firstName;
    private String lastName;

    public Client() {
        this.idClient = 0;
        this.firstName = "";
        this.lastName = "";
    }

    public Client(int idClient, String firstName, String lastName) {
        this.idClient = idClient;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(String lastName) {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
