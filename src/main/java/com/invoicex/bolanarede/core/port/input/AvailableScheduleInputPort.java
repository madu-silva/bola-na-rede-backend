package com.invoicex.bolanarede.core.port.input;

import com.invoicex.bolanarede.core.model.AvailableSchedule;

import java.time.LocalDate;

public interface AvailableScheduleInputPort {

    AvailableSchedule getAllAvailableSchedule(LocalDate date);
}
