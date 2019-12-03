package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	@FindBy(id="username")
	private WebElement unTextBox;
	@FindBy(name="pwd")
	private WebElement pwTextBox;
	@FindBy(id="loginButton")
	private WebElement login;
	@FindBy(xpath="//span[contains(text(),'is invalid')]")
	private WebElement errMsg;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setName(String un) {
		unTextBox.sendKeys(un);
	}
	public void setPassword(String pw) {
		pwTextBox.sendKeys(pw);
	}
	public void clickLogin() {
		login.click();
	}
	public void verify() {
		Assert.assertTrue(errMsg.isDisplayed());
	}
	
}
