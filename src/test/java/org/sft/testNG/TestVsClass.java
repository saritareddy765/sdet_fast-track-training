package org.sft.testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestVsClass {
    @BeforeClass
    public void sampleClass(){
        System.out.println("sample Before class");
    }
    @BeforeTest
    public void sampleBeforeTest(){
        System.out.println("sample Before Test");
    }
}
