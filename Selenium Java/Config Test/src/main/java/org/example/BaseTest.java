package org.example;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public void setUp(){
        WebDriver driver = new ChromeDriver();
    }

    @Before
    public void init(){setUp();}

    //@After
    //public void tearDown(){}
}
