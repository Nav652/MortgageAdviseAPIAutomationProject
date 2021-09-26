package com.UI_Automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        plugin = {"pretty","html:target/cucumber-reports.html"},
        features = "features/Request_Call_Back.feature",
        glue= "com.UI_Automation.stepdef",
        monochrome=true
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
