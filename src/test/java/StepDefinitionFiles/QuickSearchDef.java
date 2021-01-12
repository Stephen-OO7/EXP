package StepDefinitionFiles;


import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.util.log.Log;

import PageObjects.CommonObjects;
import PageObjects.QuickSearchObjects;
import PageObjects.SearchResultsPageObjects;
import Utilities.Base;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class QuickSearchDef extends Base{

	private static final Logger log = LogManager.getLogger(KeywordSearchDef.class);
	Scenario scn;
	Date dt=new Date();
	QuickSearchObjects qso=new QuickSearchObjects(Driver());
	CommonObjects com=new CommonObjects(Driver());
	SearchResultsPageObjects srpo=new SearchResultsPageObjects(Driver());
	WebDriverWait wait=new WebDriverWait(Driver(),60);
	Actions act=new Actions(Driver());
	JavascriptExecutor js = (JavascriptExecutor) Driver();

	@BeforeClass
	public void setup(Scenario scn)
	{
		

		this.scn=scn;
		Driver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}


	@Given("user is on quicksearch form.")
	public void user_is_on_quicksearch_form() throws Exception
	{

		js.executeScript("arguments[0].click()", Driver().findElement(com.homePageIcon));
		Thread.sleep(1500);
		Driver().navigate().refresh();
		wait.until(ExpectedConditions.visibilityOfElementLocated(qso.quicksearchForm));
		js.executeScript("arguments[0].click()", Driver().findElement(qso.quicksearchForm));


	}

	@When("user selects title and abstract field from dropdown and enters {string} in the textbox.")
	public void user_selects_title_and_abstract_field_from_dropdown_and_enters_in_the_textbox(String strin) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.textQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.titleAbstractFieldTextQuicksearch);	
		qso.enterDataInTextboxQuicksearch(qso.firstFieldTextTextbox, strin);
	}

	@Then("user clicks on search button.")
	public void user_clicks_on_search_button() {
		qso.clickOnSearchButtonQuicksearch();
	}

	@Then("user navigates to the results page having results based on the given input.")
	public void results_page_should_be_displayed() 
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(srpo.RecordCountSearchResultPage));
		if(Driver().findElement(srpo.RecordCountSearchResultPage).isDisplayed())
		{

			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}

	}



	@When("user selects title  abstract claims field from dropdown and enters {string} in the textbox.")
	public void user_selects_title_abstract_claims_field_from_dropdown_and_enters_in_the_textbox(String string) {


		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.textQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.titleAbstractClaimsFieldTextQuicksearch);	
		qso.enterDataInTextboxQuicksearch(qso.firstFieldTextTextbox, string);
	}



	@When("user selects claims field from dropdown and enters {string} in the textbox.")
	public void user_selects_claims_field_from_dropdown_and_enters_in_the_textbox(String string) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.textQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.claimsFieldTextQuicksearch);	
		qso.enterDataInTextboxQuicksearch(qso.firstFieldTextTextbox, string);
	}


	@When("user selects fulltext field from dropdown and enters {string} in the textbox.")
	public void user_selects_fulltext_field_from_dropdown_and_enters_in_the_textbox(String string) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.textQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.FulltextFieldTextQuicksearch);	
		qso.enterDataInTextboxQuicksearch(qso.firstFieldTextTextbox, string);

	}


	@When("user selects independent claims field from dropdown and enters {string} in the textbox.")
	public void user_selects_independent_claims_field_from_dropdown_and_enters_in_the_textbox(String string) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.textQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.independentClaimsFieldTextQuicksearch);	
		qso.enterDataInTextboxQuicksearch(qso.firstFieldTextTextbox, string);
	}


	@When("user selects publication number field from dropdown and enters {string} in the textbox.")
	public void user_selects_publication_number_field_from_dropdown_and_enters_in_the_textbox(String string) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.biblioQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.publicationNoFieldBiblioQuicksearch);	
		qso.enterDataInTextboxQuicksearch(qso.firstFieldBiblioTextbox, string);

	}


	@When("user selects publication date field from dropdown and enters {string} to {string} in the textbox.")
	public void user_selects_publication_date_field_from_dropdown_and_enters_in_the_textbox(String string, String str1) {


		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.biblioQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.publicationDateFieldBiblioQuicksearch);	
		qso.enterDataInTwoDateRangesQuicksearch(qso.firstFieldDateTextbox1, string, qso.firstFieldDateTextbox2, str1);


	}



	@When("user selects publication Year field from dropdown and enters {string} to {string} in the textbox.")
	public void user_selects_publication_Year_field_from_dropdown_and_enters_in_the_textbox(String string,String string1) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.biblioQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.publicationYearFieldBiblioQuicksearch);	
		qso.enterDataInTwoDateRangesQuicksearch(qso.firstFieldDateTextbox1,string,qso.firstFieldDateTextbox2,string1);


	}



	@When("user selects Application number field from dropdown and enters {string} in the textbox.")
	public void user_selects_Application_number_field_from_dropdown_and_enters_in_the_textbox(String string) {


		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.biblioQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.applicationNoFieldBiblioQuicksearch);	
		qso.enterDataInTextboxQuicksearch(qso.firstFieldBiblioTextbox, string);

	}



	@When("user selects Application date field from dropdown and enters {string} to {string} in the textbox.")
	public void user_selects_Application_date_field_from_dropdown_and_enters_in_the_textbox(String string,String string1) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.biblioQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.applicationDateFieldBiblioQuicksearch);	
		qso.enterDataInTwoDateRangesQuicksearch(qso.firstFieldDateTextbox1, string,qso.firstFieldDateTextbox2,string1);


	}



	@When("user selects Application year field from dropdown and enters {string} to {string} in the textbox.")
	public void user_selects_Application_year_field_from_dropdown_and_enters_in_the_textbox(String string,String string1) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.biblioQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.applicationYearFieldBiblioQuicksearch);	
		qso.enterDataInTwoDateRangesQuicksearch(qso.firstFieldDateTextbox1, string,qso.firstFieldDateTextbox2,string1);


	}


	@When("user selects Priority number field from dropdown and enters {string} in the textbox.")
	public void user_selects_Priority_number_field_from_dropdown_and_enters_in_the_textbox(String string) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.biblioQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.priorityNoFieldBiblioQuicksearch);	
		qso.enterDataInTextboxQuicksearch(qso.firstFieldBiblioTextbox, string);


	}


	@When("user selects Priority country field from dropdown and enters {string} in the textbox.")
	public void user_selects_Priority_country_field_from_dropdown_and_enters_in_the_textbox(String string) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.biblioQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.prioritycountryFieldBiblioQuicksearch);	
		qso.enterDataInTextboxQuicksearch(qso.firstFieldBiblioTextbox, string);

	}


	@When("user selects Priority dates field from dropdown and enters {string} to {string} in the textbox.")
	public void user_selects_Priority_dates_field_from_dropdown_and_enters_in_the_textbox(String string,String string1) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.biblioQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.priorityDatesFieldBiblioQuicksearch);	
		qso.enterDataInTwoDateRangesQuicksearch(qso.firstFieldDateTextbox1, string,qso.firstFieldDateTextbox2,string1);


	}


	@When("user selects Inventor field from dropdown and enters {string} in the textbox.")
	public void user_selects_Inventor_field_from_dropdown_and_enters_in_the_textbox(String string) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.partiesQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.inventorFieldPartiesQuicksearch);	
		qso.enterDataInTextboxQuicksearch(qso.firstFieldPartiesTextbox, string);


	}


	@When("user selects Examiner field from dropdown and enters {string} in the textbox.")
	public void user_selects_Examiner_field_from_dropdown_and_enters_in_the_textbox(String string) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.partiesQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.examinerFieldPartiesQuicksearch);	
		qso.enterDataInTextboxQuicksearch(qso.firstFieldPartiesTextbox, string);


	}


	@When("user selects Attorny field from dropdown and enters {string} in the textbox.")
	public void user_selects_Attorny_field_from_dropdown_and_enters_in_the_textbox(String string) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.partiesQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.attornyFieldPartiesQuicksearch);	
		qso.enterDataInTextboxQuicksearch(qso.firstFieldPartiesTextbox, string);


	}


	@When("user selects current owner field from dropdown and enters {string} in the textbox.")
	public void user_selects_current_owner_field_from_dropdown_and_enters_in_the_textbox(String string) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.partiesQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.currentownerFieldPartiesQuicksearch);	
		qso.enterDataInTextboxQuicksearch(qso.firstFieldPartiesTextbox, string);


	}

	@When("user selects All Assignee field from dropdown and enters {string} in the textbox.")
	public void user_selects_All_Assignee_field_from_dropdown_and_enters_in_the_textbox(String string) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.partiesQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.allAssigneeFieldPartiesQuicksearch);	
		qso.enterDataInTextboxQuicksearch(qso.firstFieldPartiesTextbox, string);


	}


	@When("user selects Assigne normalized field from dropdown and enters {string} in the textbox.")
	public void user_selects_Assigne_normalized_field_from_dropdown_and_enters_in_the_textbox(String string) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.partiesQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.assigneeOrigAndNormalizedFieldPartiesQuicksearch);	
		qso.enterDataInTextboxQuicksearch(qso.firstFieldPartiesTextbox, string);


	}

	@When("user selects Current assignee field from dropdown and enters {string} in the textbox.")
	public void user_selects_Current_assignee_field_from_dropdown_and_enters_in_the_textbox(String string) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.partiesQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.currentAssigneeFieldPartiesQuicksearch);	
		qso.enterDataInTextboxQuicksearch(qso.firstFieldPartiesTextbox, string);


	}

	@When("user selects US classification  field from dropdown and enters {string} in the textbox.")
	public void user_selects_US_classification_field_from_dropdown_and_enters_in_the_textbox(String string) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.classesQuicksearch);
		//qso.selectFieldFromSectionQuicksearch(qso.UCFieldClassesQuicksearch);	
		qso.selectFieldFromSectionQuicksearch(qso.publicationDateFieldBiblioQuicksearch);	
		
		qso.enterDataInTextboxQuicksearch(qso.firstFieldClassesTextbox2, string);


	}


	@When("user selects All classification field from dropdown and enters {string} in the textbox.")
	public void user_selects_All_classification_field_from_dropdown_and_enters_in_the_textbox(String string) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.classesQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.ACFieldClassesQuicksearch);	
		qso.enterDataInTextboxQuicksearch(qso.firstFieldClassesTextbox, string);


	}



	@When("user selects IPC field from dropdown and enters {string} in the textbox.")
	public void user_selects_IPC_field_from_dropdown_and_enters_in_the_textbox(String string) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.classesQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.IPCFieldClassesQuicksearch);	
		qso.enterDataInTextboxQuicksearch(qso.firstFieldClassesTextbox2, string);

	}


	@When("user selects Locarno field from dropdown and enters {string} in the textbox.")
	public void user_selects_Locarno_field_from_dropdown_and_enters_in_the_textbox(String string) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.classesQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.LOCFieldClassesQuicksearch);	
		qso.enterDataInTextboxQuicksearch(qso.firstFieldClassesTextbox, string);

	}


	@When("user selects CPC field from dropdown and enters {string} in the textbox.")
	public void user_selects_CPC_field_from_dropdown_and_enters_in_the_textbox(String string) {

		qso.mouseHoverOnSectionQuicksearch(qso.firstFieldDropdown, qso.classesQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.CPCFieldClassesQuicksearch);	
		qso.enterDataInTextboxQuicksearch(qso.firstFieldClassesTextbox2, string);

	}

	@Then("user selects PBD in the third dropdown and enters dates in the PBD fields from {string} to {string}.")
	public void user_selects_PBD_in_the_third_dropdown_and_enters_dates_in_the_PBD_fields_from_to(String string, String string2) {

		qso.mouseHoverOnSectionQuicksearch(qso.thirdFieldDropdown, qso.biblioQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.publicationDateFieldBiblioQuicksearch);	
		qso.enterDataInTwoDateRangesQuicksearch(qso.thirdFieldDateTextbox1, string, qso.thirdFieldDateTextbox2, string2);	
	}

	@Then("user selects OR operator from the first operators dropdown.")
	public void user_selects_OR_operator_from_the_operators_dropdown() {

		qso.selectOperatorFromDropdownQuicksearch(qso.firstOperatorDropdown, "OR");

	}

	@Then("user selects claims field from the second dropdown and enters claims as {string}.")
	public void user_selects_claims_field_from_the_second_dropdown_and_enters_claims_as(String string) {

		qso.mouseHoverOnSectionQuicksearch(qso.secondFieldDropdown, qso.textQuicksearch);
		qso.selectFieldFromSectionQuicksearch(qso.claimsFieldTextQuicksearch);	
		qso.enterDataInTextboxQuicksearch(qso.secondFieldTextTextbox, string);

	}

	@Then("user selects AND from the second operators dropdown.")
	public void user_selects_AND_from_the_operators_dropdown() {

		qso.selectOperatorFromDropdownQuicksearch(qso.secondOperatorDropdown, "And");


	}

	@Then("user selects NOT operator from the second operators dropdown.")
	public void user_selects_NOT_operator_from_the_operators_dropdown() {

		qso.selectOperatorFromDropdownQuicksearch(qso.secondOperatorDropdown, "NOT");

	}




@After
public void screehshot(Scenario s) throws IOException
{
	 if (s.isFailed()) {
	        TakesScreenshot scrnShot = (TakesScreenshot)driver;
	        
	       File screenshotfile = scrnShot.getScreenshotAs(OutputType.FILE);
	       String path="E:\\Automation_softwares _and_jar_files\\Screenshots\\"+s.getName()+"_"+dt.getTime()+".png";
	       FileUtils.copyFile(screenshotfile, new File(path));
	       
	    }else{
	        
	    }

}






}
