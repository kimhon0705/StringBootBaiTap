package baitap.baitapB34.B34.B2.config;

import baitap.baitapB34.B34.B2.service.TimeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public TimeService timeService() {
        return new TimeService();
    }
}
