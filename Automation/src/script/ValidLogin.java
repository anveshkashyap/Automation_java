package script;

import org.testng.annotations.Test;

import generics.Excel;
import pom.LoginPage;
import pom.TimeTrackPage;

public class ValidLogin extends BaseTest{
	@Test
	public void testValidLogin() throws InterruptedException {
		
		String xlpath="./data/TDS.xlsx";
		//DOT->current path of Java Project
		String sheet="ValidLogin";
		String un=Excel.getCellData(xlpath, sheet, 0, 0);
		String pw=Excel.getCellData(xlpath, sheet, 0, 1);
		
		//Enter valid user name.
		LoginPage l= new LoginPage(driver);
		l.setName(un);
		
		//Enter valid password.
		l.setPassword(pw);
		
		//Click on Login button.
		l.clickLogin();
		
		//Click on Logout button.
		TimeTrackPage t = new TimeTrackPage(driver);
		t.clickLogout();
		
	}
}
