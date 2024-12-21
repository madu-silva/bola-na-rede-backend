package com.invoicex.bolanarede.core.port.output;

import com.invoicex.bolanarede.core.model.Schedule;

public interface RegisterScheduleDBOutputPort {

    public Schedule registerASchedule(final Schedule schedule);
}
