package com.herokuapp.theinternet.loginpagetests;

import com.herokuapp.theinternet.base.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AbTestingTest extends Base {
    @Test
    public void abTestingTest() {
        System.out.println("this is start of A/B testiing test.");
        String url = "https://the-internet.herokuapp.com/";
        driver.get(url);
        driver.findElement(By.linkText("A/B Testing")).click();



        String expectedText = "A/B Test Variation 1";
String actualTest = driver.findElement(By.xpath("//div[@class='example']/h3[text()='A/B Test Variation 1']")).getText();
        Assert.assertEquals(expectedText, actualTest );
    }
}
