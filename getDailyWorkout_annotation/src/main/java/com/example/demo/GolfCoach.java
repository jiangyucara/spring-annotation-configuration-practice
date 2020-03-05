package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach {
    @Override
    public void getDailyWorkout(){
        System.out.println("Do your golf workout");
    }
}
