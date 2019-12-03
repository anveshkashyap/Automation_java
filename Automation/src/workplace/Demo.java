package workplace;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	
	static {
		System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./exefiles/cIEDriverServer.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver f =new ChromeDriver();
	}

}
