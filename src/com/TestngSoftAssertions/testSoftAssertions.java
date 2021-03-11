package com.TestngSoftAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testSoftAssertions {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testHardAssertions(){
        System.out.println("Open Browser");
        /* hard Assertion
        * if this below line fail- it wont execute further and fail the test*/
        Assert.assertEquals(true, false);
        System.out.println("Enter UserName");
        System.out.println("Enter Password");
        System.out.println("Click on Login");
        System.out.println("Exit");
    }

    @Test
    public void testSoftAssertions(){
        System.out.println("Open Browser");
        /* Soft Assertion
         * if any below line fail- it will still continue execution further
         * and assertAll() method will check final count of failure in this method and
         * fail the test at the very end but it will execute all lines irrespective of failure */
        softAssert.assertEquals(true, false);
        System.out.println("Enter UserName");
        System.out.println("Enter Password");
        System.out.println("Click on Login");

        System.out.println("Validate HomePage Logo");
        softAssert.assertEquals(true, false);
        System.out.println("Do Click");
        System.out.println("exit");

        softAssert.assertAll(); // This will fail the test at very end if there is any failure happened in above line
    }
}
