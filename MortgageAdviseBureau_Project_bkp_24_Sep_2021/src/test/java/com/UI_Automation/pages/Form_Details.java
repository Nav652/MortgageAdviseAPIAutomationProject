package com.UI_Automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Form_Details {

    public static void form_details(WebDriver driver,String firstName, String lastname, String emailaddress, String contactnumber, String timetocall, String reason) {
        driver.findElement(By.id("FirstName")).sendKeys(firstName);
        driver.findElement(By.id("LastName")).sendKeys(lastname);
        driver.findElement(By.id("EmailAddress")).sendKeys(emailaddress);
        driver.findElement(By.name("PhoneNumber")).sendKeys(contactnumber);
        driver.findElement(By.name("BestTimeToCallYou")).sendKeys(timetocall);

        // Code to Handle Static Drop downs
        WebElement StaticDropdown = driver.findElement(By.id("ReasonForEnquiry"));
        Select dropdown = new Select(StaticDropdown);
        //dropdown.selectByValue("Conveyancing");
        dropdown.selectByVisibleText(reason);
       // dropdown.selectByIndex(3);
        System.out.println(driver.findElement(By.id("OptInEmail")).isSelected());
        driver.findElement(By.id("OptInEmail")).click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        // because the checkbox is at the bottom.
        js.executeScript("scroll(0, 250)");
        System.out.println(driver.findElement(By.name("OptInEmail")).isSelected());

    }
}
