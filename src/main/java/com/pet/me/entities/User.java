package com.pet.me.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "petDb")
public class User {


    private int id;
    private String email;
    private String password;

    public User(){

    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }


    public User(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) { this.password = password; }

    public String getPassword() { return password; }

    @Override
    public String toString() {
        return "User{" +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
