package com.TestngRetryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testAnnotationTransformer {
    @Test
    public void testMethod1(){
        Assert.assertEquals(true, true);
    }

    @Test
    public void testMethod2(){
        Assert.assertEquals(false, true);
    }
}

