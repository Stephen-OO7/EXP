package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {


	public static WebDriver driver=null;
	
	

	public static WebDriver Driver()
	{
		
		DesiredCapabilities dc =DesiredCapabilities.chrome();

		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		ChromeOptions co=new ChromeOptions();
		co.merge(dc);
		System.setProperty("webdriver.chrome.driver","E:\\Automation_softwares _and_jar_files\\chromedriver_win32 (1)\\chromedriver.exe");

		if(driver == null)
		{

			driver = new ChromeDriver(co);
			

		}
		return driver;
	}
	

	public static void login() throws InterruptedException
	{
		Driver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Driver().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		try{
	    String url=System.getProperty("url");
	    
	    if(url==null)
	    {
	    	url="https://test1-explr.patseer.com";
	    }
		Driver().get(url);
		}catch(Exception e)
		{}
		
		Driver().manage().window().maximize();
		do {
		Driver().findElement(By.xpath("//input[@id='userName']")).clear();
		Driver().findElement(By.xpath("//input[@id='userName']")).sendKeys("stephen");
		Driver().findElement(By.xpath("//button[@id='login-button']")).click();
		Thread.sleep(1500);
		}while(!Driver().getCurrentUrl().contains("test1-explr.patseer.com/search"));


	}

	public static void main(String args[]) throws InterruptedException
	{
		Base b=new Base();
		b.login();
	}


}
