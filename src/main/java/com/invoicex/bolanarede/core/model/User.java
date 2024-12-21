package com.invoicex.bolanarede.core.model;

import com.invoicex.bolanarede.infrastructure.database.document.enuns.Role;
import lombok.Builder;

import java.time.LocalDate;
import java.util.UUID;

@Builder(toBuilder = true)
public class User {

    private UUID id;
    private String name;
    private String email;
    private String telephone;
    private Role role;
    private String password;
    private LocalDate dataCreated;
    private LocalDate dataUpdated;
    private Boolean verified;

    public User() {
    }

    public User(
            UUID id,
            String name,
            String email,
            String telephone,
            Role role,
            String password,
            LocalDate dataCreated,
            LocalDate dataUpdated,
            Boolean verified) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.role = role;
        this.password = password;
        this.dataCreated = dataCreated;
        this.dataUpdated = dataUpdated;
        this.verified = verified;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role type) {
        this.role = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDataCreated() {
        return dataCreated;
    }

    public void setDataCreated(LocalDate dataCreated) {
        this.dataCreated = dataCreated;
    }

    public LocalDate getDataUpdated() {
        return dataUpdated;
    }

    public void setDataUpdated(LocalDate dataUpdated) {
        this.dataUpdated = dataUpdated;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }
}
