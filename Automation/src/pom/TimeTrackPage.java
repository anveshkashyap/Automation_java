package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.openqa.selenium.WebDriverException;

public class TimeTrackPage {
@FindBy(xpath="//div[@class=\"menuTable\"]/div[3]")
private WebElement helpButton;
@FindBy(xpath="//a[contains(text(), 'About')][contains(text(),'your')]")
private WebElement aboutActiTime;
@FindBy(xpath="//span[@class=\"productVersion\"]/../span[2]")
private WebElement buildNo;
@FindBy(xpath="//img[@id=\"aboutPopupCloseButtonId\"]")
private WebElement closeButton;
@FindBy(id="logoutLink")
private WebElement logoutButton;

public TimeTrackPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void clickHelp() {
	try {
	helpButton.click();
	}catch(WebDriverException e) {
		helpButton.click();
	}
}
public void clickAboutActi() {
	aboutActiTime.click();
}
public void verifyBuild(String aBuildNo) {
	String eBuildNo = buildNo.getText();
	Reporter.log("Build Number is " + eBuildNo, true);
	Assert.assertEquals(aBuildNo,eBuildNo);
}
public void clickClose() {
	closeButton.click();
}
public void clickLogout() {
	logoutButton.sendKeys(Keys.ENTER);
}
}