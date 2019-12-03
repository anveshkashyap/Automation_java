package workplace;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {
	static {
		System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("http://www.gmail.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
	}

}
