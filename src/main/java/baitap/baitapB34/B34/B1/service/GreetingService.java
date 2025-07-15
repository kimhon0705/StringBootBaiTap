package baitap.baitapB34.B34.B1.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
