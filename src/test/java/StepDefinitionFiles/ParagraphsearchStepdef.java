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

import PageObjects.CommonObjects;
import PageObjects.ParagraphSearchObjects;
import PageObjects.QuickSearchObjects;
import PageObjects.SearchResultsPageObjects;
import Utilities.Base;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParagraphsearchStepdef extends Base{


	//private static final Logger log = LogManager.getLogger(KeywordSearchDef.class);
	Scenario scn;
	QuickSearchObjects qso=new QuickSearchObjects(Driver());
	CommonObjects com=new CommonObjects(Driver());
	SearchResultsPageObjects srpo=new SearchResultsPageObjects(Driver());
	ParagraphSearchObjects pso=new ParagraphSearchObjects();
	WebDriverWait wait=new WebDriverWait(Driver(),60);
	Actions act=new Actions(Driver());
	List<WebElement> l;
	JavascriptExecutor js = (JavascriptExecutor) Driver();


	@Before
	public void setup(Scenario scn) throws InterruptedException
	{

		this.scn=scn;
		Driver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Given("user is on Paragraph search form.")
	public void user_is_on_paragraph_search_form() throws InterruptedException {
		com.clickOnElement(com.homePageIcon);
		Thread.sleep(1500);
		Driver().navigate().refresh();
		wait.until(ExpectedConditions.visibilityOfElementLocated(pso.paragraphsearchForm));
		com.clickOnElement(pso.paragraphsearchForm);
	}


	@When("user enters a paragraph {string} in paragraph search.")
	public void user_enters_a_paragraph_in_paragraph_search(String string) {
		com.sendKeysElement(pso.paragraphsearchTextbox, string);


	}
	@When("user clicks on search button on paragraph search form")
	public void user_clicks_on_search_button_on_paragraph_search_form() {
		com.clickOnElement(pso.paragraphsearchSearchbutton);

	}
	@When("user cicks on submit button.")
	public void user_cicks_on_submit_button() {

		com.clickOnElement(pso.paragraphsearchSubmitbutton);
	}


	@When("user deletes some highlighted keywords form the identified key technologies window.")
	public void user_deletes_some_highlighted_keywords_form_the_identified_key_technologies_window() throws InterruptedException {

		l=pso.getHighlightedKeywords();
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
		l=pso.getHighlightedKeywords();
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(pso.paragraphsearchHighlightedeywords));
		Thread.sleep(500);
		l=pso.getHighlightedKeywords();
		int s=l.size();

		if(s<0) {
			l.clear();
			Assert.fail("Keywords not highlighted");
		}

		l.clear();
		act.moveByOffset(259, 273).doubleClick().build().perform();
		Thread.sleep(500);
		l=pso.getHighlightedKeywords();
		int s1=l.size();
		if(s>s1)
		{
			Assert.fail("user is not able to add new terms in technologies area in paragraph search");
		}


	}



	@Then("user should navigate to the results page from paragraph search.")
	public void user_should_navigate_to_the_results_page_from_paragraph_search() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(srpo.RecordCountSearchResultPage));
		wait.until(ExpectedConditions.visibilityOfElementLocated(srpo.firstrecordcheckboxSearchResultsPage));

		if(Driver().findElement(srpo.firstrecordcheckboxSearchResultsPage).isDisplayed())
		{

			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}

	}







}
