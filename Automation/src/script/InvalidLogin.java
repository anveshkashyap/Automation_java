package script;

import org.testng.annotations.Test;

import generics.Excel;
import pom.LoginPage;

public class InvalidLogin extends BaseTest {

	@Test
	public void testInvalidLogin() throws InterruptedException {
		
		String xlpath="./data/TDS.xlsx";
		//DOT->current path of Java Project
		String sheet="InvalidLogin";
		int rc=Excel.getRowCount(xlpath, sheet);
		
		for(int i=0;i<rc;i++) {
		String un=Excel.getCellData(xlpath, sheet, i, 0);	
		String pw=Excel.getCellData(xlpath, sheet, i, 1);
		//Enter invalid username
		LoginPage l=new LoginPage(driver);
		l.setName(un);
		
		//Enter invalid password
		l.setPassword(pw);
		
		//Click on Login button
		l.clickLogin();
		Thread.sleep(3000);
		
		//Verify error msg
		l.verify();
		}
		System.out.println(rc);
	}
}
