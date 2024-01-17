package com.charlene.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkdout() {
        return "Practice fast bowling for 15 minutes!!!";
    }
}
