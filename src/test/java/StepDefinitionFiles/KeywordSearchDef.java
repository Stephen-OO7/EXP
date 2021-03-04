package StepDefinitionFiles;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Assert;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import PageObjects.KeywordSearchObjects;
import PageObjects.SearchResultsPageObjects;
import Utilities.WebdriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class KeywordSearchDef extends WebdriverFactory{
	
//	private static final Logger log = LogManager.getLogger(KeywordSearchDef.class);

	TestContext t1;
	
	WebDriverWait wait;
	Actions act;
	JavascriptExecutor js;
	
	List<WebElement> l;
	
	
	 public KeywordSearchDef(TestContext test)
     {
    	
		
    	 this.t1=test;
    	 wait=t1.wait;
    	 act=t1.act;
    	 js =t1.js;
    	 
     
     }

	@Given("user is logged in.")
	public void loogin() throws InterruptedException {
		
	}

	@Given("user is on homepage.")
	public void user_is_on_homepagee() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(t1.ks.homePageIcon));
		js.executeScript("arguments[0].click();", Driver().findElement(t1.ks.homePageIcon));
		Thread.sleep(1000);
		
		
	}

	@When("user enter {string} and auto suggestions are dispayed based on the input keyword.")
	public void user_enter(String string) throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOfElementLocated(t1.ks.KeywordSearchTextbox));
		l=t1.ks.getAutosuggestionsInKeywordSearch(string);

	}

	@When("user clict1.ks on the appeared auto suggestion")
	public void appeared_auto_suggestion() throws InterruptedException {
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", l.get(3));
	}

	@Then("the selected auto suggestion should appear in the search textbox")
	public void the_selected_auto_suggestion_should_appear_in_the_search_textbox() throws InterruptedException {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(t1.ks.closeKeyword));
		if(Driver().findElement(t1.ks.closeKeyword).isDisplayed())
		{
			Driver().findElement(t1.ks.closeKeyword).click();
			Assert.assertTrue(true);
		}
	}


	@When("user enters keywords and user clict1.ks on search button")
	public void user_enters(DataTable dt) throws InterruptedException
	{
		
		
		List <String> l =dt.asList();
		System.out.println(l.size()+"ghghhjj "+l.get(1));
		for(int i=0;i<=l.size()-1;i++)
		{
			Driver().findElement(t1.qso.quicksearchForm).click();
			Driver().findElement(t1.ks.KeywordSearchForm).click();
			Thread.sleep(3000);
			Driver().navigate().refresh();
			Driver().findElement(t1.ks.KeywordSearchTextbox).clear();
			t1.ks.enterKeywordInKeywordSearch(l.get(i));
			t1.ks.clickOnSearchButtonInKeywordSearch();
			wait.until(ExpectedConditions.visibilityOfElementLocated(t1.srpo.RecordCountSearchResultPage));
			if(Driver().findElement(t1.srpo.RecordCountSearchResultPage).isDisplayed())
			{
				
			}
			else
			{
				Assert.fail();
			}
			user_is_on_homepagee();
		}

	}



	@Then("results should be displayed on the results page for the entered keyword.")
	public void results_should_be_displayed_on_the_results_page_for_the_entered_keyword() {

	}
	
	




}
