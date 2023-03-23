import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DataElemets{
    String UrlHobbyGame = "https://hobbygames.ru/";
    public By btnRegisterHobby = By.xpath("//div[@class='enter']//a[@class='footer-btn js-openRegisterModal']");
    public By nameHobby = By.xpath("//form[@id='register-form']//input[@name='fio']");
    public By phoneHobby = By.xpath("//label[@data-scenario='phone']//input[@name='phone']");
    public By emailHobby = By.xpath("//form[@id='register-form']//input[@name='email']");
    public By btnCheck1Hobby = By.xpath("//div[@class='register_popup__subscription']//label[@for='newsletter']");
    public By BtnCheck2Hobby = By.xpath("//div[@class='register_popup__subscription']//label[@for='sms']");
    public By BtnRegisterHobby = By.xpath("//div[@class='btn-block']//a[@class='send-register btn right']");


}
