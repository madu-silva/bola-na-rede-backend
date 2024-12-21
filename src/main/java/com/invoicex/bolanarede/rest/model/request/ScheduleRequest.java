package com.invoicex.bolanarede.rest.model.request;

import lombok.Builder;

import java.time.LocalDate;
import java.time.LocalTime;

@Builder
public class ScheduleRequest {

    private String userId;
    private LocalDate date;
    private LocalTime hour;

    public ScheduleRequest() {
    }

    public ScheduleRequest(
            final String userId,
            final LocalDate date,
            final LocalTime hour) {
        this.userId = userId;
        this.date = date;
        this.hour = hour;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
}
