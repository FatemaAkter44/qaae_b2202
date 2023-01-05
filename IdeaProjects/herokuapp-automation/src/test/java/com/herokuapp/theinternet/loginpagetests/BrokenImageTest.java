package com.herokuapp.theinternet.loginpagetests;

import com.herokuapp.theinternet.base.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BrokenImageTest extends Base {
    @Test
    public void brokenImageTest(){
        System.out.println("this is start of broken image test.");
        String url = "https://the-internet.herokuapp.com/";
        driver.get(url);
        driver.findElement(By.linkText("Broken Images")).click();
    }
}
