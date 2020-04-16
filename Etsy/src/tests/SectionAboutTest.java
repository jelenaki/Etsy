package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SectionAboutTest extends BasicTest{
	
	private String baseUrl = "https://www.etsy.com/";

	
	// verifying if about section exist on homepage
		@Test(priority = 0)
		public void aboutExists() throws InterruptedException {
			driver.get(baseUrl);
			Thread.sleep(2000);

			List<WebElement> links = driver.findElements(By.xpath("//*[@id=\"collage-footer\"]/footer/div[3]/nav"));

			boolean found = false;
			for (int i = 0; i < links.size(); i++) {
				if (links.get(i).getText().contains("About")) {
					found = true;
				}
			}

			Assert.assertTrue(found);

			driver.navigate().refresh();
		}
}


