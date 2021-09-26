package com.API_Automation.config;

import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;
import org.json.simple.JSONObject;

public class payload {
    public static String Post_Login_Successful() {
        JSONObject jsonBody = new JSONObject();
        jsonBody.put("email", "eve.holt@reqres.in");
        jsonBody.put("password", "cityslicka");
        String body = jsonBody.toJSONString();
        return body;
    }

    public static String postResponse() {
        JSONObject jobj = new JSONObject();
        jobj.put("token", "QpwL5tke4Pnpja7X4");
        return jobj.toJSONString();
    }

    public static String Post_Login_UnSuccessful() {

            JSONObject jsonBody = new JSONObject();
            jsonBody.put("email", "peter@klaven");
            String body = jsonBody.toJSONString();
            return body;

    }

    public static String postResponseUnsuccessful() {
        JSONObject jobj = new JSONObject();
        jobj.put("error", "Missing password");
        return jobj.toJSONString();
    }

    public static String Patch_Update()
        {
            JSONObject jsonBody= new JSONObject();
            jsonBody.put("name","morpheus");
            jsonBody.put("job","zion resident");
            String  body= jsonBody.toJSONString();
            return body;
        }

    public static String patchResponse() {
        JSONObject jobj = new JSONObject();
        jobj.put("name", "morpheus");
        jobj.put("job","zion resident");

        return jobj.toJSONString();
    }

    public static String Put_Update()
    {
            JSONObject jsonBody= new JSONObject();
            jsonBody.put("name","morpheus");
            jsonBody.put("job","zion resident");
            String  body= jsonBody.toJSONString();
            return body;
    }

    public static String putResponse() {
        JSONObject jobj = new JSONObject();
        jobj.put("name", "morpheus");
        jobj.put("job","zion resident");
        return jobj.toJSONString();
    }
}
