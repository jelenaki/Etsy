package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EtsyBrowsing_UC4 extends BasicPage {

	
	//Browsing top categories

	private By topCat = By.id("catnav-primary-link-891");
	private By beddCat = By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[4]/li[2]/div/div/a/div[2]/h3");
	private By bedPillows = By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[3]/div/div/a/div[2]/h3");
	private By priceRadioBtn = By.className("wt-radio wt-radio--small wt-mb-xs-1");
	
	public EtsyBrowsing_UC4(WebDriver driver) {
		super(driver);
		
	}
	
	public WebElement getTopcat() {
		return this.driver.findElement(topCat);
	}
	
	public void clickOnTopCat() {
		this.getTopcat().click();
	}
	
	public WebElement getBeddCat() {
		return this.driver.findElement(beddCat);
	}
	
	public void clickOnBeddCat() {
		this.getBeddCat().click();
	}
	
	public WebElement getBedPillows() {
		return this.driver.findElement(bedPillows);
	}
	
	public void clickOnBedPillows() {
		this.getBedPillows().click();
	}
	
	public void clickOnPriceRadioBtn() {
		this.driver.findElement(priceRadioBtn).click();
	}
	
	

}
