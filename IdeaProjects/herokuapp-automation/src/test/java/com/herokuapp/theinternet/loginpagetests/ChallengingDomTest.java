package com.herokuapp.theinternet.loginpagetests;

import com.herokuapp.theinternet.base.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ChallengingDomTest extends Base {
    @Test
    public void challengingDomTest(){
        System.out.println("this is start of challenging dom test.");
        String url = "https://the-internet.herokuapp.com/";
        driver.get(url);
        driver.findElement(By.linkText("Challenging DOM")).click();


    }
}
