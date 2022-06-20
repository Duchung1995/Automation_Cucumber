import MasterTest.MasterTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingScript {
    WebDriver driver;

    @BeforeTest
    public void Initial() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/V4/");
    }

    @Test
    public void TestCase1() {
        WebElement Email = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
        WebElement PassWord = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
        WebElement SubmitBtn = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));


        Email.sendKeys("aaaaa");
        PassWord.sendKeys("aaaaa");
        SubmitBtn.click();
    }

    @AfterTest
    public void TearDown() {
        driver.quit();
    }

}
