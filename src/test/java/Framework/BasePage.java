package Framework;

import Framework.Ui.DriverFactory.InitDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import resources.StepDefinitions.Hooks;

public abstract class BasePage {

    public WebDriver driver;

    public BasePage (){
        driver = Hooks.driver;
    }

}
