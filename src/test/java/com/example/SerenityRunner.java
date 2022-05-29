package com.example;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features="src/test/resources/features/",
    glue="com.example",
    stepNotifications = true,
    tags = "@sample")
public class SerenityRunner {}
