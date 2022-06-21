package resources.RunTest;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = {"src/test/java/resources/Feature/Login.feature"},
//        plugin ={"json:target/cucumber-reports/CucumberTestReport.json",
//                "html:target/html/native-cucumber-reporting.html"},
        dryRun = false,
        glue = "resources.StepDef",
        tags = "@sanity")

public class RunTest extends AbstractTestNGCucumberTests{

}
