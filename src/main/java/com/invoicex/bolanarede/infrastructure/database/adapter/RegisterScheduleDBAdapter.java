package com.invoicex.bolanarede.infrastructure.database.adapter;

import com.invoicex.bolanarede.core.model.Schedule;
import com.invoicex.bolanarede.core.port.output.RegisterScheduleDBOutputPort;
import com.invoicex.bolanarede.infrastructure.database.document.enuns.Scheduling;
import com.invoicex.bolanarede.infrastructure.database.mapper.ScheduleDBMapper;
import com.invoicex.bolanarede.infrastructure.database.repositories.ScheduleRepository;
import org.springframework.stereotype.Service;

@Service
public class RegisterScheduleDBAdapter implements RegisterScheduleDBOutputPort {

    private final ScheduleRepository repository;
    private final ScheduleDBMapper mapper;

    public RegisterScheduleDBAdapter(ScheduleRepository repository, ScheduleDBMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Schedule registerSchedule(Schedule schedule) {

        return
                mapper.parseToCore(repository.save(
                                mapper.parseToDocument(
                                        schedule.toBuilder()
                                                .userId(schedule.getUserId())
                                                .status(Scheduling.SCHEDULED)
                                                .build())
                        )
                );
    }
}
