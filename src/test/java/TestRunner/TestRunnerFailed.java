package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="@target/failedtestcases.txt",
		glue="StepDefinitionFiles",
		plugin={"pretty", // to generate reports
				"html:target/html/htmlreport.html",
				"json:target/cucumber-reports/CucumberTestReport.json",	},
		
		dryRun=false,
		monochrome=true
		
		
		)
public class TestRunnerFailed {

}
