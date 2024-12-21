package com.invoicex.bolanarede.rest.mapper;

import com.invoicex.bolanarede.core.model.User;
import com.invoicex.bolanarede.rest.model.request.UserRequest;
import com.invoicex.bolanarede.rest.model.response.UserResponse;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User parseToCore(UserRequest userRequest) {
        return User.builder()
                .name(userRequest.getName())
                .email(userRequest.getEmail())
                .telephone(userRequest.getTelephone())
                .password(userRequest.getPassword())
                .build();
    }

    public UserResponse parseToResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .telephone(user.getTelephone())
                .dataUpdated(user.getDataUpdated())
                .build();
    }
}
