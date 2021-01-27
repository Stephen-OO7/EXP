package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import Utilities.Base;

public class SearchResultsPageObjects extends Base{

	WebDriver driver;
	Actions act=new Actions(Driver());
	JavascriptExecutor js = (JavascriptExecutor) Driver();
	WebDriverWait wait=new WebDriverWait(Driver(),60);
	public static String recordcount="";
	public static String mainrecordcount="";

	int count;
	int maincount;

	//filters
	public final By recordTypeFilterSearchResultsPage=By.xpath("//span[contains(text(),'Record Type')]");
	public final By recordTypeFilterfirstcheckbox=By.xpath("//div[@class='floatLeft width100 filterKeyValue_PTYP'][1]//div[@class='inputDiv floatLeft col-1 ']");
	public final By recordTypeFilterfirstvalue=By.xpath("//div[@class='floatLeft width100 filterKeyValue_PTYP'][1]//div[@class='inputDiv floatLeft col-1 ']/following-sibling::span");

	public final By currentownerFilterSearchResultsPage=By.xpath("//span[contains(text(),'Current Owner')]");
	public final By currentownerfilterfirstcheckbox=By.xpath("//div[@class='floatLeft width100 filterKeyValue_PASN'][2]//div[@class='inputDiv floatLeft col-1 ']/input");
	public final By currentownerfilterfirstvalue=By.xpath("//div[@class='floatLeft width100 filterKeyValue_PASN'][2]//div[@class='inputDiv floatLeft col-1 ']/following-sibling::span");

	public final By assigneeFilterSearchResultsPage=By.xpath("//span[contains(text(),'Assignee')]");
	public final By assigneeFilterfirstcheckbox=By.xpath("//div[@class='floatLeft width100 filterKeyValue_ASNN'][2]//div[@class='inputDiv floatLeft col-1 ']/input");
	public final By assigneeFilterfirstvalue=By.xpath("//div[@class='floatLeft width100 filterKeyValue_ASNN'][2]//div[@class='inputDiv floatLeft col-1 ']/following-sibling::span");

	public final By inventorFilterSearchResultsPage=By.xpath("//span[contains(text(),'Inventor')]");
	public final By inventorFilterfirstcheckbox=By.xpath("//div[@class='floatLeft width100 filterKeyValue_INV'][2]//div[@class='inputDiv floatLeft col-1 ']/input");
	public final By inventorFilterfirstvalue=By.xpath("//div[@class='floatLeft width100 filterKeyValue_INV'][2]//div[@class='inputDiv floatLeft col-1 ']/following-sibling::span");

	public final By applndateFilterSearchResultsPage=By.xpath("//span[contains(text(),'Application Date')]");
	public final By pubdateFilterSearchResultsPage=By.xpath("//span[contains(text(),'Publication Date')]");

	public final By IPCFilterSearchResultsPage=By.xpath("//span[contains(text(),'IPC')]");
	public final By IPCFilterfirstcheckbox=By.xpath("//div[@class='floatLeft width100 filterKeyValue_ICSC'][1]//div[@class='inputDiv floatLeft col-1 ']/input");
	public final By IPCFilterfirstvalue=By.xpath("//div[@class='floatLeft width100 filterKeyValue_ICSC'][1]//div[@class='inputDiv floatLeft col-1 ']/following-sibling::span");

	public final By CPCFilterSearchResultsPage=By.xpath("//span[contains(text(),'CPC')]");
	public final By CPCFilterfirstcheckbox=By.xpath("//div[@class='floatLeft width100 filterKeyValue_CPCG'][2]//div[@class='inputDiv floatLeft col-1 ']/input");
	public final By CPCFilterfirstvalue=By.xpath("//div[@class='floatLeft width100 filterKeyValue_CPCG'][2]//div[@class='inputDiv floatLeft col-1 ']/following-sibling::span");

