package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testTrue() {
        Assert.assertTrue(2==2);
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testFail() {
        Assert.fail("Failing test2 on purpose");
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testFailCondition() {
        Assert.assertTrue(false, "Failing test3 on purpose");
    }
}
