package com.santos.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RandomFileFortuneService implements FortuneService {

  private String fileName =
      "D:\\Side_Projs\\SpringLearning\\Spring Hibernate for Beginners\\spring-demo-annotations\\src\\com\\santos\\springdemo\\fortune.txt";
  private List<String> theFortunes;

  private Random random = new Random();
  // create a random number generator

  public RandomFileFortuneService() {
    System.out.println(">> FileFortuneService: inside default constructor");
  }

  @PostConstruct
  private void loadTheFortunesFiles() {
    File file = new File(fileName);

    System.out.println("Reading fortunes from file: " + file);
    System.out.println("File exists: " + file.exists());

    // initialize array list
    theFortunes = new ArrayList<String>();

    // read fortunes from file

    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      String tempLine;
      while ((tempLine = reader.readLine()) != null) {
        theFortunes.add(tempLine);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public String getFortune() {
    // pick a random string from the array
    int index = random.nextInt(theFortunes.size());

    String theFortune = theFortunes.get(index);

    return theFortune;
  }
}
