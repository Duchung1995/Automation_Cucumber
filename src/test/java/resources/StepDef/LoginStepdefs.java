package resources.StepDef;

import Framework.BasePage;
import Framework.MasterTest.MasterTest;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepdefs extends MasterTest {

    @Before
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Given("User Launch Chrome browser")
    public void userLaunchChromeBrowser() {
    }

    @When("User opens URL {string}")
    public void userOpensURL(String arg0) {
    }
}
