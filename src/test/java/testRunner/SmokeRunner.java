package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\features\\login.feature", glue = "stepDefinitions", dryRun = false, tags = "@Login1")
public class SmokeRunner {
}
