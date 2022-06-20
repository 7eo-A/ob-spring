package com.code;

import javax.persistence.*;

@Entity
public class User {

    @Id
    int id;
    String username;
    String password;
    int type_area;

    public User() {
    }

    public User(int id, String username, String password, int type_area) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.type_area = type_area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getType_area() {
        return type_area;
    }

    public void setType_area(int type_area) {
        this.type_area = type_area;
    }

    @Override
    public String toString() {
        return "User[" +
                " Name: " + username + '\'' +
                ", Password: " + password + '\'' +
                ", Area: " + type_area +
                ']';
    }
}
