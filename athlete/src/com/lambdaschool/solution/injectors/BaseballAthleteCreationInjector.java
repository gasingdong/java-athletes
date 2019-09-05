package com.lambdaschool.solution.injectors;

import com.lambdaschool.solution.MyApplication;
import com.lambdaschool.solution.Processor;
import com.lambdaschool.solution.impl.BaseballAthlete;

public class BaseballAthleteCreationInjector implements AthleteCreationInjector {

  @Override
  public Processor getProcess() {
    return new MyApplication(new BaseballAthlete());
  }
}
