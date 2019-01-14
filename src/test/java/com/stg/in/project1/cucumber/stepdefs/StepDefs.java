package com.stg.in.project1.cucumber.stepdefs;

import com.stg.in.project1.Project1App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = Project1App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
