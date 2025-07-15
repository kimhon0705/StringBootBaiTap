package baitap.baitapB34.B34.B3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {
    @RequestMapping("/sum")
    public String sum(@RequestParam int a, @RequestParam int b) {
        int result = a + b;
        return result + "";
    }
}
