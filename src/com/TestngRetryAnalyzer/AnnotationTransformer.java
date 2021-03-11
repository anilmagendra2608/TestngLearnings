package com.TestngRetryAnalyzer;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
This is Run time level RetryAnalyzer logic:
So example after test run for 100 testcases - 20 failed 70 passed
so this logic will check those 20 failed tests and rerun again by retry logic below with counter defined say counter =3 so each
failed testcase will run 3 times.
 */
public class AnnotationTransformer implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation iTestAnnotation, Class testClass, Constructor testConstructor, Method testMethod) {

        // Setting Annotation with RetryAnalyzer logic we wrote
        iTestAnnotation.setRetryAnalyzer(RetryAnalyzer.class);

    }
}
