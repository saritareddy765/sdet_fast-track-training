package org.sft.testNG;

import org.testng.annotations.Test;

public class PrioritizeTests {
    @Test(priority = 0)
    public void test1W(){
        System.out.println("Test1");
    }


    @Test(priority = 2)
    public void test2X(){
        System.out.println("Test2");
    }


    @Test(priority = 3)
    public void test3Z(){
        System.out.println("Test3");
    }


    @Test(priority = 1)
    public void test4Y(){
        System.out.println("Test4");
    }
}
