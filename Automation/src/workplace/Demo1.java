package workplace;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	static {
		System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Open the browser
		FirefoxDriver f=new FirefoxDriver();
		f.get("http://www.google.co.in");
		Thread.sleep(2000);
		//Resize the browser
		Dimension d=new Dimension(200, 200);
		f.manage().window().setSize(d);
		Thread.sleep(2000);
		//Move the browser
		Point p=new Point(300, 200);
		f.manage().window().setPosition(p);
		Thread.sleep(2000);
		//Maximize the browser
		f.manage().window().maximize();
		Thread.sleep(2000);
		f.close();
	}

}
