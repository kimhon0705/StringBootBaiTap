package baitap.baitapB34.B34.B5.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping("/{username}")
    public String welcomeUser(
            @PathVariable String username,
            @RequestParam(defaultValue = "en") String lang) {

        if (lang.equalsIgnoreCase("vi")) {
            return "Xin chào, " + username;
        } else {
            return "Hello, " + username;
        }
    }
}