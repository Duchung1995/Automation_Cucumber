package Framework;


import Framework.Helper.Logs;
import Framework.Ui.DriverFactory.InitDriverFactory;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    @Getter
    protected WebDriver driver;

    InitDriverFactory initDriverFactory = new InitDriverFactory();

    public void setDriver() {
        driver = initDriverFactory.GetWebDriver();
        PageFactory.initElements(driver, this);
        Logs.info("Init test");
    }

    public void endDriver() {
        initDriverFactory.TerminateWebDriver();
        Logs.info("Quit Browser");
        Logs.info("Destroy Driver");
    }
}
