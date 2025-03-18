package org.sft.testNG;

import org.testng.annotations.Test;

public class DependsOnTests {
    @Test(dependsOnMethods = "test3Z")
    public void test1W(){
        System.out.println("Test1");
    }
    @Test
    public void test2X(){
        System.out.println("Test2");
    }
    @Test
    public void test3Z(){
        System.out.println("Test3");
    }
    @Test(dependsOnMethods = "test1W")
    public void test4Y(){
        System.out.println("Test4");
    }
}
