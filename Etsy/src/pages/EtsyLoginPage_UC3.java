package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// User should be able to sign in into platform;

public class EtsyLoginPage_UC3 extends BasicPage {

	private By homePagesignIn = By.xpath("//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[1]/button");
	private By email = By.name("name");
	private By password = By.id("join_neu_password_field");
	private By staySignedIn = By.xpath("//*[@id=\"join-neu-form\"]/div[1]/div/div[4]/div[1]/label/span");
	private By signInbtn = By.cssSelector("[type='submit'][name='submit_attempt']");
	private By forgottenpass = By.cssSelector("[href='/forgot_password?email=']");
	private By emailResetPass = By.name("email");
	private By submitResetPass = By.id("submit-button");

	public EtsyLoginPage_UC3(WebDriver driver) {
		super(driver);

	}

	public void setEmail(String email) {
		this.driver.findElement(this.email).sendKeys(email);
	}

	public void setPassword(String password) {
		this.driver.findElement(this.password).sendKeys(password);
	}

	public void clickOnSignInBtn() {
		this.driver.findElement(this.signInbtn).click();
	}

	public void clickOnHomePagesignIn() {
		this.driver.findElement(this.homePagesignIn).click();
	}

	public void clickOnForgottenPass() {
		this.driver.findElement(this.forgottenpass).click();
	}

	public void setEmailResetPass(String email) {
		this.driver.findElement(this.emailResetPass).sendKeys(email);
	}

	public void signIn(String email, String password) {
		this.setEmail(email);
		this.setPassword(password);
		this.clickOnSignInBtn();
	}

	public void clickOnStaySignedIn() {
		this.driver.findElement(this.staySignedIn).click();
	}

	public void clickOnsubmitResetPass() {
		this.driver.findElement(this.submitResetPass).click();
	}

}
