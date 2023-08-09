package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    // Locators
    private By loginLinkLocator = By.xpath("//span[text()='Log In']");
    private By emailInputLocator = By.name("email");
    private By passwordInputLocator = By.name("password");
    private By loginButtonLocator = By.xpath("//div[text()='Login']");
    private By SignUpButtonLocator = By.xpath("//a[text()='Sign Up']");
    private By UserdiplayedLocator = By.xpath("//span[@class='user-display']");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods

    public void clickloginLink() {
        WebElement loginButton = driver.findElement(loginLinkLocator);
        loginButton.click();
    }
    public boolean loginPageDiaplayed(){
        return driver.findElement(loginButtonLocator).isDisplayed();
    }

    public boolean checkUserDiaplayed(){
        return driver.findElement(UserdiplayedLocator).isDisplayed();
    }

    public void enterEmail(String email) {
        WebElement emailInput = driver.findElement(emailInputLocator);
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(passwordInputLocator);
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
    }

    public void clickSignUpButton() {
        WebElement signUpButton = driver.findElement(SignUpButtonLocator);
        signUpButton.click();
    }
    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }

}
