package baitap.baitapB34.B34.B1.controller;

import baitap.baitapB34.B34.B1.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "World") String name) {
        return greetingService.sayHello(name);
    }
}
