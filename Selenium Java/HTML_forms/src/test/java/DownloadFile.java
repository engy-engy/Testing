import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadFile {
    @Test
    public void uploadFile() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://testpages.herokuapp.com/styled/download/download.html");

        driver.findElement(By.xpath("//a[@id='direct-download-a']//button[@id='direct-download']")).click();
        driver.findElement(By.xpath("//a[@id='direct-download-window-a']//button[@id='direct-download-window']")).click();
        driver.findElement(By.xpath("//a[@id='server-download-a']//button[@id='server-download']")).click();
        driver.findElement(By.xpath("//form[@action='/download/textfile.txt']//button[@id='post-getserver-download']")).click();
        driver.get("https://testpages.herokuapp.com/styled/download/download.html");
        driver.findElement(By.xpath("//a[@id='direct-link-a']//button[@id='direct-link']")).click();

    }
}
