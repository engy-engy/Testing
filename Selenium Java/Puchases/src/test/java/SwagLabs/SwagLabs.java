package SwagLabs;
import Base.Data;
import Base.BasePage;
import Base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwagLabs extends BasePage {
        @Test
        public void checkPurchases() throws InterruptedException {
            WebDriver driver = new FirefoxDriver();
            Data getData = new Data();

            driver.manage().window().maximize();
            driver.get(getData.URI);                                            //заходим на сайт

            driver.findElement(inputUserName).sendKeys(getData.userName);       //вводим username
            driver.findElement(inputPassword).sendKeys(getData.password);       //вводим пароль

            driver.findElement(btnLogin).click();                               //нажимаем кнопку логин
            driver.findElement(addProduct).click();                             //добавляем первый продукт
            driver.findElement(btnBasket).click();                              //нажимаем на корзину
            driver.findElement(btnCheckout).click();                            //нажимаем кнопку чекаут

            driver.findElement(inputFirstName).sendKeys(getData.checkoutText);  //вводим test в поле firstname
            driver.findElement(inputLastName).sendKeys(getData.checkoutText);   //вводим test в поле lastname
            driver.findElement(inputZipCode).sendKeys(getData.checkoutText);    //вводим test в поле zipcode

            driver.findElement(inputContinue).click();                          //нажимаем кнопку continue
            driver.findElement(btnFinish).click();                              //нажимаем кнопку finish
        }

        @Test
        public void checkBugReport() throws InterruptedException{
            WebDriver driver = new FirefoxDriver();
            Data data = new Data();

            driver.get(data.URITwoTest);                                        //заходим на сайт
            driver.findElement(inputUserName).sendKeys(data.userNameTwoTest);   //вводим поле username
            driver.findElement(inputPassword).sendKeys(data.passwordTwoTest);   //вводим поле password
            driver.findElement(btnLogin).click();                               //нажимаем кнопку войти
            String text = driver.findElement(textReport).getText().toString();  //получаем текст
            if (text.contains(textInfo)){                                       //проверка текста ошибки
                System.out.println(text);                                       //выводим в консоль
            }
        }
    }