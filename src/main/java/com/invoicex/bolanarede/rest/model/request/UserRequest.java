package com.invoicex.bolanarede.rest.model.request;

public class UserRequest {

    private String name;
    private String email;
    private String telephone;
    private String password;

    public UserRequest() {
    }

    public UserRequest(String name, String email, String telephone, String password) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
