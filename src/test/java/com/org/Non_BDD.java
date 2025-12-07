package com.org;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Non_BDD {

    RequestSpecification r;
    Response res;
    ValidatableResponse vr;
    String pincode;
    @Test
    public void Test_123(){
        pincode="560049";
        r = RestAssured.given();
        r.baseUri("https://zippopotam.us/");
        r.basePath("/IN/" + pincode);

        res= r.when().log().all().get();
        System.out.println(res.asString());

        vr=res.then().log().all();
        vr.statusCode(200);

    }

}
