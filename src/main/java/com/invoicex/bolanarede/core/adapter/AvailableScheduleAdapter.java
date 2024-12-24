package com.invoicex.bolanarede.core.adapter;

import com.invoicex.bolanarede.core.model.AvailableSchedule;
import com.invoicex.bolanarede.core.port.input.AvailableScheduleInputPort;
import com.invoicex.bolanarede.core.port.output.AvailableScheduleDBOutputPort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class AvailableScheduleAdapter implements AvailableScheduleInputPort {

    private final AvailableScheduleDBOutputPort dbOutputPort;

    public AvailableScheduleAdapter(AvailableScheduleDBOutputPort dbOutputPort) {
        this.dbOutputPort = dbOutputPort;
    }

    @Override
    public AvailableSchedule getAllAvailableSchedule(LocalDate date) {

        final LocalTime[] hours = {
                LocalTime.of(9, 0),
                LocalTime.of(10, 0),
                LocalTime.of(11, 0),
                LocalTime.of(12, 0),
                LocalTime.of(13, 0),
                LocalTime.of(14, 0),
                LocalTime.of(15, 0),
                LocalTime.of(16, 0),
                LocalTime.of(17, 0),
                LocalTime.of(18, 0),
                LocalTime.of(19, 0),
                LocalTime.of(20, 0),
        };

        return dbOutputPort.getAllAvailableSchedule(date, hours);
    }

}
