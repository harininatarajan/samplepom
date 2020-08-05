package testcases;

import base.LearnDriver;
import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pages.LoginPage;
import utlities.ReadData;

public class Addemp_Testcase extends LearnDriver {
@BeforeTest
public void startApp() {
	excelFileName="Addemp";
	testCaseName="Addemp Test Case";
	testcaseDesc="To Verify the employee details";
	author="Harini";
	category="sanity testing";
	
}
	
@Test (dataProvider ="fetchData")
public void Addemp_HRM( String username,String password,String empname, String id,String superid,String fname,
		String mname,String lname,String empid) throws InterruptedException, IOException {
new LoginPage().enterusername(username).enterpassword(password).clickbtn().clickPIMlink().pimempname(empname).pimid(id).empstatus().empinclude().
supervisiorname(superid).empjobtitle().empsubunit().empadd().empfirstname(fname).
empmiddlename(mname).emplastname(lname).employeeid(empid).photoupload().save();
}
	@DataProvider(name="fetchData")
	public String[][] readdata() throws IOException {
		
		return ReadData.readexceldata(excelFileName);
		
	}

  
}
