package com.invoicex.bolanarede.infrastructure.database.repositories;

import com.invoicex.bolanarede.infrastructure.database.document.UserDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserDocument, String> {
}
