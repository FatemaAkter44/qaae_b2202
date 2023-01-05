package com.herokuapp.theinternet.loginpagetests;

import com.herokuapp.theinternet.base.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLogInTests extends Base {
    @Test
    public void logInTest() throws InterruptedException {
        //frist is to get the page
        System.out.println("This is starting of the log in test");
        String urlOfWebsite ="https://the-internet.herokuapp.com/";
        driver.get(urlOfWebsite);
        System.out.println("landing page is opened");

        //2nd step is to click on Form Authentication link
        driver.findElement(By.linkText("Form Authentication")).click();
        System.out.println("clicked on the Form authintication");

        //Thread.sleep(10000);

        //3rd step to click on the username
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        System.out.println("clicked on username");

        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        System.out.println("clicked on password fild");

        driver.findElement(By.className("radius")).click();
        System.out.println("clicked on log in button");

        //Thread.sleep(10000);

        //veryfy if we get the login page
        //using url

         String epectedUrle = "https://the-internet.herokuapp.com/secure";
         String actualUrl = driver.getCurrentUrl();
        //System.out.println(actualUrl);
        Assert.assertEquals(actualUrl, epectedUrle);

        // is log out button displayed
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).isDisplayed(), "Log in button is displayed");

        //Test with LinkedText

        String actualMassege = driver.findElement(By.id("flash")).getText();
        String expectedMassege = "You logged into a secure area!";

        Assert.assertTrue(actualMassege.contains(expectedMassege));
        Assert.assertTrue(actualMassege.contains(expectedMassege), "This is to see if the success messege same as expected");

    }
    @Test
    public void checkBoxTest() throws InterruptedException {
        String url = "https://the-internet.herokuapp.com/";
        driver.get(url);
        System.out.println("landing page arrived");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Checkboxes")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
        Thread.sleep(3000);

        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/checkboxes");

        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText(), "Checkboxes");
    }

    



}
