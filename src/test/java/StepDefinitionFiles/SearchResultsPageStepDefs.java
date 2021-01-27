package StepDefinitionFiles;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.CommonObjects;
import PageObjects.QuickSearchObjects;
import PageObjects.SearchResultsPageObjects;
import Utilities.Base;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchResultsPageStepDefs extends Base{


	//private static final Logger log = LogManager.getLogger(KeywordSearchDef.class);
	Scenario scn;
	Date dt=new Date();
	QuickSearchObjects qso=new QuickSearchObjects(Driver());
	CommonObjects com=new CommonObjects(Driver());
	SearchResultsPageObjects srpo=new SearchResultsPageObjects(Driver());
	WebDriverWait wait=new WebDriverWait(Driver(),60);
	Actions act=new Actions(Driver());
	JavascriptExecutor js = (JavascriptExecutor) Driver();
	int filter_recordcount;
	int mainrecordcount;
	int counter=0;
	int countwithoutfilter;


	@Before
	public void setup(Scenario scn) throws InterruptedException
	{

		this.scn=scn;
		Driver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}



	@Then("user is on theresults page")
	public void user_is_on_theresults_page() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(srpo.RecordCountSearchResultPage));

		if(Driver().findElement(srpo.firstrecordcheckboxSearchResultsPage).isDisplayed())
		{

			//Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}

	}



	@When("user expands the Record type filter.")
	public void user_expands_the_record_type_filter() {

		srpo.expandFilterOnResultsPage(srpo.recordTypeFilterSearchResultsPage);

	}

	@When("user selects value from Record Type filter.")
	public void user_selects_value_from_record_type_filter() {

		srpo.click_on_element(srpo.recordTypeFilterfirstcheckbox);
		filter_recordcount=srpo.getselectedFilterRecordCount(srpo.recordTypeFilterfirstvalue);
	}


	@When("user clicks on apply filter button.")
	public void user_clicks_on_apply_filter_button() {

		srpo.click_on_element(srpo.applyfilterbuttonSearchResultsPage);



	}
	@Then("user verifies the appeared results.")
	public void user_verifies_the_appeared_results() throws InterruptedException {
		Thread.sleep(500);
		mainrecordcount=srpo.getRecordCount();

		if(counter!=1)
		{

			if(filter_recordcount!=mainrecordcount)
			{
				Assert.fail();
			}
		}
		else if(counter==1)
		{

			System.out.print("++++++++++++r+++++++++++++++++++++++++++Total records=+"+countwithoutfilter);   

			System.out.print("+++++++++++++++++++++++++++++++++++++++filter count=+"+filter_recordcount);

			System.out.print("+++++++++++++++++a+++++++fter applting is not filter=+"+mainrecordcount);


			if(countwithoutfilter-filter_recordcount!=mainrecordcount)
			{
				counter=0;
				Assert.fail();
			}
			counter=0;

		}
	}
	@When("user expands the Assigne type filter.")
	public void user_expands_the_assigne_type_filter() {

		srpo.expandFilterOnResultsPage(srpo.assigneeFilterSearchResultsPage);


	}

	@When("user selects value from Assigne Type filter.")
	public void user_selects_value_from_Asn_type_filter() {

		srpo.click_on_element(srpo.assigneeFilterfirstcheckbox);
		filter_recordcount=srpo.getselectedFilterRecordCount(srpo.assigneeFilterfirstvalue);
	}

	@When("user expands the Attorny type filter.")
	public void user_expands_the_Attorny_type_filter() {

		srpo.expandFilterOnResultsPage(srpo.attornyFilterSearchResultsPage);


	}

	@When("user selects value from Attorny Type filter.")
	public void user_selects_value_from_Attorny_type_filter() {

		srpo.click_on_element(srpo.attornyfirstcheckbox);
		filter_recordcount=srpo.getselectedFilterRecordCount(srpo.attornyfirstvalue);
	}


	@When("user expands the Inventor type filter.")
	public void user_expands_the_inventor_type_filter() {

		srpo.expandFilterOnResultsPage(srpo.inventorFilterSearchResultsPage);


	}


	@When("user selects value from Inventor Type filter.")
	public void user_selects_value_from_inventor_type_filter() {

		srpo.click_on_element(srpo.inventorFilterfirstcheckbox);
		filter_recordcount=srpo.getselectedFilterRecordCount(srpo.inventorFilterfirstvalue);

	}


	@When("user expands the IPC type filter.")
	public void user_expands_the_ipc_type_filter() {

		srpo.expandFilterOnResultsPage(srpo.IPCFilterSearchResultsPage);


	}



	@When("user selects value from IPC Type filter.")
	public void user_selects_value_from_ipc_type_filter() {

		srpo.click_on_element(srpo.IPCFilterfirstcheckbox);
		filter_recordcount=srpo.getselectedFilterRecordCount(srpo.IPCFilterfirstvalue);

	}

	@When("user expands the Publication_Country type filter.")
	public void user_expands_the_publication_country_type_filter() {

		srpo.expandFilterOnResultsPage(srpo.pubcountryFilterSearchResultsPage);

	}


	@When("user selects value from Publication_Country Type filter.")
	public void user_selects_value_from_publication_country_type_filter() {

		srpo.click_on_element(srpo.pubcountryfirstcheckbox);
		filter_recordcount=srpo.getselectedFilterRecordCount(srpo.pubcountryfirstvalue);


	}

	@When("user expands the Industry type filter.")
	public void user_expands_the_industry_type_filter() {

		srpo.expandFilterOnResultsPage(srpo.industryFilterSearchResultsPage);



	}


	@When("user selects value from Industry Type filter.")
	public void user_selects_value_from_industry_type_filter() {

		srpo.click_on_element(srpo.industryfirstcheckbox);
		filter_recordcount=srpo.getselectedFilterRecordCount(srpo.industryrfirstvalue);

	}

	@When("user expands the Legal_Status_Current type filter.")
	public void user_expands_the_legal_status_current_type_filter() {

		srpo.expandFilterOnResultsPage(srpo.leagalstatusFilterSearchResultsPage);


	}



	@When("user selects value from Legal_Status_Current Type filter.")
	public void user_selects_value_from_legal_status_current_type_filter() {

		srpo.click_on_element(srpo.leagalstatusrfirstcheckbox);
		filter_recordcount=srpo.getselectedFilterRecordCount(srpo.leagalstatusrfirstvalue);

	}

	@When("user expands the Current_Owner type filter.")
	public void user_expands_the_current_owner_type_filter() {

		srpo.expandFilterOnResultsPage(srpo.currentownerFilterSearchResultsPage);


	}


	@When("user selects value from Current_Owner Type filter.")
	public void user_selects_value_from_current_owner_type_filter() {
		srpo.click_on_element(srpo.currentownerfilterfirstcheckbox);
		filter_recordcount=srpo.getselectedFilterRecordCount(srpo.currentownerfilterfirstvalue);


	}
	@When("user expands the CPC type filter.")
	public void user_expands_the_cpc_type_filter() {
		srpo.expandFilterOnResultsPage(srpo.CPCFilterSearchResultsPage);


	}




	@When("user selects value from CPC Type filter.")
	public void user_selects_value_from_cpc_type_filter() {

		srpo.click_on_element(srpo.CPCFilterfirstcheckbox);
		filter_recordcount=srpo.getselectedFilterRecordCount(srpo.CPCFilterfirstvalue);


	}

	@When("user expands the Priority_Country type filter.")
	public void user_expands_the_priority_country_type_filter() {

		srpo.expandFilterOnResultsPage(srpo.prioritycountryFilterSearchResultsPage);


	}


	@When("user selects value from Priority_Country Type filter.")
	public void user_selects_value_from_priority_country_type_filter() {

		srpo.click_on_element(srpo.prioritycountyrfirstcheckbox);
		filter_recordcount=srpo.getselectedFilterRecordCount(srpo.prioritycountyrfirstvalue);



	}


	@When("user expands the techdomain type filter.")
	public void user_expands_the_techdomain_type_filter() {

		srpo.expandFilterOnResultsPage(srpo.techDomainFilterSearchResultsPage);


	}

	@When("user selects value from techdomain Type filter.")
	public void user_selects_value_from_techdomain_type_filter() {

		srpo.click_on_element(srpo.techDomainfirstcheckbox);
		filter_recordcount=srpo.getselectedFilterRecordCount(srpo.techDomainfirstvalue);


	}

	@When("user selects ISNOT in filter.")
	public void user_selects_isnot_in_filter() throws InterruptedException {
		srpo.selectISNOT();
		counter=1;
		countwithoutfilter=srpo.getRecordCount();
	}

	@When("user changes the view to compact view")
	public void user_changes_the_view_to_compact_view() {
		
		srpo.changeview(srpo.compactviewSearchResultsPage);

	}


	@Then("user verifies that the compact view is loaded properly.")
	public void user_verifies_that_the_compact_view_is_loaded_properly() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(srpo.abstractSearchResultsPage));
		if(!Driver().findElement(srpo.abstractSearchResultsPage).isDisplayed())
		{
			Assert.fail("Abstract not loaded in the compact view");
		}
	}

	@When("user changes the view to tabular view")
	public void user_changes_the_view_to_tabular_view() {
		
		srpo.changeview(srpo.tabularviewSearchResultsPage);
		
	}


	@Then("user verifies that the tabular view is loaded properly.")
	public void user_verifies_that_the_tabular_view_is_loaded_properly() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(srpo.titleSearchResultsPage));
		if(!Driver().findElement(srpo.titleSearchResultsPage).isDisplayed())
		{
			Assert.fail("Abstract not loaded in the title view");
		}

	}

	@When("user changes the record count on search results page")
	public void user_changes_the_record_count_on_search_results_page() {

	}


	@Then("user verifies the number of records displayed on page.")
	public void user_verifies_the_number_of_records_displayed_on_page() {

	}






































}
