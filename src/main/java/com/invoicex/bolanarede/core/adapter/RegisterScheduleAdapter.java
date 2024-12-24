package com.invoicex.bolanarede.core.adapter;

import com.invoicex.bolanarede.core.model.Schedule;
import com.invoicex.bolanarede.core.port.input.RegisterScheduleInputPort;
import com.invoicex.bolanarede.core.port.output.RegisterScheduleDBOutputPort;
import org.springframework.stereotype.Service;

@Service
public class RegisterScheduleAdapter implements RegisterScheduleInputPort {

    private final RegisterScheduleDBOutputPort dbOutputPort;

    public RegisterScheduleAdapter(RegisterScheduleDBOutputPort dbOutputPort) {
        this.dbOutputPort = dbOutputPort;
    }

    @Override
    public Schedule registerSchedule(Schedule schedule) {
        return dbOutputPort.registerSchedule(schedule);
    }
}
