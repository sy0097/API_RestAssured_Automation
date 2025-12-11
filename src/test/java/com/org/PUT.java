package com.org;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
//import com.github.javafaker.Faker;

public class PUT {

    RequestSpecification rq;
    Response rs;
    ValidatableResponse vr;

    @Test
    public void test(){
       String token="mm6i1fbgg5lu9hhgnxv9b";
       String bookingid="5";
       /* Faker faker = new Faker();

        String name = faker.name().fullName();*/
        //System.out.println(name);

        String payload = "{\n" +
                "    \"firstname\" : \"Promod\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";


        rq= RestAssured.given();
        rq.baseUri("https://restful-booker.herokuapp.com");
        rq.basePath("/booking/" + bookingid);
        rq.contentType(ContentType.JSON);
        rq.cookie("token",token);
        rq.body(payload).log().all();

        rs = rq.when().log().all().put();

        vr=rs.then().log().all();
        vr.statusCode(200);



    }

}
