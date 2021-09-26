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

import static com.API_Automation.config.APIPath.PATCH_UPDATE;
import static com.API_Automation.config.APIPath.PUT_UPDATE;
import static io.restassured.RestAssured.given;

public class Put_Update extends BaseTest {

    private static RequestSpecification requestSpecification;
    private static Response response;
    /**
     * Reqres API Put Request : Convert the response JSON body to Java Object
     * This method will run before any test case and is dependent on BaseTest.setup
     */ 
    @BeforeClass(dependsOnMethods = "setup")
    @Test
    public void putUpdate() {
        response=given()
                .header("Content-Type","application/json")
                .body(payload.Put_Update())
                .when()
                .put(PUT_UPDATE)
                .then()
                .extract().response();

    }

    @Test(priority = 0)   //This test will run first to confirm the successful PUT call.
    public void put_StatusCode() {
        Assert.assertEquals(response.getStatusCode(), 200
                , "Put Request Response code mismatch -->");
        System.out.println(response.getBody().asString());
    }
    @Test
    public void putUpdate_Body_Validation(){
        //Assert.assertEquals(response.getBody().asString(), payload.putResponse());
        //Assert.assertTrue(true,"No Response body");
    }
}

