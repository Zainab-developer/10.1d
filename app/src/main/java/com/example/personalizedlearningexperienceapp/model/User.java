package com.example.personalizedlearningexperienceapp.model;
public class User {
    private String username;
    private String email;
    private String password;
    private String phone_no;

    public User(String username, String email, String password, String phone_no) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.phone_no = phone_no;
    }

    // Getters and setters for all fields
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }
}