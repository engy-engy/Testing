import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class FullAutoTest {
    WebDriver driver;
    @BeforeAll
    static void setupAll() {
        WebDriverManager.firefoxdriver().setup();
    }
    @BeforeEach
    void setup() {
        driver = new FirefoxDriver();
    }
    @AfterEach
    void teardown() throws InterruptedException {
        Thread.sleep(1000);
        //driver.quit();
    }
    @Test
    public void textBox() throws InterruptedException {
        Thread.sleep(1000);
        driver.get("https://demoqa.com/");          // home page
        driver.findElement(By.xpath("//div[@class='category-cards']//div[@class='card mt-4 top-card']")).click();
        driver.findElement(By.xpath("//ul[@class='menu-list']//li[@id='item-0']")).click();
        driver.findElement(By.xpath("//div[@class='col-md-9 col-sm-12']//input[@id='userName']")).sendKeys("James");
        driver.findElement(By.xpath("//div[@class='col-md-9 col-sm-12']//input[@id='userEmail']")).sendKeys("testml@gmail.com");
        driver.findElement(By.xpath("//div[@class='col-md-9 col-sm-12']//textarea[@placeholder='Current Address']")).sendKeys("London");
        driver.findElement(By.xpath("//div[@class='col-md-9 col-sm-12']//textarea[@id='permanentAddress']")).sendKeys("Florida");
        driver.findElement(By.xpath("//div[@class='text-right col-md-2 col-sm-12']//button[@id='submit']")).submit();
    }
    @Test
    public void checkBox() throws InterruptedException {
        Thread.sleep(1000);
        driver.get("https://demoqa.com/");          // home page
        driver.findElement(By.xpath("//div[@class='category-cards']//div[@class='card mt-4 top-card']")).click();
        driver.findElement(By.xpath("//ul[@class='menu-list']//li[@id='item-1']")).click();
        driver.findElement(By.xpath("//div[@class='rct-options']//button[@class='rct-option rct-option-expand-all']")).click();
        driver.findElement(By.xpath("//label[@for='tree-node-react']//span[@class='rct-checkbox']")).click();
    }
    @Test
    public void radioButton() throws InterruptedException {
        Thread.sleep(1000);
        driver.get("https://demoqa.com/");          // home page
        driver.findElement(By.xpath("//div[@class='category-cards']//div[@class='card mt-4 top-card']")).click();
        driver.findElement(By.xpath("//ul[@class='menu-list']//li[@id='item-2']")).click();
        driver.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']//label[@for='yesRadio']")).click();
        driver.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']//label[@for='impressiveRadio']")).click();
    }
    @Test
    public void webTable() throws InterruptedException {
        Thread.sleep(700);
        driver.get("https://demoqa.com/");          // home page
        driver.findElement(By.xpath("//div[@class='category-cards']//div[@class='card mt-4 top-card']")).click();
        driver.findElement(By.xpath("//ul[@class='menu-list']//li[@id='item-3']")).click();
        driver.findElement(By.xpath("//div[@class='col-md-7']//button[@id='addNewRecordButton']")).click();
        Thread.sleep(700);
        driver.findElement(By.xpath("//div[@class='col-md-6 col-sm-6']//input[@id='firstName']")).sendKeys("Jons");
        driver.findElement(By.xpath("//div[@class='col-md-6 col-sm-6']//input[@id='lastName']")).sendKeys("Week");
        driver.findElement(By.xpath("//div[@class='col-md-9 col-sm-12']//input[@id='userEmail']")).sendKeys("jonsweek@gmail.com");
        driver.findElement(By.xpath("//div[@class='col-md-2 col-sm-12']//input[@id='age']")).sendKeys("25");
        driver.findElement(By.xpath("//div[@class='col-md-9 col-sm-12']//input[@id='salary']")).sendKeys("4000");
        driver.findElement(By.xpath("//div[@class='col-md-6 col-sm-6']//input[@id='department']")).sendKeys("USA");
        Thread.sleep(700);
        driver.findElement(By.xpath("//div[@class='text-right col-md-2 col-sm-12']//button[@class='btn btn-primary']")).click();
        Thread.sleep(700);
        driver.findElement(By.xpath("//div[@class='mb-3 input-group']//input[@placeholder='Type to search']")).sendKeys("Jons");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='mb-3 input-group']//input[@placeholder='Type to search']")).clear();
    }
    @Test
    public void buttons() throws InterruptedException {
        Thread.sleep(1000);
        Actions act = new Actions(driver);

        //driver.get("https://demoqa.com/");          // home page
        //driver.findElement(By.xpath("//div[@class='category-cards']//div[@class='card mt-4 top-card']")).click();
        //driver.findElement(By.xpath("//ul[@class='menu-list']//li[@id='item-4']")).click();
        driver.get("https://demoqa.com/buttons");
        // button 1
        WebElement elementBtn1 = driver.findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']//button[@id='doubleClickBtn']"));
        act.doubleClick(elementBtn1).perform();
        // button 2
        WebElement elementBtn2 = driver.findElement(By.xpath("//div[@class='mt-4']//button[@id='rightClickBtn']"));
        act.contextClick(elementBtn2).perform();
        // button 3
        driver.findElement(By.linkText("Click Me"));
    }
}
