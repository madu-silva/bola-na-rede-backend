package com.invoicex.bolanarede.rest.controller;

import com.invoicex.bolanarede.core.port.input.RegisterUserInputPort;
import com.invoicex.bolanarede.rest.mapper.UserMapper;
import com.invoicex.bolanarede.rest.model.request.UserRequest;
import com.invoicex.bolanarede.rest.model.response.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final RegisterUserInputPort registerUserInputPort;
    private final UserMapper userMapper;

    public AuthController(RegisterUserInputPort registerUserInputPort, UserMapper userMapper) {
        this.registerUserInputPort = registerUserInputPort;
        this.userMapper = userMapper;
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(@RequestBody UserRequest userRequest) {

        return ResponseEntity.ok(
                userMapper.parseToResponse(
                        registerUserInputPort.registerUser(
                                userMapper.parseToCore(userRequest)
                        )
                )
        );
    }
}
