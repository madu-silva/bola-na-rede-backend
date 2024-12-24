package com.invoicex.bolanarede.rest.model.response;

import com.invoicex.bolanarede.infrastructure.database.document.enuns.Scheduling;
import lombok.Builder;

import java.time.LocalDate;
import java.time.LocalTime;

@Builder
public class ScheduleResponse {

    private LocalDate date;
    private LocalTime hour;
    private Scheduling status;

    public ScheduleResponse() {
    }

    public ScheduleResponse(
            final LocalDate date,
            final LocalTime hour,
            final Scheduling status) {
        this.date = date;
        this.hour = hour;
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHour() {
        return hour;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }

    public Scheduling getStatus() {
        return status;
    }

    public void setStatus(Scheduling status) {
        this.status = status;
    }
}
