package com.shash;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyLogger {

    @Scheduled(fixedRate = 1000)
    public String getMessage(){
        log.info("Good evening");
        return "Good evening";
    }
}
