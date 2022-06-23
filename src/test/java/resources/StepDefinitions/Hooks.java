package resources.StepDefinitions;

import Framework.Ui.DriverFactory.InitDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    public static WebDriver driver;
    InitDriverFactory initDriverFactory;

//    public Hooks(WebDriver driver){
//        this.driver=driver;
//    }

    @Before
    public void InitTest() {
        initDriverFactory = new InitDriverFactory();
        driver = initDriverFactory.GetWebDriver();
        System.out.println("Start test hooks");
    }

    @After
    public void tearDownTest() {
        initDriverFactory.TerminateWebDriver();
        System.out.println("End test");
    }
}
