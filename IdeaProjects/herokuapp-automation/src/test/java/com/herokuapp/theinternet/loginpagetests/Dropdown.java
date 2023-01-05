package com.herokuapp.theinternet.loginpagetests;

import com.herokuapp.theinternet.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown extends Base {
    @Test
    public void dropdownTest(){
        System.out.println("This is dropdown test.");
        String url = "https://the-internet.herokuapp.com/";
        driver.get(url);
        driver.findElement(By.linkText("Dropdown")).click();

        //we need to select an option
        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        dropdown.selectByVisibleText("Option 1");

        String actualText = "Dropdown List";
        String expectedTest = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();

        Assert.assertEquals(actualText, expectedTest);




    }
}
