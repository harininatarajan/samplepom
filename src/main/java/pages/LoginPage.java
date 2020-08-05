package pages;

import org.openqa.selenium.By;

import base.LearnDriver;

public class LoginPage extends LearnDriver {
	
	
	public LoginPage enterusername(String username) {
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		return this;
		
	}
	
	public LoginPage enterpassword(String password) {
		 driver.findElement(By.name("txtPassword")).sendKeys(password); 
		 return this;
		
	}
	public DashboardPage clickbtn() {
		driver.findElement(By.name("Submit")).click();
		return new DashboardPage();
		
	}
	
}