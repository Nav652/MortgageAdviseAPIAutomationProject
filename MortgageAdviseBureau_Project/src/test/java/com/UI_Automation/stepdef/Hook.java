package com.UI_Automation.stepdef;

import com.UI_Automation.base.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook extends DriverFactory {

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {

             byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach( screenshot,"image/png", "screenshot"); // ... and embed it in the report.
            driver.quit();
        }
    }
}