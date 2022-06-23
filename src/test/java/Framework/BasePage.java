package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void SetPageUrl(String url) {
        driver.get(url);
    }

    public void GoTo(String url) {
        driver.get(url);
    }

}
