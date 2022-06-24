package Framework;


import Framework.Helper.Log;
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
        Log.info("Init test");
    }

    public void endDriver() {
        initDriverFactory.TerminateWebDriver();
        Log.info("Quit Browser");
        Log.info("Destroy Driver");
    }
}
