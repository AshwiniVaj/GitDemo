package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "StepDefinition",
		monochrome=true,
		plugin = {"pretty","html:target/report.html"}
		//dryRun=false,
		//tags = "@SC3"
		)
public class TestRunner {

}
