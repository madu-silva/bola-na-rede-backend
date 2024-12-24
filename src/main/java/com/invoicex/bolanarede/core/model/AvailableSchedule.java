package com.invoicex.bolanarede.core.model;

import lombok.Builder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Builder(toBuilder = true)
public class AvailableSchedule {

    private LocalDate date;
    private List<Schedules> hours;

    public LocalDate getDate() {
        return date;
    }

    public List<Schedules> getHours() {
        return hours;
    }

    @Builder(toBuilder = true)
    public static class Schedules {

        private LocalTime hour;
        private Boolean status;

        public LocalTime getHour() {
            return hour;
        }

        public Boolean getStatus() {
            return status;
        }

    }

}
