package com.org;

import io.restassured.RestAssured;


public class Simple_basic_restassured_program {
    public static void main(String[] args) {

        System.out.println("Hello world");
        RestAssured
                .given().baseUri("Https://google.com").log().all()
                .when().get()
                .then().statusCode(200).log().all();

    }
}
