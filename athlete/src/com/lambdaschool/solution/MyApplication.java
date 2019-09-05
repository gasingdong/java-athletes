package com.lambdaschool.solution;

import com.lambdaschool.solution.impl.Athlete;

public class MyApplication implements Processor {

  private Athlete athlete;

  public MyApplication(Athlete athlete) {
    this.athlete = athlete;
  }

  @Override
  public void displayAthlete() {
    System.out.println("************");
    athlete.display();
    System.out.println("************\n");
  }
}
