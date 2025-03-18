package org.sft.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo {
    @Test
    public void login(){
        Assert.assertFalse(true);
        Assert.assertEquals("Test", "Test");
        Assert.assertEquals(true, true);
        Assert.assertTrue(true);
        Assert.assertFalse(false);
    }


    @Test
    public void register(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Test", "Test1");
        softAssert.assertEquals(false, true);
        softAssert.assertTrue(true);
        softAssert.assertFalse(false);
        softAssert.assertAll();
    }
}
