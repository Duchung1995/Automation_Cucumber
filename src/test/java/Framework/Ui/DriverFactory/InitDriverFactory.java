package Framework.Ui.DriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class InitDriverFactory {

    public WebDriver driver;

    public WebDriver GetWebDriver() {
        return driver= InitChromeWebDriver();
    }

    public WebDriver InitChromeWebDriver() {
        driver = new ChromeDriverManagement().InitWebDriver();
        MaximizeWindow();
        SetPageLoadTimeOut();
        return driver;
    }

    public void TerminateWebDriver() {
        driver.quit();
        driver = null;
    }

    private void MaximizeWindow() {
        driver.manage().window().maximize();
    }

    private void SetPageLoadTimeOut() {
        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
    }


    public enum DriverType {
        FIREFOX,
        CHROME,
        EDGE
    }

    public enum EnvironmentType {
        LOCAL,
        REMOTE,
    }
}