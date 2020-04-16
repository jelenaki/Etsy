package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.EtsyLoginPage_UC3;

//Add one item to the cart and verify


public class AddToCart_TC7_1 extends BasicTest {
	
	
	private String baseUrl = "https://www.etsy.com/";
	


	//Add one item to the cart and verify TC 7.1
	
	@BeforeTest
	public void basicLogin() throws InterruptedException {

		driver.get(baseUrl);
		Thread.sleep(2000);

		EtsyLoginPage_UC3 elg = new EtsyLoginPage_UC3(driver);
		elg.signIn("jexie84@gmail.com", "Qapraksa");
		Thread.sleep(2000);

	}

	
	@Test
	public void addToCart() throws InterruptedException {
		WebElement search = driver.findElement(By.id("global-enhancements-search-query"));
		search.sendKeys("bed pillow");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		List<WebElement> result = driver
				.findElements(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div/div[2]/div[2]/div[2]/div/ul"));

		WebElement card = result.get(1);
		card.click();
		Thread.sleep(2000);

		WebElement addToCartBTn = driver.findElement(By.className("wt-btn wt-btn--filled wt-width-full"));
		addToCartBTn.click();

		List<WebElement> links = driver.findElements(By.id("page-title"));

		boolean found = false;
		for (int i = 0; i < links.size(); i++) {
			if (links.get(i).getText().contains("1 item in your cart")) {
				found = true;
			}
		}

		Assert.assertTrue(found);
		
	}
	
}


