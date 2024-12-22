package com.invoicex.bolanarede.infrastructure.database.mapper;

import com.invoicex.bolanarede.core.model.Schedule;
import com.invoicex.bolanarede.infrastructure.database.document.ScheduleDocument;
import org.springframework.stereotype.Component;

@Component
public class ScheduleDBMapper {

    public ScheduleDocument parseToDocument(final Schedule schedule) {
        return ScheduleDocument.builder()
                .id(schedule.getId())
                .userId(schedule.getUserId())
                .date(schedule.getDate())
                .hour(schedule.getHour())
                .status(schedule.getStatus())
                .build();
    }

    public Schedule parseToCore(final ScheduleDocument scheduleDocument) {
        return Schedule.builder()
                .id(scheduleDocument.getId())
                .userId(scheduleDocument.getUserId())
                .date(scheduleDocument.getDate())
                .hour(scheduleDocument.getHour())
                .status(scheduleDocument.getStatus())
                .build();
    }
}
