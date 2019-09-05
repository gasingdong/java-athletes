package com.lambdaschool.solution;

public class MyApplication {

  private Athlete athlete;

  public MyApplication(Athlete athlete) {
    this.athlete = athlete;
  }

  public void create() {
    System.out.println("************");
    athlete.display();
    System.out.println("************\n");
  }
}
