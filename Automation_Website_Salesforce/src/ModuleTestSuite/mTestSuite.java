package ModuleTestSuite;

import Framework.WebdriverImp;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

import com.google.common.base.Verify;

import PageFactory.PageClass;

public class mTestSuite {
	
	public static PageClass pg;
	
	@Before
	public void setup()
	{
		new WebdriverImp().ApplicationSetup();
		pg = new PageClass(WebdriverImp.mdriver);
	}
	
	@Test
	public void test1()
	{
		pg.Username().click();
		pg.Username().sendKeys("rastogi");
		pg.Password().sendKeys("******");
		pg.SubmitBtn().click();
		Assert.assertTrue("" , true);
		Verify.verify(true, "", "");
		
		
	}
	

	
	@After
	public void TearDown()
	{
		
	}
	

}
