package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Base;

public class CommonObjects extends Base{
	
	WebDriver driver;
	Actions act=new Actions(Driver());
	WebDriverWait wait=new WebDriverWait(Driver(),60);
	JavascriptExecutor js = (JavascriptExecutor) Driver();
	
	public final By homePageIcon=By.xpath("//img[@alt='PatSeer']");
	
	public CommonObjects(WebDriver driver1)
	{
		this.driver=driver1;
	}
	
	public void sendKeysElement(By Textbox,String data)
	{	
		wait.until(ExpectedConditions.visibilityOfElementLocated(Textbox));
		wait.until(ExpectedConditions.elementToBeClickable(Textbox));
		
		driver.findElement(Textbox).click();
		driver.findElement(Textbox).sendKeys(data);
	}
	public void clickOnElement(By Element)
	{	
		wait.until(ExpectedConditions.visibilityOfElementLocated(Element));
		wait.until(ExpectedConditions.elementToBeClickable(Element));
		js.executeScript("arguments[0].click()", Driver().findElement(Element));
		
	}

}
