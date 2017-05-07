package Framework;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverImp {
	
	public static WebDriver mdriver;
	
	public void webdriverImp()
	{
		
	}
	public void waitTillElementAppears(By E,int waittime)
	{
		WebDriverWait wait = new WebDriverWait(this.mdriver, waittime);
		wait.until(ExpectedConditions.presenceOfElementLocated(E));
		
	}
	
	public void FluentWait(By E, int waittime)
	{
		WebDriverWait wait = new WebDriverWait(this.mdriver, waittime);
		
	}

	@BeforeClass
	public void ApplicationSetup()
	{
		System.setProperty("webdriver.chrome.driver", "//Users//abhishekr//Documents//Selenium_workspace//Third Party Installations//chromedriver");
		mdriver = new ChromeDriver();
		mdriver.get("https://login.salesforce.com/");
		mdriver.manage().window().maximize();
		mdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
