package Framework.Ui.DriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManagement extends DriverManagement {

    @Override
    WebDriver InitWebDriver() {
        WebDriverManager.firefoxdriver().setup();
        try {
            FirefoxDriver firefoxDriver = new FirefoxDriver();
            return firefoxDriver;
        } catch (Exception e) {

            throw e;
        }
    }

}