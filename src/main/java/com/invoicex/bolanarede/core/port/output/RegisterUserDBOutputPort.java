package com.invoicex.bolanarede.core.port.output;

import com.invoicex.bolanarede.core.model.User;

public interface RegisterUserDBOutputPort {

    public User register(User user);
}
