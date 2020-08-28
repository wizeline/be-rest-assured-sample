package apidemo.api;

import apidemo.generic.GenericAPI;
import apidemo.request.LoginRequest;
import apidemo.response.SingleUserResponse;
import io.restassured.response.Response;

/**
 * MyApi
 */
public class MyApi extends GenericAPI{

    private static final String REQRES_ENDPOINT = "https://reqres.in/api/";

    //function that sends a GET request to retrieve the specified user data
    public Response getUserData(String id){
        return getApiResponse(REQRES_ENDPOINT,"/users/"+id);
    }

    //Sends a POST request in JSON format
    public Response postLoginWithString(String json){
        return postJsonStringAndGetResponse(REQRES_ENDPOINT,"login",json);
    }

    //Function that sends a POST request using the object LoginRequest
    public Response postLoginWithObject(LoginRequest request){
        return postJsonObjectAndGetResponse(REQRES_ENDPOINT,"login",request);
    }


    public SingleUserResponse postSingleUserGetObject(String id){
        return (SingleUserResponse) getApiResponsePost(REQRES_ENDPOINT, "/users/" + id, SingleUserResponse.class);
    }
}