package org.sft.seleniumExamples.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class checkedBox {
   public WebDriver driver;
    @BeforeTest
    public void launchApplication(){
        driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/sales-ee/?d=topnav2-btn-ft");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void checkbox() {
        WebElement firstNameInputBox = driver.findElement(By.cssSelector("input[name='UserFirstName']"));
        WebElement lastNameInputBox = driver.findElement(By.cssSelector("input[name='UserLastName']"));
        WebElement JobTitle = driver.findElement(By.cssSelector("input[name='UserTitle']"));
        WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
        firstNameInputBox.sendKeys("sai");
        lastNameInputBox.sendKeys("saritha");
        JobTitle.sendKeys("Testing");
        nextButton.click();

        WebElement employeesDropDown = driver.findElement(By.cssSelector("[id^='CompanyEmployees']"));
        Select selectEmployeesList = new Select(employeesDropDown);
        selectEmployeesList.selectByVisibleText("1 - 20 employees");
        WebElement companyName = driver.findElement(By.cssSelector("input[name='CompanyName']"));
        companyName.sendKeys("Training");
        WebElement countryDropDown = driver.findElement(By.cssSelector("[name='CompanyCountry']"));
        Select selectCountryList = new Select(countryDropDown);
        selectCountryList.selectByVisibleText("India");
        WebElement NextButton = driver.findElement(By.xpath("//span[text()='Next']"));
        NextButton.click();
        WebElement phoneNumberInputBox = driver.findElement(By.xpath("//input[@name='UserPhone']"));
        phoneNumberInputBox.sendKeys("6281911445");
        WebElement emailInputBox = driver.findElement(By.xpath("//input[@name='UserEmail']"));
        emailInputBox.sendKeys("saritareddi@gmail.com");
        
        WebElement checkbox = driver.findElement(By.xpath("//input[@id ='SubscriptionAgreement']/following-sibling::div[@class='checkbox-ui']"));
        System.out.println(driver.findElement(By.cssSelector("#SubscriptionAgreement")).isSelected());
        WebElement checkboxAfterClick = driver.findElement(By.xpath("//div[@class='msaCheckbox checkboxInput section']//div[@class='checkbox-ui']"));
        checkboxAfterClick.click();
       System.out.println(driver.findElement(By.cssSelector("#SubscriptionAgreement")).isSelected());

    }
    @AfterTest
    public void killSection() {
        driver.close();
    }
}
