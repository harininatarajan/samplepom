package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.LearnDriver;

public class Addemp extends LearnDriver{
	
	public Addemp empfirstname(String fname)
	{
		driver.findElementById("firstName").sendKeys(fname);
		return this;
	}
	public Addemp empmiddlename(String mname)
	{
		driver.findElementById("middleName").sendKeys(mname);
		return this;
	}
	public Addemp emplastname(String lname)
	{
		driver.findElementById("lastName").sendKeys(lname);
		return this;
	}
	
	public Addemp employeeid(String empid)
	{
		driver.findElement(By.xpath("//*[@id=\"employeeId\"]")).sendKeys(empid);
		return this;
	}

public Addemp photoupload() throws IOException{
		WebElement uploadElement = driver.findElement(By.id("photofile"));
		uploadElement.sendKeys("F://devo/muru.jpg");
		return this;
	
}

	public Emppersonal save() throws IOException, InterruptedException{
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
		Thread.sleep(2000);
		return new Emppersonal();
	
	}
}






