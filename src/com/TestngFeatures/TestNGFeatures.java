package com.TestngFeatures;

import org.testng.annotations.Test;

public class TestNGFeatures {

    /*
    dependsOnMethod = if loginTest() failed then HomeTest() will be skipped and not executed
     */
    @Test
    public void loginTest(){
        System.out.println("loginTest() called");
        int i = 5/0;
    }

    @Test(dependsOnMethods = "loginTest")
    public void HomeTest() {
        System.out.println("HomeTest() called");
    }

    /*
    InvocationCount feature in TestNG = executing same method for n num of times
     */

    @Test(invocationCount = 5)
    public void sumTest() {
        int a =10;
        int b = 20;
        int c = a + b;
        System.out.println("Sum= " +c);
    }
}
