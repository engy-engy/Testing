package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumTest {
    public static void main(String[] args) {
        // Устанавливаем путь к драйверу Chrome
        System.setProperty("chromedriver", "org/example/chromedriver");

        // Создаем экземпляр WebDriver для управления браузером Chrome
        WebDriver driver = new ChromeDriver();

        // Открываем страницу авторизации на сайте
        driver.get("https://example.com/login");

        // Находим поле ввода логина и вводим значение
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("myusername");

        // Находим поле ввода пароля и вводим значение
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("mypassword");

        // Находим кнопку "Войти" и кликаем на нее
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();

        // Ждем, пока страница загрузится
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Проверяем, что мы успешно авторизовались и находим элемент приветствия
        WebElement welcomeMessage = driver.findElement(By.className("welcome-message"));
        System.out.println(welcomeMessage.getText());

        // Закрываем браузер
        driver.quit();
    }
}
