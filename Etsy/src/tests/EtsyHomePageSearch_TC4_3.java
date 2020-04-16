package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.EtsyHomePage_UC4;
import pages.EtsyLoginPage_UC3;

public class EtsyHomePageSearch_TC4_3 extends BasicTest {

	private String baseUrl = "https://www.etsy.com/";

	@BeforeTest
	public void basicLogin() throws InterruptedException {

		driver.get(baseUrl);
		Thread.sleep(2000);

		EtsyLoginPage_UC3 elg = new EtsyLoginPage_UC3(driver);
		elg.signIn("jexie84@gmail.com", "Qapraksa");
		Thread.sleep(2000);

	}
    //Selecting suggested search terms

	@Test(priority = 0)
	public void ishomePageSearchPossible() throws InterruptedException {

		driver.get(baseUrl);
		Thread.sleep(2000);

		EtsyHomePage_UC4 ehp = new EtsyHomePage_UC4(driver);
		ehp.openPage();
		Thread.sleep(2000);
		ehp.enterSearchTerm("keychain");
		Thread.sleep(2000);
		ehp.clickOnSuggested();
		Thread.sleep(2000);
		ehp.sortByPrice();
		Thread.sleep(2000);
		ehp.getAllItemPrices();
	}
}
