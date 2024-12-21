package com.invoicex.bolanarede.core.adapter;

import com.invoicex.bolanarede.core.model.User;
import com.invoicex.bolanarede.core.port.input.RegisterUserInputPort;
import com.invoicex.bolanarede.core.port.output.RegisterUserDBOutputPort;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserAdapter implements RegisterUserInputPort {

    private final RegisterUserDBOutputPort registerUserDBOutputPort;

    public RegisterUserAdapter(final RegisterUserDBOutputPort registerUserDBOutputPort) {
        this.registerUserDBOutputPort = registerUserDBOutputPort;
    }

    @Override
    public User registerUser(User user) {

        return registerUserDBOutputPort.register(user);
    }
}
