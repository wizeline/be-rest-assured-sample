package apidemo.generic;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

import static io.restassured.RestAssured.given;

import java.awt.List;

import apidemo.request.LoginRequest;
import apidemo.response.SingleUserResponse;
/**
 * GenericAPI
 */
@Slf4j
public class GenericAPI {

    //Basic GET request, receives endpoint and path as parameters
    protected Response getApiResponse(String endpoint, String path){
        RestAssured.baseURI = endpoint;

        Response ret = given()
                    .when()
                    .get(path)
                    .then()
                    .extract().response();
                    
        return ret;
    }

    
    protected <V> Response postJsonObjectAndGetResponse(String endpoint,String path, V request){
        RestAssured.baseURI = endpoint;

        Response ret = given()
                    .contentType(ContentType.JSON)
                    .body(request)
                    .post(path)
                    .then()
                    .extract().response();
        return ret;
    }

    protected Response postJsonStringAndGetResponse(String endpoint,String path, String request){
        RestAssured.baseURI = endpoint;

        Response ret = given()
                    .contentType(ContentType.JSON)
                    .body(request)
                    .post(path)
                    .then()
                    .extract().response();
        return ret;
    }

    protected <T, V> Object getApiResponsePost(String endpoint,String path, Class<T> clazz) {

        RestAssured.baseURI = endpoint;
        log.info("RestAssured.baseURI is {}", RestAssured.baseURI);

        Object response = given()
                .when()
                .get(path)
                .then()
                .extract()
                .body()
                .jsonPath()
                .getObject(".", clazz);
        return response;
    }
}