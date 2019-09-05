package com.lambdaschool.solution.injectors;

import com.lambdaschool.solution.MyApplication;
import com.lambdaschool.solution.Processor;
import com.lambdaschool.solution.impl.RugbyAthlete;

public class RugbyAthleteCreationInjector implements AthleteCreationInjector {

  @Override
  public Processor getProcess() {
    return new MyApplication(new RugbyAthlete());
  }
}
