package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.EtsyLoginPage_UC3;
import pages.TitlePage;

public class LoginTest_TC3_2 extends BasicTest {

	private String baseUrl = "https://www.etsy.com/";

	// Reseting password

	@Test
	public void forgottenPassword() throws InterruptedException {

		driver.get(baseUrl);
		Thread.sleep(2000);

		EtsyLoginPage_UC3 elg = new EtsyLoginPage_UC3(driver);
		elg.clickOnHomePagesignIn();
		Thread.sleep(2000);
		elg.clickOnForgottenPass();
		Thread.sleep(1000);
		elg.setEmailResetPass("jexie84@gmail.com");
		Thread.sleep(1000);
		elg.clickOnsubmitResetPass();

		TitlePage tp = new TitlePage(driver);

		Assert.assertTrue(tp.getPageTitle().contains("Etsy - Reset your password"));

	}

}
