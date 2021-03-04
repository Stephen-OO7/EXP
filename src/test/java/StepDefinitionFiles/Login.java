package StepDefinitionFiles;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.WebdriverFactory;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

public class Login extends WebdriverFactory{
	
	TestContext t1;
	
	
	Scenario scn;
	
	WebDriverWait wait;
	Actions act;
	JavascriptExecutor js;
	List<WebElement> l;
	

	 public Login(TestContext test)
     {
    	
    	 this.t1=test;
    	 wait=t1.wait;
    	 act=t1.act;
    	 js =t1.js;
    	 driver=t1.driver;
    	 t1.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    	 
     }
	
	@Given("user logs in.")
	public  void loginn() throws Exception
	{
		
		t1.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		try{
	    String url=System.getProperty("url");
	    
	    if(url==null)
	    {
	    	url="https://test1-explr.patseer.com";
	    }
	    
		t1.driver.get(url);
		}catch(Exception e)
		{}
		
		t1.driver.manage().window().maximize();
		do {
		t1.driver.findElement(By.xpath("//input[@id='userName']")).clear();
		t1.driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("stephen");
		t1.driver.findElement(By.xpath("//button[@id='login-button']")).click();
		Thread.sleep(1500);
		}while(!t1.driver.getCurrentUrl().contains("test1-explr.patseer.com/search"));


	}

}
