package com.org;

import io.restassured.RestAssured;

public class Tetscases_with_nonTestngmethod {
    public static void main(String[] args) {
        String pincode="560037";
        RestAssured
                .given().baseUri("https://zippopotam.us/")
                .basePath("/IN/" +pincode)
                .when().get()
                .then()
                .log().all().statusCode(200);

        pincode=" ";
        RestAssured
                .given().baseUri("https://zippopotam.us/")
                .basePath("/IN/" +pincode)
                .when().get()
                .then()
                .log().all().statusCode(200);

        pincode="@";
        RestAssured
                .given().baseUri("https://zippopotam.us/")
                .basePath("/IN/" +pincode)
                .when().get()
                .then()
                .log().all().statusCode(200);

    }
}
