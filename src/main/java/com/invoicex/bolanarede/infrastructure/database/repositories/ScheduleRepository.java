package com.invoicex.bolanarede.infrastructure.database.repositories;

import com.invoicex.bolanarede.infrastructure.database.document.ScheduleDocument;
import com.invoicex.bolanarede.infrastructure.database.document.enuns.Scheduling;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;

@Repository
public interface ScheduleRepository extends MongoRepository<ScheduleDocument, String> {

    int countByStatusNotAndDateIsAndHourIs(Scheduling status, LocalDate date, LocalTime hour);
}
