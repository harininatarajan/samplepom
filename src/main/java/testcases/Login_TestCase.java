package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.LearnDriver;
import pages.LoginPage;
import utlities.ReadData;

public class Login_TestCase extends LearnDriver {
	
	
@BeforeTest
public void startApp() {
	excelFileName="Login";
	testCaseName="Login Test Case";
	testcaseDesc="To Verify the Login Functionality";
	author="Harini";
	category="Smoke testing";
	
}
	
@Test (dataProvider ="fetchData")
public void login_HRM(String username, String password) {
	
	
  new LoginPage().enterusername(username).enterpassword(password).clickbtn();
	
}


@DataProvider(name="fetchData")
public String[][] readdata() throws IOException {
	
	return ReadData.readexceldata(excelFileName);
	
}

}
