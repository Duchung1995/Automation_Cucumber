package Resources.RunTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/resources/Feature/Login.feature"},
        plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        dryRun = false,
        glue = {"Resources.StepDefinitions.Hooks", "Resources.StepDefinitions", },
        tags = "@sanity")
public class RunTest extends AbstractTestNGCucumberTests {

}
