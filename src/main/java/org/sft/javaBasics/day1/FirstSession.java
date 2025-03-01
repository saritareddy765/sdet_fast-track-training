package org.sft.javaBasics.day1;

public class FirstSession {
    //non-static variables
    int number = 5;
    String tool = "Selenium";

    //static variables
    static int rollNumber = 3;
    static String name = "ssr";

    public static void main(String[] args) {
        System.out.println("SDET Training");
        //creation of object
        FirstSession firstSession = new FirstSession();//saving to reference variable
        new FirstSession();// creation of object without saving

        HelperTool helperTool = new HelperTool(); //creation of object from another java class

        // new FirstSession().login();//calling method
        register();//calling static method
        firstSession.login(); //calling non-static method

        //calling non-static variables in same class
        int a = firstSession.number;
        System.out.println(firstSession.number);
        String s = firstSession.tool;
        System.out.println(firstSession.tool);
        //calling static variables
        System.out.println(rollNumber);
        System.out.println(name);

        //calling non-static returnType methods
        int b = firstSession.sum();
        String s1 = firstSession.automationTool();
        System.out.println(b);
        System.out.println(s1);
        //calling static returnType method
        String s2 = cicdTool();
        System.out.println(s2);
      // OR  System.out.println(cicdTool());

        helperTool.loginHelper();//calling non-static method from the another class with object creation
        HelperTool.registerHelper();//calling static method of another class with help of class name

        //calling another class object creation without saving with reference variable
        new HelperTool().loginHelper();
        System.out.println(new FirstSession().automationTool());

    }
    //creation of method
    public void login(){
        System.out.println("Login successfully completed");
    }
    //static method
    public static void register(){
        System.out.println("Register successfully completed");
    }

    //return methods
    public int sum(){
        return 15;
    }
    public String automationTool(){
        return "Playwright";
    }
    public static String cicdTool(){
        return "Azure Devops";
    }
    //static block and it will execute before object creation
    static {
        String s = "Automation Training";
        System.out.println(s);
    }
}
