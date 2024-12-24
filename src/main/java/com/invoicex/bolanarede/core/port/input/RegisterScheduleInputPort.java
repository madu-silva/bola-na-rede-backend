package com.invoicex.bolanarede.core.port.input;

import com.invoicex.bolanarede.core.model.Schedule;

public interface RegisterScheduleInputPort {

    public Schedule registerSchedule(final Schedule schedule);
}
