package MasterTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import Ui.DriverFactory.InitDriverFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import Ui.DriverFactory.InitDriverFactory;

import java.time.Duration;

public class MasterTest {

    @Getter
     WebDriverWait wait;
    @Getter
     WebDriver driver;

    protected MasterTest(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(100));
    }

}
