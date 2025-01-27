package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features= {"src/test/java/Featurefiles"},
glue= {"StepDefinition"},
dryRun=true,
monochrome=true

		
		)

public class RunnerTest extends AbstractTestNGCucumberTests {

}
