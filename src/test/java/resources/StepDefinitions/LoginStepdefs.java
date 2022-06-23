package resources.StepDefinitions;

import Framework.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.WebUi.LoginPage;


public class LoginStepdefs extends BaseTest {
    private LoginPage loginPage;

    @Given("User Launch Chrome browser")
    public void userLaunchChromeBrowser() {
        System.out.println("Start test");
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