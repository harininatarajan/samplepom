package testcases;

   import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import base.LearnDriver;
	import pages.LoginPage;
	import utlities.ReadData;

	public class Pim_Testcase extends LearnDriver {
		
	@BeforeTest
	public void startApp() {
		excelFileName="Pim";
		testCaseName="PimTest Case";
		testcaseDesc="To Verify the Pim details";
		author="Harini";
		category="functional testing";
	}
		
	@Test (dataProvider ="fetchData")
	public void Pim_HRM(String username, String password) {
		
		
	  new LoginPage().enterusername(username).enterpassword(password).clickbtn().clickPIMlink();
		
	}


	@DataProvider(name="fetchData")
	public String[][] readdata() throws IOException {
		
		return ReadData.readexceldata(excelFileName);
		
	}
}
