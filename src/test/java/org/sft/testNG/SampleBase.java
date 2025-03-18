package org.sft.testNG;

import org.testng.annotations.*;

public class SampleBase {
    @BeforeSuite
    public void sampleBeforeSuite(){
        System.out.println("sampleBeforeSuite");
    }

    @BeforeClass
    public void sampleClass(){
        System.out.println("sampleBeforeClass");
    }

    @BeforeTest
    public void sampleBeforeTest(){
        System.out.println("sampleBeforeTest");
    }

    @BeforeMethod
    public void beforeEveryTestCase(){
        System.out.println("beforeEveryTestCase");
    }

    @AfterMethod
    public void afterEveryTestCase(){
        System.out.println("afterEveryTestCase");
    }

    @AfterClass
    public void afterEveryClass(){
        System.out.println("afterEveryClass");
    }

    @AfterTest
    public void afterAllTheClasses(){
        System.out.println("afterAllTheClasses");
    }

    @AfterSuite
    public void afterExecution(){
        System.out.println("afterExecution");
    }

    @Test
    public void automationTest(){
        System.out.println("Testing Selenium");
    }
}
