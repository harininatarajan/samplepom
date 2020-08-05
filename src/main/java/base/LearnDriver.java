package base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utlities.Reporter;

public class LearnDriver extends Reporter  {
	
	public static ChromeDriver driver;
		
	@BeforeMethod
	public void intialize_driver() {
		
		
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		    driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    String url = "https://opensource-demo.orangehrmlive.com/";
		     driver.get(url);
		    driver.manage().window().maximize();
		    System.out.println(driver.getCurrentUrl());
		    System.out.println("Title of the page is:" +driver.getTitle());
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
