package com.invoicex.bolanarede.core.port.input;

import com.invoicex.bolanarede.core.model.User;

public interface RegisterUserInputPort {

    public User registerUser(final User user);
}
