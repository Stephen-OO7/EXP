package StepDefinitionFiles;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.CommonObjects;
import PageObjects.KeywordSearchObjects;
import PageObjects.ParagraphSearchObjects;
import PageObjects.QuickSearchObjects;
import PageObjects.SearchResultsPageObjects;
import Utilities.WebdriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class TestContext extends WebdriverFactory{

	WebDriver driver;
	QuickSearchObjects qso;
	CommonObjects com;
	SearchResultsPageObjects srpo;
	ParagraphSearchObjects pso;
	KeywordSearchObjects ks;
	WebDriverWait wait;
	Actions act;
	Scenario scn;
	JavascriptExecutor js;
	Date dt=new Date();

	@Before()
	public void test(Scenario scn)
	{
		driver=Driver();
		this.scn=scn;
		qso=new QuickSearchObjects(driver);
		com=new CommonObjects(driver);
		srpo=new SearchResultsPageObjects(driver);
		pso=new ParagraphSearchObjects(driver);
		ks=new KeywordSearchObjects(driver);
		wait=new WebDriverWait(driver,60);
		act=new Actions(driver);
		js = (JavascriptExecutor) driver;
	}


	@After
	public void screehshot(Scenario s) throws IOException
	{
		if (s.isFailed())
		{
			TakesScreenshot scrnShot = (TakesScreenshot)Driver();
			String name=""+s.getName()+"_"+dt.toString().replace(":", " ")+".png";

			File screenshotfile = scrnShot.getScreenshotAs(OutputType.FILE);
			byte[] data = scrnShot.getScreenshotAs(OutputType.BYTES);

			String path="E:\\Automation_softwares _and_jar_files\\Screenshots\\"+name;
			FileUtils.copyFile(screenshotfile, new File(path));
			scn.attach(data, "image/png","Failed Step Name: " +name);

		}else{

		}
		close();

	}


}
