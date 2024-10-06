package testRunner;
//This is my test runner class

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags= {"@TC001"},
		features=".//Features//",
		glue={"stepDefinitions","hooks"},
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		)
public class TestRunner {

}
