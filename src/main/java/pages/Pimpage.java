package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.LearnDriver;

public class Pimpage extends LearnDriver{
    public Pimpage pimempname(String empname){
     driver.findElementById("empsearch_employee_name_empName").sendKeys(empname);
	return this; 	
    	
    }
public Pimpage pimid(String id)
{
	driver.findElementById("empsearch_id").sendKeys(id);
	return this;
}

public Pimpage empstatus() throws InterruptedException {
	WebElement status = driver.findElementById("empsearch_employee_status");
     Select allstatus = new Select(status);
      allstatus.selectByIndex(2);
	  Thread.sleep(1000);
      return this;
	}
public Pimpage empinclude() throws InterruptedException {
	WebElement include = driver.findElementById("empsearch_termination");
     Select allinclude= new Select(include);
      allinclude.selectByIndex(1);
	  Thread.sleep(1000);
      return this;
	}
public Pimpage supervisiorname(String superid)
{
	driver.findElementById("empsearch_supervisor_name").sendKeys(superid);
	return this;
}
public Pimpage empjobtitle() throws InterruptedException {
	WebElement title = driver.findElementById("empsearch_job_title");
     Select alltitles= new Select(title);
      alltitles.selectByIndex(1);
	  Thread.sleep(1000);
      return this;
	}
public Pimpage empsubunit() throws InterruptedException {
	WebElement subunit= driver.findElementById("empsearch_sub_unit");
     Select allsubunits= new Select(subunit);
      allsubunits.selectByIndex(3);
	  Thread.sleep(1000);
      return this;
	}
public Addemp empadd() throws InterruptedException {
	driver.findElement(By.name("btnAdd")).click();
	Thread.sleep(1000);
	return new Addemp();
}

}
