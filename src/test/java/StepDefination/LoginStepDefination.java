package StepDefination;

import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginStepDefination {
  WebDriver driver;
  LoginPage loginPage;

    /*  @Before

    public void setup(){

                    }*/

   /* @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }*/
    @Given("User open browser and enter url")
    public void user_open_browser_and_enter_url() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://freecrm.in/");
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }

    @When("user click on login")
    public void user_click_on_login() {loginPage.clickloginLink();
    }
    @Then("user should see login page")
    public void user_should_see_login_page() {Assert.assertEquals(loginPage.loginPageDiaplayed(), true);
    }

    @When("user entered a valid username and password")
    public void user_entered_a_valid_username_and_password() {
            loginPage.enterEmail("vijayalakshmilingampally@gmail.com");
            loginPage.enterPassword("Test@123");
    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        loginPage.clickLoginButton();
    }
    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        Assert.assertEquals(loginPage.checkUserDiaplayed(), true);
    }
}
