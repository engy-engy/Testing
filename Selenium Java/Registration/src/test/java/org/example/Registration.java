package org.example;
import org.junit.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Registration extends Data {

    private By btnJoinFree = By.className(".btn.btn-black.navbar-btn");
    private By inputFirstName = By.id("user_first_name");
    private By inputLastName = By.xpath("//div[@class='form-group']//input[@class='form-control']");
    private By inputEmail = By.xpath("//div[@class='form-group']//input[@type='email']");
    private By inputUserName = By.id("user_username");
    private By inputPassword = By.id("user_password");
    private By btnJoinRegistration = By.linkText("Join");
    @Test
    public void registration() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Data getData = new Data();

        driver.manage().window().maximize();

        driver.get("https://www.opencart.com/");
        //driver.findElement(btnJoinFree).click();

        //driver.findElement(inputUserName).sendKeys(getData.userName);
        //driver.findElement(inputPassword).sendKeys(getData.password);
        //driver.findElement(btnJoinRegistration).click();

        Thread.sleep(Duration.ofSeconds(3));
        driver.quit();
    }
}
