import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebSite {
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
        //Thread.sleep(5000);
        //driver.quit();
    }

    @Test
    void hobbygamesRegistration() throws InterruptedException {
        driver.get("https://hobbygames.ru/");
        driver.findElement(By.xpath("//div[@class='enter']//a[@class='footer-btn js-openRegisterModal']")).click();
        driver.findElement(By.xpath("//form[@id='register-form']//input[@name='fio']")).sendKeys("Jons Week");
        driver.findElement(By.xpath("//label[@data-scenario='phone']//input[@name='phone']")).sendKeys("9163332212");
        driver.findElement(By.xpath("//form[@id='register-form']//input[@name='email']")).sendKeys("emailtest12@gmai.com");
        driver.findElement(By.xpath("//div[@class='register_popup__subscription']//label[@for='newsletter']")).click();
        driver.findElement(By.xpath("//div[@class='register_popup__subscription']//label[@for='sms']")).click();
        driver.findElement(By.xpath("//div[@class='btn-block']//a[@class='send-register btn right']")).click();
    }
    @Test
    void officemagRegistration() throws InterruptedException {
        driver.get("https://www.officemag.ru/");
        driver.findElement(By.xpath("//div[@class='User User--widget']//div[@class='User__item']")).click();
        driver.findElement(By.xpath("//div[@class='registrationHint']//a[@class='btn btnDefault btnBlue Rarr']")).click();
        driver.findElement(By.xpath("//div[@class='Form__field inputFull']//span[@class='pseudoLink js-getSelectedCity']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@class='CitySelectWindow__label']//a[@data-city-id='84']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@class='Form__field inputFull']//input[@id='REGISTER_NAME']")).sendKeys("Jons");
        driver.findElement(By.xpath("//div[@class='Form__field inputFull']//input[@id='REGISTER_LAST_NAME']")).sendKeys("Week");
        driver.findElement(By.xpath("//div[@class='PhoneControl  PhoneControl--default']//input[@id='REGISTER_PERSONAL_MOBILE']")).sendKeys("9996664411");
        driver.findElement(By.xpath("//div[@class='Form__field inputFull']//input[@id='REGISTER_EMAIL']")).sendKeys("emailtestti@mail.ru");
        driver.findElement(By.xpath("//div[@class='Form__field inputFull']//input[@id='REGISTER_PASSWORD']")).sendKeys("1234qwerTY");
        driver.findElement(By.xpath("//label[@class='Form__label inputFull']//input[@name='REGISTER[IS_ALLOWED_PERSONAL_DATA]']")).click();
        driver.findElement(By.xpath("//div[@class='d-t-c t-a-r']//button[@class='btn btnDefault btnGreen js-personalDataSubmitting js-ajaxAnimationAndBlock']")).click();
    }
   
}
