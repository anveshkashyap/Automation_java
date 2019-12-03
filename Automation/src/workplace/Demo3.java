package workplace;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {
	static {
		System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.yahoo.com");
		String title=driver.getTitle();
		if(title.equals("Google"))
		{
		System.out.println("Pass:Title is Google");
		}
		else
		{
		System.out.println("Fail:Title is not Google: actual title is "+title);
		}
		String url=driver.getCurrentUrl();
		driver.close();
		if(url.contains("google.co.in"))
		{
		System.out.println("Pass: url has co.in");
		}
		else
		{
		System.out.println("Fail:url dont have co.in "+url);
		}
	}
}
