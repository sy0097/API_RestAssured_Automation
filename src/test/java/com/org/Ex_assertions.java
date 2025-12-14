package com.org;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Ex_assertions {


    @Test
    public void test_Hard(){
            System.out.println("start");
            Assert.assertEquals("pramod","Pramod");
            System.out.println("end");
        }


        @Test
        public void test_Soft(){
            System.out.println("start");
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertEquals("pramod","Pramod");
            System.out.println("end");
            softAssert.assertAll();
        }
    }

