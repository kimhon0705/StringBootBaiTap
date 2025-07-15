package baitap.baitapB34.B34.B2.controller;

import baitap.baitapB34.B34.B2.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {
    private final TimeService timeService;
    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public String getCurrentTime() {
        return timeService.getCurrentTime();
    }
}
