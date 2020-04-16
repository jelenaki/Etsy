package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.EtsyBrowsing_UC4;
import pages.EtsyLoginPage_UC3;
import pages.TitlePage;

public class EtsyBrowsing_TC4_1 extends BasicTest {
	
	//Browsing top categories


	private String baseUrl = "https://www.etsy.com/";

	@BeforeTest
	public void basicLogin() throws InterruptedException {

		driver.get(baseUrl);
		Thread.sleep(2000);

		EtsyLoginPage_UC3 elg = new EtsyLoginPage_UC3(driver);
		elg.signIn("jexie84@gmail.com", "Qapraksa");
		Thread.sleep(2000);

	}

	@Test(priority = 0)
	public void isBrowsingPossible() throws InterruptedException {

		driver.get(baseUrl);
		Thread.sleep(2000);

		EtsyBrowsing_UC4 eb = new EtsyBrowsing_UC4(driver);
		eb.clickOnTopCat();
		Thread.sleep(2000);
		eb.clickOnBeddCat();
		Thread.sleep(2000);
		eb.clickOnBedPillows();
		Thread.sleep(2000);
		eb.clickOnPriceRadioBtn();

		TitlePage tp = new TitlePage(driver);

		Assert.assertTrue(tp.getPageTitle().contains("Bedding | Etsy"));

	}
}
