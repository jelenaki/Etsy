package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.EtsyLoginPage_UC3;
import pages.RegistrationPage_UC1;
import pages.TitlePage;

public class RegistrationTest_TC1_1 extends BasicTest {
	
	private String baseUrl = "https://www.etsy.com/";
	
	//Registering on Etsy website using registration form

	@Test
	public void basicRegistration() throws InterruptedException {

		driver.get(baseUrl);
		Thread.sleep(2000);
		
		Assert.assertTrue(baseUrl.contains("etsy.com"));
		
		EtsyLoginPage_UC3 elg = new EtsyLoginPage_UC3(driver);
		elg.clickOnHomePagesignIn();
		Thread.sleep(2000);

		RegistrationPage_UC1 rp = new RegistrationPage_UC1(driver);
		rp.clickOnRegisterBtn();
		Thread.sleep(2000);
		rp.setEmail("jexie84@gmail.com");
		Thread.sleep(2000);
		rp.setFirstName("Jelena");
		Thread.sleep(2000);
		
		rp.setPassword(rp.GenerateRandomNumber(8));
		Thread.sleep(2000);
		rp.clickOnSendReg();
		
		TitlePage tp = new TitlePage(driver);
		
		Assert.assertTrue(tp.getPageTitle().contains("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone"));
	
		
	}
	
	
	
}


