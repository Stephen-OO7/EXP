package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPageObjects {
	
	WebDriver driver;
	
	public final By RecordCountSearchResultPage=By.xpath("//span[@class='pgNav font-weight-bold ng-binding']");
	public final By smartSearchSearchResultsPage=By.xpath("//input[@id='txtSmartSearchResultQueryAuto-tokenfield']");
	
	
	public SearchResultsPageObjects(WebDriver driver1)
	{
		this.driver=driver1;
	}

}
