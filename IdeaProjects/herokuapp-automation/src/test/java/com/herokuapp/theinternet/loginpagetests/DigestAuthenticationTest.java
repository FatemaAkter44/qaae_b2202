package com.herokuapp.theinternet.loginpagetests;

import com.herokuapp.theinternet.base.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DigestAuthenticationTest extends Base {
    @Test
    public void digistAuthentication() {
        System.out.println("this is start of basic auth test.");
        String url = "https://the-internet.herokuapp.com/";
        driver.get(url);
        driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");

        //String expeted = "https://the-internet.herokuapp.com/digest_auth";
        //String actualText = driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]  ")).;
        //Assert.assertEquals(expeted, actualText);
    }
}
