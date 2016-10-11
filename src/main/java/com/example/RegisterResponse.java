package com.example;

/**
 * Created by Elimas on 2016-10-11.
 */
public class RegisterResponse {
    private String message;
    private String name;
    private String email;
    private String date;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public RegisterResponse() {
    }

    public RegisterResponse(String message, String name, String email, String date) {
        this.message = message;
        this.name = name;
        this.email = email;
        this.date = date;
    }
}
