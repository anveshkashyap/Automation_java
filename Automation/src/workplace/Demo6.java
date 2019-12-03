package workplace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo6 {
	static {
	System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		try
		{
		Thread.sleep(20000);
		}
		catch (InterruptedException e)
		{
		e.printStackTrace();
		}
		driver.findElement(By.id("logoutLink")).click();
		driver.close();

	}

}
