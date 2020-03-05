package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class Player {

    private File file;
    private Coach tennisCoach;
    private Coach golfCoach;

    @Autowired
    private Coach footballCoach;

    @Autowired
    public Player(Coach tennisCoach) {
        this.tennisCoach = tennisCoach;
    }

    @Autowired
    public void setGolfCoach(Coach golfCoach) {
        this.golfCoach = golfCoach;
    }

    @Autowired
    @Qualifier("tennisCoach")
    private Coach coach;

    public void getDailyWorkout() {
        footballCoach.getDailyWorkout();
        golfCoach.getDailyWorkout();
        tennisCoach.getDailyWorkout();
        coach.getDailyWorkout();
    }
}
