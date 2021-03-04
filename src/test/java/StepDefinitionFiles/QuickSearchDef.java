package StepDefinitionFiles;


import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Assert;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.util.log.Log;

import PageObjects.QuickSearchObjects;
import PageObjects.SearchResultsPageObjects;
import Utilities.WebdriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class QuickSearchDef extends WebdriverFactory{

	//private static final Logger log = LogManager.getLogger(KeywordSearchDef.class);
	
	Date dt=new Date();

	TestContext t1;
	
	WebDriverWait wait;
	Actions act;
	JavascriptExecutor js;
	public static String queryy="";
	
	 public QuickSearchDef(TestContext test)
     {
    	
		
    	 this.t1=test;
    	 wait=t1.wait;
    	 act=t1.act;
    	 js =t1.js;
    	 
     
     }

	

	@Given("user is on quicksearch form.")
	public void user_is_on_quicksearch_form() throws Exception
	{

		js.executeScript("arguments[0].click()", t1.driver.findElement(t1.com.homePageIcon));
		Thread.sleep(1500);
		t1.driver.navigate().refresh();
		wait.until(ExpectedConditions.visibilityOfElementLocated(t1.qso.quicksearchForm));
		js.executeScript("arguments[0].click()", t1.driver.findElement(t1.qso.quicksearchForm));


	}

	@When("user selects title and abstract field from dropdown and enters {string} in the textbox.")
	public void user_selects_title_and_abstract_field_from_dropdown_and_enters_in_the_textbox(String strin) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.textQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.titleAbstractFieldTextQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldTextTextbox, strin);
		queryy=queryy+"TA:("+strin+") ";
	}

	@Then("user clicks on search button.")
	public void user_clicks_on_search_button() {
		t1.qso.clickOnSearchButtonQuicksearch();
	}




	@When("user selects title  abstract claims field from dropdown and enters {string} in the textbox.")
	public void user_selects_title_abstract_claims_field_from_dropdown_and_enters_in_the_textbox(String string) {


		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.textQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.titleAbstractClaimsFieldTextQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldTextTextbox, string);
		queryy=queryy+"TAC:("+string+") ";

	}



	@When("user selects claims field from dropdown and enters {string} in the textbox.")
	public void user_selects_claims_field_from_dropdown_and_enters_in_the_textbox(String string) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.textQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.claimsFieldTextQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldTextTextbox, string);
		queryy=queryy+"C:("+string+") ";
	}


	@When("user selects fulltext field from dropdown and enters {string} in the textbox.")
	public void user_selects_fulltext_field_from_dropdown_and_enters_in_the_textbox(String string) {

		//t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.textQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.FulltextFieldTextQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldTextTextbox, string);
		queryy=queryy+"TACD:("+string+") ";

	}


	@When("user selects independent claims field from dropdown and enters {string} in the textbox.")
	public void user_selects_independent_claims_field_from_dropdown_and_enters_in_the_textbox(String string) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.textQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.independentClaimsFieldTextQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldTextTextbox, string);
		queryy=queryy+"INC:("+string+") ";
	}


	@When("user selects publication number field from dropdown and enters {string} in the textbox.")
	public void user_selects_publication_number_field_from_dropdown_and_enters_in_the_textbox(String string) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.biblioQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.publicationNoFieldBiblioQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldBiblioTextbox, string);
		queryy=queryy+"PNC:("+string+") ";

	}


	@When("user selects publication date field from dropdown and enters {string} to {string} in the textbox.")
	public void user_selects_publication_date_field_from_dropdown_and_enters_in_the_textbox(String string, String str1) {


		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.biblioQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.publicationDateFieldBiblioQuicksearch);	
		t1.qso.enterDataInTwoDateRangesQuicksearch(t1.qso.firstFieldDateTextbox1, string, t1.qso.firstFieldDateTextbox2, str1);
		queryy=queryy+"PBD:(["+string+" TO "+str1+"])";

	}



	@When("user selects publication Year field from dropdown and enters {string} to {string} in the textbox.")
	public void user_selects_publication_Year_field_from_dropdown_and_enters_in_the_textbox(String string,String string1) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.biblioQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.publicationYearFieldBiblioQuicksearch);	
		t1.qso.enterDataInTwoDateRangesQuicksearch(t1.qso.firstFieldDateTextbox1,string,t1.qso.firstFieldDateTextbox2,string1);
		queryy=queryy+"PBY:(["+string+" TO "+string1+"])";

	}



	@When("user selects Application number field from dropdown and enters {string} in the textbox.")
	public void user_selects_Application_number_field_from_dropdown_and_enters_in_the_textbox(String string) {


		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.biblioQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.applicationNoFieldBiblioQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldBiblioTextbox, string);
		queryy=queryy+"APN:("+string+") ";

	}



	@When("user selects Application date field from dropdown and enters {string} to {string} in the textbox.")
	public void user_selects_Application_date_field_from_dropdown_and_enters_in_the_textbox(String string,String string1) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.biblioQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.applicationDateFieldBiblioQuicksearch);	
		t1.qso.enterDataInTwoDateRangesQuicksearch(t1.qso.firstFieldDateTextbox1, string,t1.qso.firstFieldDateTextbox2,string1);
		queryy=queryy+"APD:(["+string+" TO "+string1+"])";

	}



	@When("user selects Application year field from dropdown and enters {string} to {string} in the textbox.")
	public void user_selects_Application_year_field_from_dropdown_and_enters_in_the_textbox(String string,String string1) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.biblioQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.applicationYearFieldBiblioQuicksearch);	
		t1.qso.enterDataInTwoDateRangesQuicksearch(t1.qso.firstFieldDateTextbox1, string,t1.qso.firstFieldDateTextbox2,string1);
		queryy=queryy+"APY:(["+string+" TO "+string1+"])";

	}

	@When("user selects TAC field in third dropdown and enters {string}.")
	public void user_selects_TAC_field_in_third_dropdown_and_enters(String string) {
		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.thirdFieldDropdown, t1.qso.textQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.FulltextFieldTextQuicksearch);
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.thirdFieldTextTextbox, string);
		queryy=queryy+"TAC:("+string+") ";
	}


	@When("user selects Priority number field from dropdown and enters {string} in the textbox.")
	public void user_selects_Priority_number_field_from_dropdown_and_enters_in_the_textbox(String string) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.biblioQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.priorityNoFieldBiblioQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldBiblioTextbox, string);
		queryy=queryy+"PRN:("+string+") ";


	}


	@When("user selects Priority country field from dropdown and enters {string} in the textbox.")
	public void user_selects_Priority_country_field_from_dropdown_and_enters_in_the_textbox(String string) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.biblioQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.prioritycountryFieldBiblioQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldBiblioTextbox, string);
		queryy=queryy+"PRC:("+string+") ";

	}


	@When("user selects Priority dates field from dropdown and enters {string} to {string} in the textbox.")
	public void user_selects_Priority_dates_field_from_dropdown_and_enters_in_the_textbox(String string,String string1) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.biblioQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.priorityDatesFieldBiblioQuicksearch);	
		t1.qso.enterDataInTwoDateRangesQuicksearch(t1.qso.firstFieldDateTextbox1, string,t1.qso.firstFieldDateTextbox2,string1);
		queryy=queryy+"PRD:(["+string+" TO "+string1+"])";

	}


	@When("user selects Inventor field from dropdown and enters {string} in the textbox.")
	public void user_selects_Inventor_field_from_dropdown_and_enters_in_the_textbox(String string) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.partiesQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.inventorFieldPartiesQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldPartiesTextbox, string);
		queryy=queryy+"INV:("+string+") ";


	}


	@When("user selects Examiner field from dropdown and enters {string} in the textbox.")
	public void user_selects_Examiner_field_from_dropdown_and_enters_in_the_textbox(String string) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.partiesQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.examinerFieldPartiesQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldPartiesTextbox, string);
		queryy=queryy+"EXMR:("+string+") ";

	}


	@When("user selects Attorny field from dropdown and enters {string} in the textbox.")
	public void user_selects_Attorny_field_from_dropdown_and_enters_in_the_textbox(String string) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.partiesQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.attornyFieldPartiesQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldPartiesTextbox, string);
		queryy=queryy+"ATN:("+string+") ";


	}


	@When("user selects current owner field from dropdown and enters {string} in the textbox.")
	public void user_selects_current_owner_field_from_dropdown_and_enters_in_the_textbox(String string) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.partiesQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.currentownerFieldPartiesQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldPartiesTextbox, string);
		queryy=queryy+"PASN:("+string+") ";

	}

	@When("user selects All Assignee field from dropdown and enters {string} in the textbox.")
	public void user_selects_All_Assignee_field_from_dropdown_and_enters_in_the_textbox(String string) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.partiesQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.allAssigneeFieldPartiesQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldPartiesTextbox, string);
		queryy=queryy+"AASN:("+string+") ";


	}
	
	@When("user selects Current & Orig & Norm Assignees CAAN field from dropdown and enters {string} in the textbox.")
	public void user_selects_Current_Orig_Norm_Assignees_CAAN_field_from_dropdown_and_enters_in_the_textbox(String string) {
		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.partiesQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.currentOrigNormAssigneeFieldPartiesQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldPartiesTextbox, string);
		queryy=queryy+"CAAN:("+string+") ";
		
	}


	@When("user selects Assigne normalized field from dropdown and enters {string} in the textbox.")
	public void user_selects_Assigne_normalized_field_from_dropdown_and_enters_in_the_textbox(String string) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.partiesQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.assigneeOrigAndNormalizedFieldPartiesQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldPartiesTextbox, string);
		queryy=queryy+"ASN:("+string+") ";

	}

	@When("user selects Current assignee field from dropdown and enters {string} in the textbox.")
	public void user_selects_Current_assignee_field_from_dropdown_and_enters_in_the_textbox(String string) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.partiesQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.currentAssigneeFieldPartiesQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldPartiesTextbox, string);
		queryy=queryy+"CASN:("+string+") ";

	}

	@When("user selects US classification  field from dropdown and enters {string} in the textbox.")
	public void user_selects_US_classification_field_from_dropdown_and_enters_in_the_textbox(String string) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.classesQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.UCFieldClassesQuicksearch);	
		//t1.qso.selectFieldFromSectionQuicksearch(t1.qso.publicationDateFieldBiblioQuicksearch);	

		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldClassesTextbox2, string);
		queryy=queryy+"UC:("+string+") ";


	}


	@When("user selects All classification field from dropdown and enters {string} in the textbox.")
	public void user_selects_All_classification_field_from_dropdown_and_enters_in_the_textbox(String string) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.classesQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.ACFieldClassesQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldClassesTextbox, string);
		queryy=queryy+"AC:("+string+") ";


	}



	@When("user selects IPC field from dropdown and enters {string} in the textbox.")
	public void user_selects_IPC_field_from_dropdown_and_enters_in_the_textbox(String string) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.classesQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.IPCFieldClassesQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldClassesTextbox2, string);
		queryy=queryy+"IC:("+string+") ";

	}


	@When("user selects Locarno field from dropdown and enters {string} in the textbox.")
	public void user_selects_Locarno_field_from_dropdown_and_enters_in_the_textbox(String string) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.classesQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.LOCFieldClassesQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldClassesTextbox, string);
		queryy=queryy+"LOC:("+string+") ";

	}


	@When("user selects CPC field from dropdown and enters {string} in the textbox.")
	public void user_selects_CPC_field_from_dropdown_and_enters_in_the_textbox(String string) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.classesQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.CPCFieldClassesQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldClassesTextbox2, string);
		queryy=queryy+"CPC:("+string+") ";

	}

	@When("user selects FI classification field from dropdown and enters {string} in the textbox.")
	public void user_selects_FI_classification_field_from_dropdown_and_enters_in_the_textbox(String string) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.classesQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.FIFieldClassesQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldClassesTextbox, string);
		queryy=queryy+"FI:("+string+") ";

	}

	@When("user selects FTERM classification field from dropdown and enters {string} in the textbox.")
	public void user_selects_FTERM_classification_field_from_dropdown_and_enters_in_the_textbox(String string) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.firstFieldDropdown, t1.qso.classesQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.FTermFieldClassesQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.firstFieldClassesTextbox2, string);
		queryy=queryy+"FTERM:("+string+") ";

	}


	@Then("user selects PBD in the third dropdown and enters dates in the PBD fields from {string} to {string}.")
	public void user_selects_PBD_in_the_third_dropdown_and_enters_dates_in_the_PBD_fields_from_to(String string, String string2) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.thirdFieldDropdown, t1.qso.biblioQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.publicationDateFieldBiblioQuicksearch);	
		t1.qso.enterDataInTwoDateRangesQuicksearch(t1.qso.thirdFieldDateTextbox1, string, t1.qso.thirdFieldDateTextbox2, string2);	
		queryy=queryy+"PBD:(["+string+" TO "+string2+"])";

	}

	@Then("user selects OR operator from the first operators dropdown.")
	public void user_selects_OR_operator_from_the_operators_dropdown() {

		t1.qso.selectOperatorFromDropdownQuicksearch(t1.qso.firstOperatorDropdown, "OR");
		queryy=queryy+" OR ";

	}

	@Then("user selects claims field from the second dropdown and enters claims as {string}.")
	public void user_selects_claims_field_from_the_second_dropdown_and_enters_claims_as(String string) {

		t1.qso.mouseHoverOnSectionQuicksearch(t1.qso.secondFieldDropdown, t1.qso.textQuicksearch);
		t1.qso.selectFieldFromSectionQuicksearch(t1.qso.claimsFieldTextQuicksearch);	
		t1.qso.enterDataInTextboxQuicksearch(t1.qso.secondFieldTextTextbox, string);
		queryy=queryy+"C:("+string+") ";
	}

	@Then("user selects AND from the second operators dropdown.")
	public void user_selects_AND_from_the_operators_dropdown() {

		t1.qso.selectOperatorFromDropdownQuicksearch(t1.qso.secondOperatorDropdown, "And");
		queryy=queryy+"AND ";


	}

	@Then("user selects NOT operator from the second operators dropdown.")
	public void user_selects_NOT_operator_from_the_operators_dropdown() {

		t1.qso.selectOperatorFromDropdownQuicksearch(t1.qso.secondOperatorDropdown, "NOT");

		queryy=queryy+"NOT ";

	}
	@Then("user navigates to the results page having results based on the given input.")
	public void results_page_should_be_displayed() throws InterruptedException 
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(t1.srpo.RecordCountSearchResultPage));
		String querydata="T:motoor NOT ("+queryy+")";
		System.out.println("###################################################################################"+querydata);

		if(t1.driver.findElement(t1.srpo.firstrecordcheckboxSearchResultsPage).isDisplayed())
		{

			//Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}

		t1.qso.enterDataInTextboxQuicksearch(t1.srpo.smartsearchtextboxSearchResultsPage,querydata );
		t1.srpo.click_on_element(t1.srpo.smartsearchsearchbuttonSearchResultsPage);
		queryy="";
		Thread.sleep(1500);
		String arr[]=t1.driver.findElement(t1.srpo.RecordCountSearchResultPage).getText().split(" ");
		System.out.println("###################################################################################"+arr[0]);
		if(arr[0].equals("0"))
		{

			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail("Expected 0 results but found "+arr[0]+" results");
		}

	}


	
	
	






}
