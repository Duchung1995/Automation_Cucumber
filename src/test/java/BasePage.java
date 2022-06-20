import MasterTest.MasterTest;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected WebDriver Driver;
//    MasterTest masterTest = new MasterTest();

    protected BasePage() {
//        Driver = masterTest.Driver;
    }

    public void GoTo(String url) {
        Driver.get(url);
    }
}
