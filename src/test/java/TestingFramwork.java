import MasterTest.MasterTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingFramwork extends MasterTest {
    WebDriver driver = Driver;


    @BeforeTest
    public void Initial() {
        InitializeTest();
    }

    @Test
    public void TestCase1() {
        System.out.print(driver);
    }

    @AfterTest
    public void TearDown() {
        Teardown();
    }

}
