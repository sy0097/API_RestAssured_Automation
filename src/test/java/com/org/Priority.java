package com.org;

import org.testng.annotations.Test;

public class Priority {

    @Test(priority = 3)
    public void test_1(){
        System.out.println("Step1");
    }

    @Test(priority = 2)
    public void test_2(){
        System.out.println("Step2");
    }
    @Test(priority = -1)
    public void test_4(){
        System.out.println("Step4");
    }

    @Test(priority = 1)
    public void test_3(){
        System.out.println("Step3");
    }

}