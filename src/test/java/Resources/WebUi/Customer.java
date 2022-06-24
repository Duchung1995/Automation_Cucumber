package Resources.WebUi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://www.google.com/?gws_rd=ssl
public class Customer {
    @FindBy(xpath = "//div[@class='Umvnrc']")
    public WebElement umvnrcDiv;

    

    // No page elements added

    public Customer(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}