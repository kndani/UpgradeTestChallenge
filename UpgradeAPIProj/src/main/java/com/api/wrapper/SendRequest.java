package com.api.wrapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class SendRequest {

    private static Response response;

    private static RequestSpecification requestSpecification;

    public static RequestSpecification setBaseURI(String baseURI){
        return requestSpecification = RestAssured.given().baseUri(baseURI);
    }

    public static void setEndPath(String endPath){
        requestSpecification.basePath(endPath);
    }

    public static void setBody(String body){
        System.out.println("Request Body: " + body);
        requestSpecification.body(body);
    }

    public static void setHeader(Map<String, String> headersMap){
        requestSpecification.headers(headersMap);
    }

    public static void sendPostRequest(){
        response = requestSpecification.post();
        System.out.println("Response: " + response.getBody().asString());
    }

    public static Response getResponse(){
        return response;
    }
}
