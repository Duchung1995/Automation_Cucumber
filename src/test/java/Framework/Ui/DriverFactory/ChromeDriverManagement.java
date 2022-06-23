package Framework.Ui.DriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManagement extends DriverManagement {

    @Override
    WebDriver InitWebDriver() {
        WebDriverManager.chromedriver().setup();
        try {
            ChromeDriver ChromeDriver = new ChromeDriver();
            return ChromeDriver;
        } catch (Exception e) {

            throw e;
        }
    }

//    private ChromeOptions CreateChromeProfile() {
//        ChromeOptions _chromeProfile = new ChromeOptions();
//        _chromeProfile.addArguments("start-maximized");
//        return _chromeProfile;
//    }
}
