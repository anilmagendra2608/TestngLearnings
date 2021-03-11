package com.TestngRetryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testRetryAnalyzer {

    /*
    This is Test level retryAnalyzer to retry the test n no of times defined in RetryAnlayzer class
    which needs to be written at every test method
     */
    @Test(retryAnalyzer = com.TestngRetryAnalyzer.RetryAnalyzer.class)
    public void testMethod1(){
        Assert.assertEquals(false, true);
    }

    @Test(retryAnalyzer = com.TestngRetryAnalyzer.RetryAnalyzer.class)
    public void testMethod2(){
        Assert.assertEquals(false, true);
    }

}
