package com.invoicex.bolanarede.infrastructure.database.repositories;

import com.invoicex.bolanarede.infrastructure.database.document.ScheduleDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends MongoRepository<ScheduleDocument, String> {
}
