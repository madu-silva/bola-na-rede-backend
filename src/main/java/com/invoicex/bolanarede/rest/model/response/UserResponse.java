package com.invoicex.bolanarede.rest.model.response;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public class UserResponse {

    private String id;
    private String name;
    private String email;
    private String telephone;
    private LocalDate dataUpdated;

    public UserResponse() {
    }

    public UserResponse(String id, String name, String email, String telephone, LocalDate dataUpdated) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.dataUpdated = dataUpdated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public LocalDate getDataUpdated() {
        return dataUpdated;
    }

    public void setDataUpdated(LocalDate dataUpdated) {
        this.dataUpdated = dataUpdated;
    }
}