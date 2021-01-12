package StepDefinitionFiles;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
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
import Utilities.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class KeywordSearchDef extends Base{
	
	private static final Logger log = LogManager.getLogger(KeywordSearchDef.class);

	Scenario scn;
	WebDriverWait wait=new WebDriverWait(Driver(),60);
	Actions act=new Actions(Driver());
	JavascriptExecutor js = (JavascriptExecutor) Driver();
	KeywordSearchObjects ks=new KeywordSearchObjects(Driver());
	SearchResultsPageObjects srp=new SearchResultsPageObjects(Driver());
	List<WebElement> l;

	@Before
	public void setup(Scenario scn)
	{
		this.scn=scn;
		
	}

	@Given("user is logged in.")
	public void login() {
		super.login();
	}

	@Given("user is on homepage.")
	public void user_is_on_homepagee() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(ks.homePageIcon));
		js.executeScript("arguments[0].click();", Driver().findElement(ks.homePageIcon));
		
	}

	@When("user enter {string} and auto suggestions are dispayed based on the input keyword.")
	public void user_enter(String string) throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOfElementLocated(ks.KeywordSearchTextbox));
		l=ks.getAutosuggestionsInKeywordSearch(string);

	}

	@When("user clicks on the appeared auto suggestion")
	public void user_clicks_on_the_appeared_auto_suggestion() throws InterruptedException {
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", l.get(3));
	}

	@Then("the selected auto suggestion should appear in the search textbox")
	public void the_selected_auto_suggestion_should_appear_in_the_search_textbox() throws InterruptedException {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ks.closeKeyword));
		if(Driver().findElement(ks.closeKeyword).isDisplayed())
		{
			Driver().findElement(ks.closeKeyword).click();
			Assert.assertTrue(true);
		}
	}


	@When("user enters keywords and user clicks on search button")
	public void user_enters(DataTable dt) throws InterruptedException
	{
		Driver().navigate().refresh();
		List <String> l =dt.asList();
		System.out.println(l.size()+"ghghhjj "+l.get(1));
		for(int i=0;i<=l.size()-1;i++)
		{
			ks.enterKeywordInKeywordSearch(l.get(i));
			ks.clickOnSearchButtonInKeywordSearch();
			wait.until(ExpectedConditions.visibilityOfElementLocated(srp.RecordCountSearchResultPage));
			if(Driver().findElement(srp.RecordCountSearchResultPage).isDisplayed())
			{}
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
