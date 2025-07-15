package baitap.baitapB34.B34.B4.controller;

import baitap.baitapB34.B34.B4.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculatorController {

    private final CalculatorService calculatorService;

    // Constructor injection
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(calculatorService.add(a, b));
    }

    @GetMapping("/subtract")
    public String subtract(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(calculatorService.subtract(a, b));
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(calculatorService.multiply(a, b));
    }
    @GetMapping("/divide")
    public String divide(@RequestParam int a, @RequestParam int b) {
        try {
            return String.valueOf(calculatorService.divide(a, b));
        } catch (ArithmeticException e) {
            return "Error: " + e.getMessage();
        }
    }
}
