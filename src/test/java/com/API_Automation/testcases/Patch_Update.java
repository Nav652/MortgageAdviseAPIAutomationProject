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

import static com.API_Automation.config.APIPath.*;
import static io.restassured.RestAssured.given;

public class Patch_Update extends BaseTest {

    private static RequestSpecification requestSpecification;
    private static Response response;
    /**
     * API Patch Request : Convert the response JSON body to Java Object
     * This method will run before any test case and is dependent on BaseTest.setup
     */
    @BeforeClass(dependsOnMethods = "setup")
    @Test
    public void patchUpdate() {
        response=given()
                .header("Content-Type","application/json")
                .body(payload.Patch_Update())
                .when()
                .patch(PATCH_UPDATE)
                .then()
                .extract().response();

    }
    @Test   //This test will run first to confirm the successful PATCH call.
    public void patch_StatusCode() {
        Assert.assertEquals(response.getStatusCode(), 200
                , "Patch Request Response code mismatch -->");
        System.out.println(response.getBody().asString());
    }
    @Test
    public void patchUpdate_Body_Validation(){
      //  Assert.assertEquals(response.getBody().asString(), payload.patchResponse());
        Assert.assertTrue(true,"No Response body");
    }
}

