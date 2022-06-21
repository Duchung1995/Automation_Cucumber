package resources.StepDef;

import Framework.BasePage;
import Framework.MasterTest.MasterTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import resources.WebUi.LoginPage;


public class LoginStepdefs extends MasterTest {
    public LoginPage loginPage;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("User Launch Chrome browser")
    public void userLaunchChromeBrowser() {
        loginPage = new LoginPage(driver);
    }

    @When("User opens URL {string}")
    public void userOpensURL(String url) {
        driver.get(url);
    }

    @After
    public void TearDown() {
        driver.quit();
        driver = null;
    }
}
