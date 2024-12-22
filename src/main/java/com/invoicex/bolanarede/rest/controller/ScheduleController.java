package com.invoicex.bolanarede.rest.controller;

import com.invoicex.bolanarede.core.model.AvailableSchedule;
import com.invoicex.bolanarede.core.port.input.AvailableScheduleInputPort;
import com.invoicex.bolanarede.core.port.input.RegisterScheduleInputPort;
import com.invoicex.bolanarede.rest.mapper.ScheduleMapper;
import com.invoicex.bolanarede.rest.model.request.ScheduleRequest;
import com.invoicex.bolanarede.rest.model.response.ScheduleResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/schedules")
public class ScheduleController {

    private final RegisterScheduleInputPort registerScheduleInputPort;
    private final ScheduleMapper mapper;
    private final AvailableScheduleInputPort availableScheduleInputPort;

    public ScheduleController(RegisterScheduleInputPort registerScheduleInputPort, ScheduleMapper mapper, AvailableScheduleInputPort availableScheduleInputPort) {
        this.registerScheduleInputPort = registerScheduleInputPort;
        this.mapper = mapper;
        this.availableScheduleInputPort = availableScheduleInputPort;
    }

    @PostMapping("/register")
    public ResponseEntity<ScheduleResponse> register(@RequestBody ScheduleRequest request) {

        return ResponseEntity.ok(
                mapper.parseToResponse(
                        registerScheduleInputPort.registerSchedule(
                                mapper.parseToCore(request)
                        )
                )
        );
    }

    @GetMapping("/{date}")
    public ResponseEntity<AvailableSchedule> getAllAvailableSchedule(@PathVariable LocalDate date) {

        return ResponseEntity.ok(availableScheduleInputPort.getAllAvailableSchedule(date));
    }

}
