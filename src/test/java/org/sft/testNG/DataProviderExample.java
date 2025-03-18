package org.sft.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
    @DataProvider(name = "login")
    public Object[][] getUserCredentials() {
        return new Object[][]{
                {"selenium", "test@123"},
                {"appium", "test@123"},
                {"playwright", "test@123"},
                {"restAssured", "test@123"},
                {"selenium", "test@123"},
                {"appium", "test@123"},
                {"playwright", "test@123"},
                {"restAssured", "test@123"}
        };
    }

    @DataProvider(name = "register")
    public Object[][] getUserData() {
        return new Object[][]{
                {"selenium", "test@123", "1244"},
                {"appium", "test@123", "2134214"},
                {"playwright", "test@123", "312431234"},
                {"restAssured", "test@123", "4353453"}
        };
    }


    @Test(dataProvider = "login")
    public void login(String un,String pwd){
        System.out.println(un + "::"+pwd);
    }

    @Test(dataProvider = "register")
    public void register(String un, String pwd, String number) {
        System.out.println(un + " :: " + pwd + " :: " + number);
    }

    @Test
    public void twoDimensionalArray() {
        int[][] a = {
                {1, 2, 3},
                {2, 3, 4},
                {4, 5, 6},
                {6, 7, 8}
        };
        System.out.println(a[0][0]);
        System.out.println(a[3][1]);
    }
}
