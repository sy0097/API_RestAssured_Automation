package com.org;

public class Builder {

        public Builder step1(){
            System.out.println("hello world");
            return this;
        }
        public Builder step2(){
            System.out.println("hello world");
            return this;
        }
        public Builder step3(String input){
            System.out.println("hello world");
            return this;
        }
        public static void main(String[] args) {
            Builder j=new Builder();
            j.step1().step2().step3("promod");

        }
    }

