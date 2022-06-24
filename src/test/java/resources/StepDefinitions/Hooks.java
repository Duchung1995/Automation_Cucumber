package resources.StepDefinitions;

import Framework.BasePage;
import Framework.Ui.DriverFactory.InitDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    BasePage basePage;
    public Hooks(BasePage basePage){
        this.basePage = basePage;
    }
    @Before
    public void InitTest() {
        basePage.setDriver();
    }

    @After
    public void tearDownTest() {
        basePage.endDriver();
    }
}
