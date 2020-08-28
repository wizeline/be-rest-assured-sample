package apidemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import apidemo.api.MyApi;
import apidemo.request.LoginRequest;
import io.restassured.response.Response;

/**
 * PostTest
 */
public class PostTest extends MyApi {

    @Test
    public void Posttest1(){
        Response r = postLoginWithString("{\"email\": \"eve.holt@reqres.in\",\"password\": \"cityslicka\"}");
        System.out.println(r.getBody().asString());
    }

    @Test
    public void PostTest2(){
        LoginRequest t = LoginRequest.builder() 
                        .email("eve.holt@reqres.in")
                        .password("cityslicka")
                        .build();

        Response r = postLoginWithObject(t);
        System.out.println(r.getBody().asString());
        Assert.assertEquals(r.statusCode(), 200);
        System.out.println("Status Code:"+r.statusCode());
    }
}