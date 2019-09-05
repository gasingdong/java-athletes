package com.lambdaschool.solution.injectors;

import com.lambdaschool.solution.MyApplication;
import com.lambdaschool.solution.Processor;
import com.lambdaschool.solution.impl.HockeyAthlete;

public class HockeyAthleteCreationInjector implements AthleteCreationInjector {

  @Override
  public Processor getProcess() {
    return new MyApplication(new HockeyAthlete());
  }
}