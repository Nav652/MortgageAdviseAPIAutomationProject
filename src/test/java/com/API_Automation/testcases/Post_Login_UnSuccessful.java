package com.API_Automation.testcases;

import com.API_Automation.config.APIPath;
import com.API_Automation.config.BaseTest;
import com.API_Automation.config.payload;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.API_Automation.config.APIPath.POST_LOGIN_SUCCESSFUL;
import static com.API_Automation.config.APIPath.POST_LOGIN_UNSUCCESSFUL;
import static io.restassured.RestAssured.given;

public class Post_Login_UnSuccessful extends BaseTest {

    private static RequestSpecification requestSpecification;
    private static Response response;
    /**
     * API Post UnsuccessfulRequest : Convert the response JSON body to Java Object
     * This method will run before any test case and is dependent on BaseTest.setup
     */ 
    @BeforeClass(dependsOnMethods = "setup")
    @Test
    public void postLoginUnSuccessful() {
        response=given()
                .header("Content-Type","application/json")
                .body(payload.Post_Login_UnSuccessful())
                .when()
                .post(POST_LOGIN_UNSUCCESSFUL)
                .then()
                .extract().response();

    }

    @Test(priority = 0)   //This test will run first to confirm the successful POST call.
    public void postLoginUnsuccessful_StatusCode() {
        Assert.assertEquals(response.getStatusCode(), 400
                , "Post Request Response code mismatch -->");
        System.out.println(response.getBody().asString());
    }
    @Test
    public void postloginUnsuccessful_Body_Validation(){
        Assert.assertEquals(response.getBody().asString(), payload.postResponseUnsuccessful());
    }



}


