package com.acme.alomundo.cucumber.stepdefs;

import com.acme.alomundo.AngularspringbootmicrosservicoApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = AngularspringbootmicrosservicoApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
