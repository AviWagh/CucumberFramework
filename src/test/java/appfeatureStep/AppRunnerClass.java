package appfeatureStep;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features={"src\\test\\resources\\AppFeature"},
		glue={"appfeatureStep"},
		plugin={"pretty","html:target/cucumber-reports/amazonreports.html"},
		tags="",
		dryRun=false
)

public class AppRunnerClass extends AbstractTestNGCucumberTests 
{
	

}
