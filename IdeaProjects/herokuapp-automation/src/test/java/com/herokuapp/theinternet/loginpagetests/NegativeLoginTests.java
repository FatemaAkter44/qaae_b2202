package com.herokuapp.theinternet.loginpagetests;

import com.herokuapp.theinternet.base.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NegativeLoginTests extends Base {
    @Parameters({"username", "password", "expectedMessege"}) //seting the info from xml file
    @Test
    public void negativeLogInTest(String username, String password, String expectedMessege) {
        String url = "https://the-internet.herokuapp.com/";
        driver.get(url);
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("username");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.className("radius")).click();


    }
}
