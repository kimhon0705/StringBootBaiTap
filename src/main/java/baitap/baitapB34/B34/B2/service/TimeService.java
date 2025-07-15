package baitap.baitapB34.B34.B2.service;

import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class TimeService {
    public String getCurrentTime() {
        return LocalTime.now().toString();
    }
}
