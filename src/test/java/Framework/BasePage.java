package Framework;

import Framework.Ui.DriverFactory.InitDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import resources.StepDefinitions.Hooks;

public abstract class BasePage {
    @Getter
    protected WebDriver driver;

    InitDriverFactory initDriverFactory = new InitDriverFactory();
    public void setDriver() {
        driver = initDriverFactory.GetWebDriver();
        PageFactory.initElements(driver, this);
        System.out.println("Start test hooks");
    }

    public void endDriver() {
        initDriverFactory.TerminateWebDriver();
    }
}
