package Base;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WebDriver driver;
    private static final int TIMOUT = 15;

    @BeforeEach
    void setup() {
        System.setProperty("geckodriver","src/main/resources/geckodriver");
        FirefoxOptions firefoxOptions = new FirefoxOptions();

        driver = new FirefoxDriver(firefoxOptions);
        driver.manage().timeouts().implicitlyWait(TIMOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(TIMOUT, TimeUnit.SECONDS);
    }


}
