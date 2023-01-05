package com.herokuapp.theinternet.loginpagetests;

import com.herokuapp.theinternet.base.Base;
import org.testng.annotations.Test;

public class CheckBoxTest extends Base {
    @Test
    public void checkBoxTest(){
        System.out.println("this is start of check box test.");
        String url = "https://the-internet.herokuapp.com/";
        driver.get(url);

    }
}
