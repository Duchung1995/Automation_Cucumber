package Framework.Ui.DriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManagement extends DriverManagement {

    @Override
    WebDriver InitWebDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(CreateChromeProfile());
    }

    private ChromeOptions CreateChromeProfile() {
        ChromeOptions _chromeProfile = new ChromeOptions();
        _chromeProfile.addArguments("start-maximized");
        _chromeProfile.addArguments("--headless");
        return _chromeProfile;
    }
}
