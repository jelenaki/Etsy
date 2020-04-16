package tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.EtsyHomePage_UC4;

public class EtsySearchProducts_TC5_1 extends BasicTest{
	
	//Searching for items displayed on website

	
	@Test
	public void printProductPrice() throws InterruptedException {
		EtsyHomePage_UC4 page = new EtsyHomePage_UC4(driver);
		page.openPage();
		
		page.enterSearchTerm("flower headband");
		Thread.sleep(1000);

		page.clickOnSuggested();
		Thread.sleep(1000);

		page.sortByPrice();
		
		List<WebElement> allItems = page.getAllItemPrices();
		System.out.println("Total number of items listed: " + allItems.size());
		
		Assert.assertTrue(allItems.size() > 10);

		
	}

}
