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
    DataElemets data = new DataElemets();
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
        driver.get(data.UrlHobbyGame);
        driver.findElement(data.btnRegisterHobby).click();
        driver.findElement(data.nameHobby).sendKeys("Jons Week");
        driver.findElement(data.phoneHobby).sendKeys("9163332212");
        driver.findElement(data.emailHobby).sendKeys("emailtest12@gmai.com");
        driver.findElement(data.btnCheck1Hobby).click();
        driver.findElement(data.BtnCheck2Hobby).click();
        driver.findElement(data.btnRegisterHobby).click();
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
