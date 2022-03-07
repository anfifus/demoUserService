package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String userName;
    private String pass;

    protected User(){}

    public User(String userName,String pass) {
        this.userName = userName;
        this.pass = pass;
    }

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }
}
