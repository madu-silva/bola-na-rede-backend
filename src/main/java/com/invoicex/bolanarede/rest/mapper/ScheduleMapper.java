package com.invoicex.bolanarede.rest.mapper;

import com.invoicex.bolanarede.core.model.Schedule;
import com.invoicex.bolanarede.rest.model.request.ScheduleRequest;
import com.invoicex.bolanarede.rest.model.response.ScheduleResponse;
import org.springframework.stereotype.Component;

@Component
public class ScheduleMapper {

    public Schedule parseToCore(ScheduleRequest scheduleRequest) {

        return Schedule.builder()
                .userId(scheduleRequest.getUserId())
                .date(scheduleRequest.getDate())
                .hour(scheduleRequest.getHour())
                .build();
    }

    public ScheduleResponse parseToResponse(Schedule schedule) {

        return ScheduleResponse.builder()
                .date(schedule.getDate())
                .hour(schedule.getHour())
                .status(schedule.getStatus())
                .build();
    }


}
