import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class UploadFile {
    @Test
    public void uploadFile() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://testpages.herokuapp.com/styled/file-upload-test.html");

        driver.findElement(By.xpath("//div[@class='form-label']//input[@id='fileinput']")).sendKeys("/Users/natabelova/Downloads/Test.png");
        driver.findElement(By.xpath("//div[@class='centered']//div[@class='form-label']//input[@id='itsafile']")).click();
        driver.findElement(By.xpath("//div[@class='form-label']//input[@class='styled-click-button']")).click();
    }
}
