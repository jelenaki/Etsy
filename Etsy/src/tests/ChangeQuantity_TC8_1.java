package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChangeQuantity_TC8_1 extends BasicTest {

	private String baseUrl = "https://www.etsy.com/";

	@BeforeTest
	public void addToCart() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);
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

	// change quantity in the shoping cart
	@Test
	public void isChangingQuantityPossible() throws InterruptedException {
		WebElement selectElement = driver.findElement(By.name("listing-quantity"));
		Select select = new Select(selectElement);
		List<WebElement> allOptions = select.getOptions();

		boolean quantityFound = false;
		for (int i = 0; i < allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText());
			if (allOptions.get(i).getText().contains("5")) {
				quantityFound = true;
			}
		}

		if (quantityFound) {
			select.selectByVisibleText("5");
		} else {
			select.selectByVisibleText("2");
		}

		WebElement giftCheckBox = driver.findElement(By.id("gift-checkbox-designerfurnitureart-input"));
		giftCheckBox.click();
	}

}
