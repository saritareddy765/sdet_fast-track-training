package org.sft.testNG;

import org.testng.annotations.Test;

public class ParallelExecutions {
    @Test(groups = "smoke")
    public void test1(){
        System.out.println("Test1");
    }


    @Test(groups = {"smoke", "regression"})
    public void test2(){
        System.out.println("Test2");
    }


    @Test(groups = {"smoke", "regression", "login"})
    public void test3(){
        System.out.println("Test3");
    }


    @Test(groups ="regression")
    public void test4(){
        System.out.println("Test4");
    }


    @Test(groups = {"smoke", "regression", "login"})
    public void test5(){
        System.out.println("Test5");
    }


    @Test(groups ="regression")
    public void test6(){
        System.out.println("Test6");
    }


    @Test(enabled = true, groups = "smoke")
    public void test7(){
        System.out.println("Test7");
    }
}
