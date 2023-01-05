package com.herokuapp.theinternet.loginpagetests;

import com.herokuapp.theinternet.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropTest extends Base {
    @Test
    public void drageAndDropTest() throws InterruptedException {
        System.out.println("this is start of drage and drop test.");
        String url = "https://the-internet.herokuapp.com/";
        driver.get(url);

        driver.findElement(By.linkText("Drag and Drop")).click();
        //this place to drage
        WebElement from = driver.findElement(By.id("column-a"));
        //this is where we drop
        WebElement to = driver.findElement(By.id("column-b"));

        // creating object from Action class to built composit actions
        Actions actions = new Actions(driver);
        //perfoming the drag and drop
        actions.dragAndDrop(from,to).build().perform();
        Thread.sleep(5000);

        /*String expectedText = "Drag and Drop";
        String actualText = driver.findElement(By.cssSelector("Drag and Drop")).getText();
        Assert.assertEquals(expectedText, actualText);*/

        String expectedText = "Drag and Drop";
        String actualText = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
        Assert.assertEquals(expectedText, actualText);


    }

}
