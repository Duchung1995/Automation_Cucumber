package resources.RunTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
//import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/resources/Feature/Login.feature"},
//        plugin ={"json:target/cucumber-reports/CucumberTestReport.json",
//                "html:target/html/native-cucumber-reporting.html"},
        dryRun = false,
        glue = {"resources.StepDefinitions.Hooks", "resources.StepDefinitions", },
        tags = "@sanity")
public class RunTest extends AbstractTestNGCucumberTests {

}
