package com.example.demo;

import com.sun.deploy.model.ResourceProvider;
import jdk.nashorn.internal.runtime.options.OptionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Component
public class TennisCoach implements Coach{

    private List<String> schedule = new ArrayList<>();

    public TennisCoach() {

    }

    @Override
    public void getDailyWorkout(){
        Random r = new Random();
        int index = r.nextInt(schedule.size());
        System.out.println(schedule.get(index));
    }

    @PostConstruct
    public void fileReader() throws IOException {
        Resource resource =  new ClassPathResource("tennis_schedule");
        File file = resource.getFile();
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            schedule.add(scan.nextLine());
        }
    }
}
