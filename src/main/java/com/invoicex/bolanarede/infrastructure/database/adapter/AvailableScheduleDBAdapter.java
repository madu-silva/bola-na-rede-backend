package com.invoicex.bolanarede.infrastructure.database.adapter;

import com.invoicex.bolanarede.core.model.AvailableSchedule;
import com.invoicex.bolanarede.core.port.output.AvailableScheduleDBOutputPort;
import com.invoicex.bolanarede.infrastructure.database.document.enuns.Scheduling;
import com.invoicex.bolanarede.infrastructure.database.repositories.ScheduleRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class AvailableScheduleDBAdapter implements AvailableScheduleDBOutputPort {

    private final ScheduleRepository repository;

    public AvailableScheduleDBAdapter(ScheduleRepository repository) {
        this.repository = repository;
    }

    @Override
    public AvailableSchedule getAllAvailableSchedule(LocalDate date, LocalTime[] hours) {

        List<AvailableSchedule.Schedules> schedules = new ArrayList<>();

        for (var hour : hours) {
            int busySchedules = repository.countByStatusNotAndDateIsAndHourIs(
                    Scheduling.CANCELED, date, hour);

            schedules.add(
                    AvailableSchedule.Schedules.builder()
                            .hour(hour)
                            .status(busySchedules < 4)
                            .build()
            );
        }

        return AvailableSchedule.builder()
                .date(date)
                .hours(schedules)
                .build();
    }

}
