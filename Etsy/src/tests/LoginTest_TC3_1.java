package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.EtsyLoginPage_UC3;
import pages.TitlePage;

public class LoginTest_TC3_1 extends BasicTest {

	private String baseUrl = "https://www.etsy.com/";
	
	//Log in to Etsy website valid email address and password

	@Test
	public void basicLogin() throws InterruptedException {

		driver.get(baseUrl);
		Thread.sleep(2000);
		
		Assert.assertTrue(baseUrl.contains("etsy.com"));
		
		EtsyLoginPage_UC3 elg = new EtsyLoginPage_UC3(driver);
		elg.clickOnHomePagesignIn();
		Thread.sleep(2000);
		elg.signIn("jexie84@gmail.com", "Qapraksa");
		Thread.sleep(2000);
		
		TitlePage tp = new TitlePage(driver);
		
		Assert.assertTrue(tp.getPageTitle().contains("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone"));
	
		
	}
	
	
	
}
