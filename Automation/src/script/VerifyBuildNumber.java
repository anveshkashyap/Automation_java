package script;

import org.testng.annotations.Test;

import pom.LoginPage;
import pom.TimeTrackPage;

public class VerifyBuildNumber extends BaseTest {
	@Test
	public void testVerifyBuildNumber() throws InterruptedException {
		
		//Enter valid Username
		LoginPage l=new LoginPage(driver);
		l.setName("admin");
		
		//Enter valid password
		l.setPassword("manager");
		
		//Click on Login button
		l.clickLogin();
		
		//Click on Help
		TimeTrackPage t = new TimeTrackPage(driver);
		t.clickHelp();
		
		//Click on About ActiTIME
		t.clickAboutActi();
		
		//Verify Build number
		t.verifyBuild("(build 38258)");
		
		//Click on Close
		t.clickClose();
		
		//Click on Logout button
		Thread.sleep(5000);
		t.clickLogout();
	}

}
