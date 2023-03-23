import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class HTML {

    @Test
    public void formElement() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");

        driver.findElement(By.xpath("//input[@name='filename']")).sendKeys("/Users/natabelova/Downloads/Test.png");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Emile");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Emile123");
        driver.findElement(By.xpath("//textarea[@name='comments']")).clear();
        driver.findElement(By.xpath("//textarea[@name='comments']")).sendKeys("My job is testing");
        driver.findElement(By.xpath("//input[@value='cb2']")).click();
        driver.findElement(By.xpath("//input[@value='cb3']")).click();
        driver.findElement(By.xpath("//input[@value='rd3']")).click();
        driver.findElement(By.xpath("//select[@name='multipleselect[]']//option[@value='ms1']")).click();
        driver.findElement(By.xpath("//select[@name='multipleselect[]']//option[@value='ms4']")).click();
        driver.findElement(By.xpath("//select[@name='dropdown']//option[@value='dd5']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }
}
