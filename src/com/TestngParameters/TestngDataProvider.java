package com.TestngParameters;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngDataProvider {
//    WebDriver driver;
    @BeforeMethod
    public void setup(){

    }

    @DataProvider
    @Test
    public Object[] testDataProvider() {

        return new Object[0];
    }

    @AfterMethod
    public void tearDown() {

    }
}
