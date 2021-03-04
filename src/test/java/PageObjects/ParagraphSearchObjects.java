package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.WebdriverFactory;

public class ParagraphSearchObjects extends WebdriverFactory{
	
WebDriver driver;
	
	Actions act=new Actions(Driver());
	WebDriverWait wait=new WebDriverWait(Driver(),60);
	
	
	public final By paragraphsearchForm=By.xpath("//ul//a[contains(text(),'Paragraph Search')]");
	
	public ParagraphSearchObjects(WebDriver wd)
	{
		this.driver=wd;
	}
	
	public final By paragraphsearchTextbox=By.xpath("//textarea[@id='txtSemanticInput']");
	public final By paragraphsearchSearchbutton=By.xpath("//button[@id='divAddButton']");
	public final By paragraphsearchSubmitbutton=By.xpath("//button[contains(text(),'Submit')]");
	public final By paragraphsearchHighlightedeywords=By.xpath("//div[@class='modal-body']/div/a//span[@class='sem-cross crossclick']");
	public final By paragraphsearchBackbutton=By.xpath("//button[contains(text(),'back')]");
	
	public List<WebElement> getHighlightedKeywords()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(paragraphsearchHighlightedeywords));
		List l=Driver().findElements(paragraphsearchHighlightedeywords);
		return l;
		
	}

}
