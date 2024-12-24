package com.invoicex.bolanarede.rest.model.response;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class AvailableScheduleResponse {

    private LocalDate date;
    private List<Schedules> hour;

    public LocalDate getDate() {
        return date;
    }

    public List<Schedules> getHour() {
        return hour;
    }

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
