package com.lambdaschool.solution;

import com.lambdaschool.solution.injectors.AthleteCreationInjector;
import com.lambdaschool.solution.injectors.BaseballAthleteCreationInjector;
import com.lambdaschool.solution.injectors.HockeyAthleteCreationInjector;
import com.lambdaschool.solution.injectors.RugbyAthleteCreationInjector;
import com.lambdaschool.solution.injectors.TrackAthleteCreationInjector;

public class Main
{
    public static void main(String[] args)
    {
        AthleteCreationInjector injector;
        Processor app;

        // Create a Track Athlete
        injector = new TrackAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Hockey Athlete
        injector = new HockeyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();


        // Create a Rugby Athlete
        injector = new RugbyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Baseball Athlete
        injector = new BaseballAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

    }
}
