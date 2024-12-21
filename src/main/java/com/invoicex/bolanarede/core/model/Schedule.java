package com.invoicex.bolanarede.core.model;

import com.invoicex.bolanarede.infrastructure.database.document.enuns.Scheduling;
import lombok.Builder;

import java.time.LocalDate;
import java.time.LocalTime;

@Builder(toBuilder = true)
public class Schedule {

    private String id;
    private String userId;
    private LocalDate date;
    private LocalTime hour;
    private Scheduling status;

    public Schedule() {
    }

    public Schedule(
            final String id,
            final String userId,
            final LocalDate date,
            final LocalTime hour,
            final Scheduling status) {
        this.id = id;
        this.userId = userId;
        this.date = date;
        this.hour = hour;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
