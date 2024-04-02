package com.petconnect.petconnect.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
public class User {

    @GeneratedValue
    private int id;

    private String username;

    private String password;

    //constructors
    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User() {}


    //getters & setters
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
