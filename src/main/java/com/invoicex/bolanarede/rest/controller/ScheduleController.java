package com.invoicex.bolanarede.rest.controller;

import com.invoicex.bolanarede.core.port.input.RegisterScheduleInputPort;
import com.invoicex.bolanarede.rest.mapper.ScheduleMapper;
import com.invoicex.bolanarede.rest.model.request.ScheduleRequest;
import com.invoicex.bolanarede.rest.model.response.AvailableScheduleResponse;
import com.invoicex.bolanarede.rest.model.response.ScheduleResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/schedulling")
public class ScheduleController {

    private final RegisterScheduleInputPort inputPort;
    private final ScheduleMapper mapper;

    public ScheduleController(RegisterScheduleInputPort inputPort, ScheduleMapper mapper) {
        this.inputPort = inputPort;
        this.mapper = mapper;
    }

    @PostMapping("/register")
    public ResponseEntity<ScheduleResponse> register(@RequestBody ScheduleRequest request) {

        return ResponseEntity.ok(
                mapper.parseToResponse(
                        inputPort.registerASchedule(
                                mapper.parseToCore(request)
                        )
                )
        );
    }

}
