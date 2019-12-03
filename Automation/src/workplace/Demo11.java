package workplace;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo11 {
	static {
		System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.zoho.com/crm/lp/login.html");
		driver.findElement(By.id("lid")).sendKeys("admin1");
		driver.findElement(By.id("pwd")).sendKeys("1234");
		driver.findElement(By.id("signin_submit")).click();
		
		WebElement errMsg=driver.findElement(By.id("msgpanel"));
		if(errMsg.isDisplayed());
		{
		System.out.println(errMsg.getText());
		}
	}

}
