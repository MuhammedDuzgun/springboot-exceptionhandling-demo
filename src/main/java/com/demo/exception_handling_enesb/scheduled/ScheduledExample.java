package com.demo.exception_handling_enesb.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledExample {

    // * * * * * * (saniye, dakika, saat, ayin gunu, ay, haftanin gunu)
    @Scheduled(cron = "0/5 52 01 * * *")
    public void write1to10() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "  ");
        }
    }

}
