package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    @Override
    public void getDailyWorkout(){
        System.out.println("Do your football workout");
    }
}
