package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonObjects {
	
	WebDriver driver;
	
	public final By homePageIcon=By.xpath("//img[@alt='PatSeer']");
	
	public CommonObjects(WebDriver driver1)
	{
		this.driver=driver1;
	}

}
