package com.org;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Automation_RestAssured {

    String pincode;
    @Test
    public void Test1(){
        pincode="560037";
        RestAssured
                .given().baseUri("https://zippopotam.us/")
                .basePath("/IN/" +pincode)
                .when().get()
                .then()
                .log().all().statusCode(200);
    }

    @Test
    public void Test2(){
        pincode="@";
        RestAssured
                .given().baseUri("https://zippopotam.us/")
                .basePath("/IN/" +pincode)
                .when().get()
                .then()
                .log().all().statusCode(200);
    }

    @Test
    public void Test3(){
        pincode=" ";
        RestAssured
                .given().baseUri("https://zippopotam.us/")
                .basePath("/IN/" +pincode)
                .when().get()
                .then()
                .log().all().statusCode(200);
    }

    
}