	public final By attornyFilterSearchResultsPage=By.xpath("//span[contains(text(),'Attorney')]");
	public final By attornyfirstcheckbox=By.xpath("//div[@class='floatLeft width100 filterKeyValue_ATN'][2]//div[@class='inputDiv floatLeft col-1 ']/input");
	public final By attornyfirstvalue=By.xpath("//div[@class='floatLeft width100 filterKeyValue_ATN'][2]//div[@class='inputDiv floatLeft col-1 ']/following-sibling::span");

	public final By pubcountryFilterSearchResultsPage=By.xpath("//span[contains(text(),'Publication Country')]");
	public final By pubcountryfirstcheckbox=By.xpath("//div[@class='floatLeft width100 filterKeyValue_PBC'][1]//div[@class='inputDiv floatLeft col-1 ']/input");
	public final By pubcountryfirstvalue=By.xpath("//div[@class='floatLeft width100 filterKeyValue_PBC'][1]//div[@class='inputDiv floatLeft col-1 ']/following-sibling::span");

	public final By prioritycountryFilterSearchResultsPage=By.xpath("//span[contains(text(),'Priority Country')]");
	public final By prioritycountyrfirstcheckbox=By.xpath("//div[@class='floatLeft width100 filterKeyValue_PRC'][1]//div[@class='inputDiv floatLeft col-1 ']/input");
	public final By prioritycountyrfirstvalue=By.xpath("//div[@class='floatLeft width100 filterKeyValue_PRC'][1]//div[@class='inputDiv floatLeft col-1 ']/following-sibling::span");

	public final By leagalstatusFilterSearchResultsPage=By.xpath("//span[contains(text(),'Legal Status Current')]");
	public final By leagalstatusrfirstcheckbox=By.xpath("//div[@class='floatLeft width100 filterKeyValue_LSC'][1]//div[@class='inputDiv floatLeft col-1 ']/input");
	public final By leagalstatusrfirstvalue=By.xpath("//div[@class='floatLeft width100 filterKeyValue_LSC'][1]//div[@class='inputDiv floatLeft col-1 ']/following-sibling::span");

	public final By industryFilterSearchResultsPage=By.xpath("//span[contains(text(),'Industry')]");
	public final By industryfirstcheckbox=By.xpath("//div[@class='floatLeft width100 filterKeyValue_INDY'][1]//div[@class='inputDiv floatLeft col-1 ']/input");
	public final By industryrfirstvalue=By.xpath("//div[@class='floatLeft width100 filterKeyValue_INDY'][1]//div[@class='inputDiv floatLeft col-1 ']/following-sibling::span");

	public final By techDomainFilterSearchResultsPage=By.xpath("//span[contains(text(),'Tech Domain')]");
	public final By techDomainfirstcheckbox=By.xpath("//div[@class='floatLeft width100 filterKeyValue_DOM'][1]//div[@class='inputDiv floatLeft col-1 ']/input");
	public final By techDomainfirstvalue=By.xpath("//div[@class='floatLeft width100 filterKeyValue_DOM'][1]//div[@class='inputDiv floatLeft col-1 ']/following-sibling::span");

	public final By applyfilterbuttonSearchResultsPage=By.xpath("//button[contains(text(),'Apply Filter')]");
	public final By clearbuttonSearchResultsPage=By.xpath("//button[contains(text(),'Clear')]");

	public final By IsnotCurrentownerfilterselect=By.xpath("//div[@class='summaryHeader collapsed analyzebyLink  analyzeBy_PASN']/div/select");

