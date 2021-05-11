package TestRunner;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import Utilities.WebdriverFactory;
import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		
		features="classpath:FeatureFiles",
		glue="StepDefinitionFiles",
		tags= "@Quicksearch",			
		plugin = {"pretty", 
				"html:target/html/htmlreport.html",
				"json:target/cucumber.json",
				"rerun:target/failedtestcases.txt"
		},
		
		dryRun=false,	
		monochrome=true,
		publish=true
		
		
		
		)

public class RunnerTest extends WebdriverFactory{
	@AfterClass
	 public static void writeExtentReport() {
		
		
		
		
	}
	
	
	
	/*@AfterClass
	 public static void writeExtentReport() {
	 Reporter.loadXMLConfig(new File("E:\\Automation_softwares _and_jar_files\\eclipsee\\PatseerExplorer\\src\\test\\java\\Utilities\\extent-config.xml"));
	}*/

}

