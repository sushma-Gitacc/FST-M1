package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"StepDefinitions"},
        tags = "@SmokeTest",
       //plugin = {"pretty"},
        //plugin = {"html: test-reports.html"},
        plugin = {"json: test-reports/json-report.json"},
        monochrome = true


)
public class TestRunner {
}
