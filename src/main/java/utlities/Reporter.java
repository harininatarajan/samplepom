package utlities;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporter {
     
	public static ExtentHtmlReporter reporter;
	public static ExtentReports reports;
	public static ExtentTest test,node;
	
	public String testCaseName,testcaseDesc,author,category;
	public String excelFileName;
	
@BeforeSuite
public void startReport() {
	reporter= new ExtentHtmlReporter("./reports/result.html");
	reports = new ExtentReports();
	reports.attachReporter(reporter);
	
}

@BeforeClass
public void report() {
	
     test = reports.createTest(testCaseName, testcaseDesc);
     test.assignAuthor(author);
     test.assignCategory(category);
     
	
}
@AfterSuite
public void StopReport() {
	reports.flush();
}
	
}
