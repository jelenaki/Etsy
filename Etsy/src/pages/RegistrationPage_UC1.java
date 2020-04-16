package pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//User should be able to register into platform

public class RegistrationPage_UC1 extends BasicPage {

	private By registerBtn = By.xpath("//*[@id=\"join-neu-form\"]/div[1]/div/div[1]/div/button");
	private By regEmail = By.id("join_neu_email_field");
	private By firstName = By.id("join_neu_first_name_field");
	private By regPass = By.id("join_neu_password_field");
	private By sendReg = By.cssSelector("button.btn-large.btn.width-full.btn-primary");
	int myInt = 1234567890;

	public RegistrationPage_UC1(WebDriver driver) {
		super(driver);
	}

	public void clickOnRegisterBtn() {
		this.driver.findElement(this.registerBtn).click();
	}

	public void setEmail(String email) {
		this.driver.findElement(this.regEmail).sendKeys(email);
	}

	public void setFirstName(String firstName) {
		this.driver.findElement(this.firstName).sendKeys(firstName);
	}

	public void setPassword(String Password) {
		this.driver.findElement(this.regPass).sendKeys(Password);
	}

	public void clickOnSendReg() {
		this.driver.findElement(this.sendReg).click();
	}
	
	public String GenerateRandomNumber(int charLength) {
        return String.valueOf(charLength < 1 ? 0 : new Random()
                .nextInt((9 * (int) Math.pow(10, charLength - 1)) - 1)
                + (int) Math.pow(10, charLength - 1));
    }

}
