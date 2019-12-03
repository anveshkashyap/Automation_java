package workplace;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		sc =new Scanner(System.in);
		System.out.println("Enter browser?GC/FF/IE");
		String browser=sc.next();
		WebDriver driver;
		if(browser.equals("GC"))
		{
		System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browser.equals("IE"))
		{
		System.setProperty("webdriver.ie.driver","./exefiles/IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		}
		else
		{
		System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
		driver=new FirefoxDriver();
		}
		driver.get("http://google.com");
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
