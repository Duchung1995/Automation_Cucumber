package Resources.WebUi;

import Framework.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "Email")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(id = "Password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    @CacheLookup
    WebElement btnLogin;

    @FindBy(linkText = "Logout")
    @CacheLookup
    WebElement lnkLogout;

    WebDriver driver;
    BasePage basePage;

    public void SetPageUrl(String url){
       getDriver().get(url);
    }

    public void setUserName(String uname) {
        txtEmail.clear();
        txtEmail.sendKeys(uname);

    }

    public void setPassword(String pwd) {
        txtPassword.clear();
        txtPassword.sendKeys(pwd);
    }

    public void clickLogin() {
        btnLogin.click();
    }

    public void clickLogout() {
        lnkLogout.click();
    }

    public boolean isDisplayed(String url) {
        if ( getDriver().getCurrentUrl().equalsIgnoreCase(url)) {
            return true;
        }
        return false;
    }

}