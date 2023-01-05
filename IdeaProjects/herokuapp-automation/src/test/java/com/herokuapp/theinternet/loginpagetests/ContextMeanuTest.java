package com.herokuapp.theinternet.loginpagetests;

import com.herokuapp.theinternet.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContextMeanuTest extends Base {

    @Test
    public void contextmenuTest() {
        System.out.println("this the Add/Remove Elements Test");
        String url = "https://the-internet.herokuapp.com/";
        driver.get(url);

        driver.findElement(By.linkText("Context Menu")).click();

        Actions actions = new Actions(driver);
        WebElement element;
        element = driver.findElement(By.id("hot-spot"));
        actions.contextClick(element).perform(); //right click

        driver.switchTo().alert().accept();

    }
}
