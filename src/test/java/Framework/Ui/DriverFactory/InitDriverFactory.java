package Framework.Ui.DriverFactory;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class InitDriverFactory {

    WebDriver driver = null;

    public InitDriverFactory(WebDriver driver) {
        this.driver = driver;
    }


    public WebDriver GetWebDriver() {
        String browserType = "chrome";
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
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
    }

}
