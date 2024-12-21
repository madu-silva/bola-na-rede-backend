package com.invoicex.bolanarede.infrastructure.database.document;

import com.invoicex.bolanarede.infrastructure.database.document.enuns.Role;
import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;
import java.util.UUID;

@Document(collection = "user")
@Builder
public class UserDocument {

    @Id
    private UUID id;

    @Field("name")
    private String name;
    @Field("email")
    private String email;
    @Field("telephone")
    private String telephone;
    @Field("role")
    private Role role;
    @Field("password")
    private String password;
    @Field("dataCreated")
    private LocalDate dataCreated;
    @Field("dataUpdated")
    private LocalDate dataUpdated;
    @Field("verified")
    private Boolean verified;

    public UserDocument() {
    }

    public UserDocument(
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

    public void setRole(Role role) {
        this.role = role;
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
