package org.sft.testNG;

import org.testng.annotations.*;

public class TestNGAnnotations {
    @BeforeSuite
    public void initializeDBReports(){
        System.out.println("initializeDBReports");
    }
    @AfterSuite
    public void closeDBReports(){
        System.out.println("closeDBReports");
    }
    @BeforeTest
    public void launchApplication(){
        System.out.println("launchApplication");
    }
    @AfterTest
    public void closeSession(){
        System.out.println("closeSession");
    }
    @BeforeClass
    public void initializePages(){
        System.out.println("initializePages");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass");
    }
    @Test
    public void lastTest(){
        System.out.println("lastTest");
    }
    @Test
    public void firstTest(){
        System.out.println("firstTest");
    }
    @Test
    public void secondTest(){
        System.out.println("secondTest");
    }
    @BeforeMethod
    public void beforeEveryTestCase(){
        System.out.println("beforeEveryTestCase");
    }
    @AfterMethod
    public void afterEveryTestCase(){
        System.out.println("afterEveryTestCase");
    }
}
