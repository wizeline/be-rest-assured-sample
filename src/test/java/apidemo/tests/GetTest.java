package apidemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import apidemo.api.MyApi;
import apidemo.response.SingleUserResponse;
import io.restassured.response.Response;

/**
 * GetTest
 */
public class GetTest extends MyApi{

    @Test
    public void UserTest1(){
        Response r = getUserData("1");
        Assert.assertEquals(r.statusCode(), 200);
        System.out.println(r.getBody().prettyPrint());
        Assert.assertTrue(r.getBody().asString().contains("george.blut@reqres.in"));
    }

    @Test
    public void UserTest2(){
        Response r = getUserData("1");
        Assert.assertEquals(r.statusCode(), 200);
        System.out.println(r.getBody().prettyPrint());
        Assert.assertTrue(r.getBody().asString().contains("george.blut@reqrest.in"));
    }

    @Test
    public void UserTest3(){
        SingleUserResponse response = postSingleUserGetObject("2");
        System.out.println(response.toString());       
        Assert.assertEquals(response.getData().getEmail(), "janet.weaver@reqres.in");
        Assert.assertEquals(response.getData().getFirst_name(), "Janet");
        Assert.assertEquals(response.getData().getLast_name(), "Weaver");
    }


    
}