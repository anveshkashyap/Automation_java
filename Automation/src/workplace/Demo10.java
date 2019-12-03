package workplace;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo10 { 
	static {
		System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		WebElement textbox=driver.findElement(By.id("lst-ib"));
		textbox.sendKeys("selenium");
		String xp="//ul[@class=\"sbsb_b\"]";
		List<WebElement> allAut = driver.findElements(By.xpath(xp));
		int count=allAut.size();
		System.out.println("No of autosuggesions:"+count);
		System.out.println("List of Autosuggestions..");
		
		for(int i=0;i<count;i++)
		{
		WebElement aut = allAut.get(i);
		String text=aut.getText();
		System.out.println(text);
		}
		textbox.sendKeys(Keys.ARROW_DOWN);
		textbox.sendKeys(Keys.ARROW_DOWN);
		textbox.sendKeys(Keys.ARROW_DOWN);
		textbox.sendKeys(Keys.ENTER);
	}
}
