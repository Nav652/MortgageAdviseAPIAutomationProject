package com.API_Automation.testcases;

import com.API_Automation.config.APIPath;
import com.API_Automation.config.BaseTest;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Post_Login_UnSuccessful extends BaseTest {

    private static RequestSpecification requestSpecification;
    private static Response response;
    /**
     * API Post Request : Convert the response JSON body to Java Object
     * This method will run before any test case and is dependent on BaseTest.setup
     */ 
    @BeforeClass(dependsOnMethods = "setup")
    public void postLoginSuccesful() {
        requestSpecification = RestAssured.given();
        response = requestSpecification.request(Method.POST, APIPath.POST_LOGIN_UNSUCCESSFUL);
        System.out.println(response.getBody().asString().toString());

    }

    /**
     * Validate GET Response StatusCode
     */
    @Test(priority = 0)   //This test will run first to confirm the successful GET call.
    public void getAllUsers_StatusCode() {
        Assert.assertEquals(response.getStatusCode(), 200
                , "Get Request Response code mismatch -->");
    }

}
