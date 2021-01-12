package TestRunner;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features="E:\\Automation_softwares _and_jar_files\\eclipsee\\PatseerExplorer\\src\\test\\resources\\FeatureFiles",
		glue="StepDefinitionFiles",
		tags= {"@Login or @Quicksearch and @Clases"},
		plugin = {"pretty", // to generate reports
				"html:target/html/",
				"json:target/json/file.json",
		},
		dryRun=false,	
		monochrome=true,
		strict=true
		)

public class RunnerTest {

}

