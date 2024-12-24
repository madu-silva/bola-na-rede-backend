package com.invoicex.bolanarede.core.port.output;

import com.invoicex.bolanarede.core.model.AvailableSchedule;

import java.time.LocalDate;
import java.time.LocalTime;

public interface AvailableScheduleDBOutputPort {

    AvailableSchedule getAllAvailableSchedule(LocalDate date, LocalTime[] hours);
}
