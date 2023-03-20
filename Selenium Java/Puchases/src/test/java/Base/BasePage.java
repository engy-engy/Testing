package Base;

import org.openqa.selenium.By;

public class BasePage {
    protected By inputUserName = By.xpath("//div[@class='form_group']//input[@type='text']");
    protected By inputPassword = By.xpath("//div[@class='form_group']//input[@type='password']");
    protected By btnLogin = By.xpath("//div[@class='login-box']//input[@type='submit']");
    protected By textReport = By.xpath("//div[@class='error-message-container error']//h3[@data-test='error']");
    protected String textInfo = "Epic sadface: Username and password do not match any user in this service";
    protected By addProduct = By.xpath("//div[@class='pricebar']//button[@id='add-to-cart-sauce-labs-backpack']");
    protected By btnBasket = By.cssSelector("a.shopping_cart_link");
    protected By btnCheckout = By.xpath("//div[@class='cart_footer']//button[@class='btn btn_action btn_medium checkout_button']");
    protected By inputFirstName = By.xpath("//input[@class='input_error form_input' and contains(@id, 'first-name')]");
    protected By inputLastName = By.xpath("//input[@class='input_error form_input'and contains(@id, 'last-name')]");
    protected By inputZipCode = By.xpath("//input[@class='input_error form_input' and contains(@id, 'postal-code')]");
    protected By inputContinue = By.xpath("//input[@class='submit-button btn btn_primary cart_button btn_action' and contains(@id, 'continue')]");
    protected By btnFinish = By.xpath("//button[@class='btn btn_action btn_medium cart_button' and contains(@id, 'finish')]");

}
