package com.RSA.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/RSA/feature",
        glue = "com/RSA/stepDefinition") // "com/RSA/stepDefinition"
public class TestRunner {

}