	//results page
	public final By selectallcheckboxSearchResultsPage=By.xpath("//input[@id='SelectAllCheckbox']");
	public final By viewdropdownSearchResultsPage=By.xpath("//div[@class='dropdown pl-3  floatLeft']/button[@ng-model='currentView']");
	public final By tabularviewSearchResultsPage=By.xpath("//a[contains(text(),'Tabular')]");
	public final By compactviewSearchResultsPage=By.xpath("//a[contains(text(),'Compact')]");
	public final By countdropdownSearchResultsPage=By.xpath("//div[@class='dropdown pl-3 floatLeft']/button[@class='btn btn-default dropdown-toggle drpmenuphight pageMenudrp ng-binding']");
	public final By countnumberfromcountdropdowSearchResultsPage=By.xpath("//a[@class='li-a-item ng-binding' and contains(text(),'30')]");
	public final By sortingdropdownSearchResultsPage=By.xpath("//div[@class='dropdown pl-3 floatLeft']/button[@class='btn btn-default dropdown-toggle drpmenuphight pageMenudrp ng-pristine ng-untouched ng-valid ng-binding']");
	public final By abstractSearchResultsPage=By.xpath("//div[@id='lblAbstract']");
	public final By bookmarkresultstariconSearchResultsPage=By.xpath("//span[@id='divBmbtn']//i[@id='imgSharebtn']");
	public final By sharerecordsiconSearchResultsPage=By.xpath("//span[@id='divSharebtn']//i[@id='imgSharebtn']");
	public final By downloadrecordsiconSearchResultsPage=By.xpath("//button[contains(@class,'btn btn-sm mdi mdi-download')]");
	public final By patentstabSearchResultsPage=By.xpath("//div[@class='btn-group']/button[1]");
	public final By journalstabSearchResultsPage=By.xpath("//div[@class='btn-group']/button[2]");
	public final By RecordCountSearchResultPage=By.xpath("//div[@class='pl-2 pr-2 result-toolbar patseer-row clearfix']//span[@class='pgNav font-weight-bold ng-binding']");
	public final By smartSearchSearchResultsPage=By.xpath("//input[@id='txtSmartSearchResultQueryAuto-tokenfield']");
	public final By firstrecordcheckboxSearchResultsPage=By.xpath("//div[@class='card1 ng-scope']//div[@class='col-12 patseer-padding-lr-0 d-flex']/span/input");
	public final By smartsearchtextboxSearchResultsPage=By.xpath("//input[@id='txtSmartSearchResultQueryAuto-tokenfield']");
	public final By smartsearchsearchbuttonSearchResultsPage=By.xpath("//button[@id='divResultAddButton']");
	public final By titleSearchResultsPage=By.xpath("//label[@id='lblTtl']");
	


	

	public SearchResultsPageObjects(WebDriver driver1)
	{
		this.driver=driver1;
	}


	public void click_on_element(By element)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		Driver().findElement(element).click();


	}

	public void expandFilterOnResultsPage(By filtername)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(filtername));
		Driver().findElement(filtername).click();
	}

	public void changeview(By view)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstrecordcheckboxSearchResultsPage));
		js.executeScript("arguments[0].focus();",Driver().findElement(viewdropdownSearchResultsPage) );
		Driver().findElement(viewdropdownSearchResultsPage).sendKeys(Keys.ARROW_DOWN);
		
		Driver().findElement(view).click();
	}

	public void changenumberofRecordsOnPage(By count)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(countdropdownSearchResultsPage));
		act.moveToElement(Driver().findElement(countdropdownSearchResultsPage)).build().perform();
		Driver().findElement(countnumberfromcountdropdowSearchResultsPage).click();
	}

	public Integer getselectedFilterRecordCount(By selectedfilter)
	{

		recordcount=Driver().findElement(selectedfilter).getText().toString().replaceAll("\\)", "");
		String arr[]=recordcount.split("\\(");
		count=Integer.parseInt(arr[1]);
		return count;
	}

	public Integer getRecordCount() throws InterruptedException
	{
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstrecordcheckboxSearchResultsPage));	
		mainrecordcount=Driver().findElement(RecordCountSearchResultPage).getText().toString();
		String arr[]=mainrecordcount.split(" ");
		maincount=Integer.parseInt(arr[0]);
		return maincount;
	}

	public void selectISNOT()
	{

		Select sel=new Select(Driver().findElement(IsnotCurrentownerfilterselect));
		sel.selectByVisibleText("IS NOT");
	}




}
