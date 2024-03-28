package appfeatureStep;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features={"src\\test\\resources\\AppFeature"},
		//features={"@target/failedTest.txt"},
		glue={"appfeatureStep"},
		plugin={"pretty","html:target/cucumber-reports/amazonreports.html","rerun:target/cucumber-reports/failedTest.txt"},
		//plugin={"pretty","rerun:target/cucumber-reports/failedTest.txt"},

		tags="",
		publish=true,
		dryRun=false
		)

public class AppRunnerClass extends AbstractTestNGCucumberTests 
{


}
