package com.UI_Automation.stepdef;

import com.UI_Automation.base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import com.UI_Automation.pages.Form_Details;

public class Request_call_back_stepdef extends DriverFactory {
public WebDriver driver;


    @Given("User is in Contact-us page")
    public void user_is_in_contact_us_page() {
        DriverFactory driverFactory=new DriverFactory();
        driverFactory.setDriver("chrome");
        this.driver=driverFactory.getDriver();
        driver.get("https://www.mortgageadvicebureau.com/contact-us");
        // Write code here that turns the phrase above into concrete actions

    }

  //  @When("User enters the below details in the Request Call back form {string},{string},{string},{string},{string},{string}")
    @When("User enters the below details in the Request Call back form {string},{string},{string},{string},{string},{string}")
    public void user_enters_the_below_details_in_the_request_call_back_form
            (String FirstName,String Lastname,String Emailaddress,String Contactnumber,String Timetocall,String Reason) {
       Form_Details.form_details(driver,FirstName,Lastname,Emailaddress,Contactnumber,Timetocall,Reason);

    }

    @Then("user should be able to see the entered details in the form")
    public void user_should_be_able_to_see_the_entered_details_in_the_form() {
        // Write code here that turns the phrase above into concrete actions
      //driver.close();
        driver.quit();
    }


}
