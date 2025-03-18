package org.sft.javaBasics;

public class HelperTool {

    //static block we can use anywhere in the class
    static {
        String s = "Helper Automation Training";
        System.out.println(s);
    }
    //creation of method
    public void loginHelper(){
        System.out.println("HelperTool - Login successfully completed");
    }
    //static method
    public static void registerHelper(){
        System.out.println("HelperTool - Register successfully completed");
    }
}
