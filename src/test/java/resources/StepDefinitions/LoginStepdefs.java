package resources.StepDefinitions;

import Framework.BasePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import resources.WebUi.LoginPage;


public class LoginStepdefs {
    private final LoginPage loginPage;

    public LoginStepdefs(LoginPage loginPage) {
       this.loginPage = loginPage;
    }

    @Given("User Launch Chrome browser")
    public void userLaunchChromeBrowser() {
    }

    @When("User opens URL {string}")
    public void userOpensURL(String arg0) {
        loginPage.SetPageUrl(arg0);
    }

    @And("User enters Email as {string} and Password as {string}")
    public void userEntersEmailAsAndPasswordAs(String username, String password) {
        loginPage.setUserName(username);
        loginPage.setPassword(password);
    }

    @And("Click on Login")
    public void clickOnLogin() {
        loginPage.clickLogin();
    }

    @Then("URL should be {string}")
    public void urlShouldBe(String arg0) {
    }

    @When("User click on Log out link")
    public void userClickOnLogOutLink() {
    }

    @And("close browser")
    public void closeBrowser() {
    }
}
