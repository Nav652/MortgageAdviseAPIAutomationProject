package com.UI_Automation.base;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
    public WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }
    public void setDriver(String browser) {
    //driver = BrowserFactory.OpenBrowser("Chrome");
    driver=BrowserFactory.OpenBrowser(System.getProperty("browser"));
    getDriver().manage().deleteAllCookies();
    getDriver().manage().window().maximize();
}
}
