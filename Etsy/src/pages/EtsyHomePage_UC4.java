package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Browsing through categories


public class EtsyHomePage_UC4 extends BasicPage {

	public EtsyHomePage_UC4(WebDriver driver) {
		super(driver);

	}

	public void openPage() {
		driver.get("https://etsy.com");
		System.out.println("Page title:" + driver.getTitle());
	}

	public void enterSearchTerm(String searchString) {

		WebElement searchElement = driver.findElement(By.id("global-enhancements-search-query"));
		searchElement.sendKeys(searchString);
	}

	public void clickOnSuggested() {

		WebElement dropdownList = driver.findElement(By.xpath("//*[@id=\"search-suggestions\"]/ul"));
		List<WebElement> productList = dropdownList.findElements(By.tagName("li"));
		System.out.println("Suggested search items in the dropdown:  " + productList.size());
		productList.get(0).click();

	}

	public void sortByPrice() {
		WebElement sortByButton = driver.findElement(By.xpath("//*[@id=\"sortby\"]"));
		sortByButton.click();
		driver.findElement(By.linkText("Lowest Price")).click();
	}
	
	public List<WebElement> getAllItemPrices() {
		return driver.findElements(By.className("currency-value"));
	}

}
