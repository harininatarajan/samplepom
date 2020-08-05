package testcases;
	import java.io.IOException;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import base.LearnDriver;
	import pages.LoginPage;
	import utlities.ReadData;

	public class Pimemp_Testcase extends LearnDriver {
	@BeforeTest
	public void startApp() {
		excelFileName="Pimemp";
		testCaseName="Pimemp Test Case";
		testcaseDesc="To Verify the Pim employee details";
		author="Harini";
		category="Smoke testing";
		
	}
		
	@Test (dataProvider ="fetchData")
	public void Pimemp_HRM(String username,String password,String empname, String id,String superid) throws InterruptedException {
		
    new LoginPage().enterusername(username).enterpassword(password).clickbtn().clickPIMlink().pimempname(empname).pimid(id).empstatus().empinclude()
    .supervisiorname(superid).empjobtitle().empsubunit().empadd();
 		 	
	}
	@DataProvider(name="fetchData")
	public String[][] readdata() throws IOException {
		
		return ReadData.readexceldata(excelFileName);
		
	}

	}


