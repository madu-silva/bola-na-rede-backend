package com.invoicex.bolanarede.infrastructure.database.mapper;

import com.invoicex.bolanarede.core.model.User;
import com.invoicex.bolanarede.infrastructure.database.document.UserDocument;
import org.springframework.stereotype.Component;

@Component
public class UserDBMapper {

    public User parseToCore(UserDocument userDocument) {
        return User.builder()
                .id(userDocument.getId())
                .name(userDocument.getName())
                .email(userDocument.getEmail())
                .telephone(userDocument.getTelephone())
                .role(userDocument.getRole())
                .dataCreated(userDocument.getDataCreated())
                .dataUpdated(userDocument.getDataUpdated())
                .verified(userDocument.getVerified())
                .build();
    }

    public UserDocument parseToDocument(User user) {
        return UserDocument.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .telephone(user.getTelephone())
                .role(user.getRole())
                .password(user.getPassword())
                .dataCreated(user.getDataCreated())
                .dataUpdated(user.getDataUpdated())
                .verified(user.getVerified())
                .build();
    }

}
