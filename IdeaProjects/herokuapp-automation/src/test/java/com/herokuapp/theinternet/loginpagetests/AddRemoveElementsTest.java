package com.herokuapp.theinternet.loginpagetests;

import com.herokuapp.theinternet.base.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddRemoveElementsTest extends Base {
    @Test
    public void addRemoveElements(){
        System.out.println("this the Add/Remove Elements Test");
        String url = "https://the-internet.herokuapp.com/";
        driver.get(url);

        driver.findElement(By.linkText("Add/Remove Elements")).click();
        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();

        driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();





    }
}
