package com.org;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Non_BDD_format {

    RequestSpecification r;
    Response res;
    ValidatableResponse vr;
    String payload;
    @Test
    public void Test(){

        payload = "{\n" +
                "  \"username\": \"admin\",\n" +
                "  \"password\": \"password123\"\n" +
                "}";

        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload);
        r.log().all();

        res=r.when().log().all().post();

        vr=res.then().log().all().statusCode(200);

    }
}

