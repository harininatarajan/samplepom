package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.LearnDriver;

public class AdminPage extends LearnDriver {
	
	public AdminPage clickAddbutton() {
		driver.findElementByName("btnAdd").click();
		return this;
	}
	
	public AdminPage userrole() throws InterruptedException {
		WebElement role = driver.findElementById("systemUser_userType");
	     Select roles = new Select(role);
	      roles.selectByIndex(0);
		  Thread.sleep(1000);
	      return this;
		}
  	public AdminPage employeename(String empname) {
  		driver.findElementById("systemUser_employeeName_empName").sendKeys(empname);
  	   return this;
  	}
 public AdminPage employeeusername(String empusername) {
	 driver.findElementById("systemUser_userName").sendKeys(empusername);
   return this;
 } 
   public AdminPage status() throws InterruptedException {
   WebElement status = driver.findElementById("systemUser_status");
   Select allstatus = new Select(status);
    allstatus.selectByIndex(1);
	  Thread.sleep(1000);
    return this;
	}
  public AdminPage employeepassword(String emppassword) {
	  driver.findElementById("systemUser_password").sendKeys(emppassword);
	  return this;
  }
public AdminPage confirmpassword(String confirmpwd)
{
	driver.findElementById("systemUser_confirmPassword").sendKeys(confirmpwd);
	return this;
}

	public AdminPage Search(String sysusername) {
	driver.findElementById("searchSystemUser_userName").sendKeys(sysusername);
	driver.findElementById("searchBtn").click();
	return this;	
}


	
}



