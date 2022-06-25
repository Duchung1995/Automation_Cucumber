package Resources.WebUi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class Customer {
    @FindBy(xpath = "//div[@class='Umvnrc']")
    public WebElement umvnrcDiv;

    @FindBy(css = "[data-ved = '0ahUKEwjM9qLztsf4AhWGhGMGHUfyB7oQ4dUDCAs']")
    public WebElement abc;

    @FindBy(css = "[data-ved = '0ahUKEwjM9qLztsf4AhWGhGMGHUfyB7oQ4dUDCAs']")
    public WebElement aaa;

    @FindBy(xpath = "//span[@class='ly0Ckb']")
    public WebElement lyCkbSpan;

    

    // No page elements added

    public Customer(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}