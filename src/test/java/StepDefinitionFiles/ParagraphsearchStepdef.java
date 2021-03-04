package StepDefinitionFiles;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import PageObjects.ParagraphSearchObjects;
import PageObjects.QuickSearchObjects;
import PageObjects.SearchResultsPageObjects;
import Utilities.WebdriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParagraphsearchStepdef extends WebdriverFactory{
	//private static final Logger log = LogManager.getLogger(KeywordSearchDef.class);

	TestContext t1;
	
	WebDriverWait wait;
	Actions act;
	JavascriptExecutor js;
	List<WebElement> l;
	 public ParagraphsearchStepdef(TestContext test)
     {
    	
		
    	 this.t1=test;
    	 wait=t1.wait;
    	 act=t1.act;
    	 js =t1.js;
    	 
     
     }
	
   
    

	
	@Given("user is on Paragraph search form.")
	public void user_is_on_paragraph_search_form() throws InterruptedException {
		t1.com.clickOnElement(t1.com.homePageIcon);
		Thread.sleep(1500);
		t1.driver.navigate().refresh();
		wait.until(ExpectedConditions.visibilityOfElementLocated(t1.pso.paragraphsearchForm));
		t1.com.clickOnElement(t1.pso.paragraphsearchForm);
	}


	@When("user enters a paragraph {string} in paragraph search.")
	public void user_enters_a_paragraph_in_paragraph_search(String string) {
		t1.com.sendKeysElement(t1.pso.paragraphsearchTextbox, string);


	}
	@When("user clicks on search button on paragraph search form")
	public void user_clicks_on_search_button_on_paragraph_search_form() {
		t1.com.clickOnElement(t1.pso.paragraphsearchSearchbutton);

	}
	@When("user cicks on submit button.")
	public void user_cicks_on_submit_button() {

		t1.com.clickOnElement(t1.pso.paragraphsearchSubmitbutton);
	}


	@When("user deletes some highlighted keywords form the identified key technologies window.")
	public void user_deletes_some_highlighted_keywords_form_the_identified_key_technologies_window() throws InterruptedException {

		l=t1.pso.getHighlightedKeywords();
		int s=l.size();
		if(s>0)
		{
			l.get(0).click();

		}
		else
		{
			l.clear();
			Assert.fail("Keywords not highlighted");
		}
		l.clear();
		l=t1.pso.getHighlightedKeywords();
		int s1=l.size();
		if(s>s1){
			l.clear();

		}
		else
		{
			l.clear();
			Assert.fail("not able to remove highlighted terms");
		}


	}
	@When("user enters some highlighted keywords form the identified key technologies window.")
	public void user_enters_new_keywords_form_the_identified_key_technologies_window() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(t1.pso.paragraphsearchHighlightedeywords));
		Thread.sleep(500);
		l=t1.pso.getHighlightedKeywords();
		int s=l.size();

		if(s<0) {
			l.clear();
			Assert.fail("Keywords not highlighted");
		}

		l.clear();
		act.moveByOffset(259, 273).doubleClick().build().perform();
		Thread.sleep(500);
		l=t1.pso.getHighlightedKeywords();
		int s1=l.size();
		if(s>s1)
		{
			Assert.fail("user is not able to add new terms in technologies area in paragraph search");
		}


	}



	@Then("user should navigate to the results page from paragraph search.")
	public void user_should_navigate_to_the_results_page_from_paragraph_search() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(t1.srpo.RecordCountSearchResultPage));
		wait.until(ExpectedConditions.visibilityOfElementLocated(t1.srpo.firstrecordcheckboxSearchResultsPage));

		if(t1.driver.findElement(t1.srpo.firstrecordcheckboxSearchResultsPage).isDisplayed())
		{

			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}

	}







}
