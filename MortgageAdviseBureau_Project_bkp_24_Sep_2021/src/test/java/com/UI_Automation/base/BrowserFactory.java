package com.UI_Automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public static WebDriver OpenBrowser(String browserName) {
        WebDriver driver = null;
        if (browserName.equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
            ChromeOptions opt = new ChromeOptions();
           // opt.addArguments("--headless");
            driver = new ChromeDriver(opt);

        } else
        {
            //browserName.equalsIgnoreCase("Firefox"));
            System.setProperty("webdriver.geeko.driver", "./geekodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }
}