package com.API_Automation.testcases;
import static com.API_Automation.config.APIPath.POST_LOGIN_SUCCESSFUL;
import static com.API_Automation.config.APIPath.POST_LOGIN_UNSUCCESSFUL;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import com.API_Automation.config.APIPath;
import com.API_Automation.config.BaseTest;
import com.API_Automation.config.payload;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Post_Login_Successful extends BaseTest {

    private static RequestSpecification requestSpecification;
    private static Response response;
    /**
     * API Post Successful Request : Convert the response JSON body to Java Object
     * This method will run before any test case and is dependent on BaseTest.setup
     */
    @BeforeClass(dependsOnMethods = "setup")
   // @Test
    public void postLoginSuccessful() {
        response=given()
                .header("Content-Type","application/json")
                .body(payload.Post_Login_Successful())
                .when()
                .post(POST_LOGIN_SUCCESSFUL)
                .then()
                .extract().response();

    }

    @Test(priority = 0)   //This test will run first to confirm the successful post call.
    public void postLogin_StatusCode() {
        Assert.assertEquals(response.getStatusCode(), 200
                , "Post Request Response code mismatch -->");
        System.out.println(response.getBody().asString());
    }
    @Test
    public void postlogin_Body_Validation(){
        Assert.assertEquals(response.getBody().asString(), payload.postResponse());
    }



}
