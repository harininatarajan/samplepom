package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.LearnDriver;
import pages.LoginPage;
import utlities.ReadData;

public class Admin_TestCase extends LearnDriver {
	
	@BeforeTest
	public void startApp() {
		filename="Login";
	}
	//parameters example 

		
	
	@Test (dataProvider ="fetchData")
	public void Admin_HRM(String username, String password,String empname,String empusername,String emppassword,String confirmpwd,String sysusername) throws InterruptedException {
		
  new LoginPage().enterusername(username).enterpassword(password).clickbtn().clickAdminlink().Search(sysusername).userrole().
	employeename(empname).employeeusername(empusername).status().employeepassword(emppassword).confirmpassword(confirmpwd);
		
	}


	@DataProvider(name="fetchData")
	public String[][] readdata() throws IOException {
		
		return ReadData.readexceldata(filename);
		
	}

}
