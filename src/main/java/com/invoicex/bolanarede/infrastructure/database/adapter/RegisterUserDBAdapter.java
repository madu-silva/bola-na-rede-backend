package com.invoicex.bolanarede.infrastructure.database.adapter;

import com.invoicex.bolanarede.core.model.User;
import com.invoicex.bolanarede.core.port.output.RegisterUserDBOutputPort;
import com.invoicex.bolanarede.infrastructure.database.mapper.UserDBMapper;
import com.invoicex.bolanarede.infrastructure.database.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class RegisterUserDBAdapter implements RegisterUserDBOutputPort {

    private final UserDBMapper mapper;
    private final UserRepository repository;

    public RegisterUserDBAdapter(
            final UserDBMapper mapper,
            final UserRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public User register(final User user) {

        return mapper.parseToCore(repository.save(
                mapper.parseToDocument(
                        user.toBuilder()
                                .dataCreated(LocalDate.now())
                                .dataUpdated(LocalDate.now())
                                .build()
                )
        ));
    }
}
