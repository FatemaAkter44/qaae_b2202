package com.herokuapp.theinternet.loginpagetests;

import com.herokuapp.theinternet.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuthTest extends Base {
   //public WebElement driver;
    @Test
    public void basicAuthTest(){

        System.out.println("this is start of basic auth test.");
        String url = "https://the-internet.herokuapp.com/";
        driver.get(url);
        //driver.findElement(By.linkText("Basic Auth")).click();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        String expeted = "Congratulations! You must have the proper credentials.";
        String actualText = driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]  ")).getText();
        Assert.assertEquals(expeted, actualText);
    }
}
