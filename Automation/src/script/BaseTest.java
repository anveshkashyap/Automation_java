package script;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.xml.XmlTest;

public class BaseTest {

	public WebDriver driver;
	@BeforeMethod
	public void preCondition(XmlTest x) throws Exception
	{
		String browser=x.getParameter("browser");
		Reporter.log("Browser is:"+browser,true);
		if(browser.equals("GC"))
		{
		System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
		driver=new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver","./exefiles/geckodriver.exe");
		driver=new FirefoxDriver();
		Dimension d= new Dimension(400,400);
		driver.manage().window().setSize(d);
		}
	driver.manage().window().maximize();
	driver.get("http://localhost");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void postCondition()
	{
	driver.close();
	}
}