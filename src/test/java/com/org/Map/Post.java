package com.org.Map;



import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

import static io.restassured.RestAssured.requestSpecification;

public class Post {

    RequestSpecification rs;
    Response re;
    ValidatableResponse vs;
    String token;
    Integer bookingID;


    @Test
    public void test_createBooking_POST() {

        // String Payload
       Map<String, Object> a= new LinkedHashMap<>();
       a.put("firstname","Anil");
       a.put("lastname","Sy");
       a.put("totalprice",123);
       a.put("depositpaid",false);
       a.put("additionalneeds","Dinning");

       Map<String,Object> b=new LinkedHashMap<>();
       b.put("checkin","2018-01-01" );
       b.put("checkout","2019-01-01");
       a.put("bookingdates",b);





        rs=RestAssured.given();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/booking");
        rs.contentType(ContentType.JSON);
        rs.body(a).log().all();

        re= rs.when().post();

        // Get Validatable response to perform validation
        vs = re.then().log().all();

        vs.statusCode(200);

        vs.body("bookingid", Matchers.notNullValue());
        vs.body("booking.firstname", Matchers.equalTo("Pramod"));
        vs.body("booking.lastname", Matchers.equalTo("Brown"));
        vs.body("booking.depositpaid", Matchers.equalTo(true));
    }
}

