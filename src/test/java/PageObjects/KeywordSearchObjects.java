package PageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeywordSearchObjects {

	//Webdriver declaration
	
	WebDriver driver;
	
	//Data Members Declaration
	public final By KeywordSearchForm=By.xpath("//li/a[contains(text(),'Keyword Search')]");
	
	public final By KeywordSearchTextbox=By.xpath("//input[@id='txtSmartSearchQueryAuto-tokenfield']");
	public final By KeywordSearchSearchButton=By.xpath("//button[@id='divAddButton']");
	public final By AutosuggestionsInKeywordSearch=By.xpath("//ul[@id='ui-id-1']/li");
	public final By homePageIcon=By.xpath("//img[@alt='PatSeer']");
	public final By closeKeyword=By.xpath("//a[@class='close close1 ']");
	
	
	
	
	//WebDriver Initialization
	public KeywordSearchObjects(WebDriver driver1)
	{
		this.driver=driver1;
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	
	// Methods
	public void enterKeywordInKeywordSearch(String keyword)
	{
		driver.findElement(KeywordSearchTextbox).sendKeys(keyword);
		driver.findElement(KeywordSearchTextbox).sendKeys(Keys.SPACE);
			
	}
	public void clickOnSearchButtonInKeywordSearch()
	{
		driver.findElement(KeywordSearchSearchButton).click();
			
	}
	public List<WebElement> getAutosuggestionsInKeywordSearch(String keyword) throws InterruptedException
	{
		enterKeywordInKeywordSearch(keyword);
		Thread.sleep(1500);
		List<WebElement> list=driver.findElements(AutosuggestionsInKeywordSearch);
		return list;
	}
	
	public void clearKeywordSearchTexBox()
	{
		driver.findElement(homePageIcon).click();
		driver.findElement(KeywordSearchForm).click();
		driver.navigate().refresh();
		
	}
	
	
	
	
	
}
