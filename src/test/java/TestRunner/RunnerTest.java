package TestRunner;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import Utilities.Base;
import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		//features="E:\\Automation_softwares _and_jar_files\\eclipsee\\PatseerExplorer\\src\\test\\resources\\FeatureFiles",
		features="classpath:FeatureFiles",
		glue="StepDefinitionFiles",
		tags= "",			
		plugin = {"pretty", // to generate reports
				"html:target/html/htmlreport.html",
				"json:target/cucumber.json",
				"rerun:target/failedtestcases.txt"
		},
		
		dryRun=false,	
		monochrome=true
		//strict=true,
		//publish=false
		
		)

public class RunnerTest extends Base{
	@AfterClass
	 public static void writeExtentReport() {
		
		//Driver().quit();
		
		
	}
	
	
	
	/*@AfterClass
	 public static void writeExtentReport() {
	 Reporter.loadXMLConfig(new File("E:\\Automation_softwares _and_jar_files\\eclipsee\\PatseerExplorer\\src\\test\\java\\Utilities\\extent-config.xml"));
	}*/

}

