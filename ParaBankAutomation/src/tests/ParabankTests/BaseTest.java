package ParabankTests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import CommonLibs.CommonDriver;
import Pages.BasePage;
import Pages.LoginPage;


public class BaseTest{
	
public CommonDriver cmnDriver;

String URL;
	public BasePage basepage;
	WebDriver driver;
	LoginPage loginpage;

    ExtentHtmlReporter htmlReporter;
 
    ExtentReports extent;
    //helps to generate the logs in the test report.
    ExtentTest test;
	//String URL = "https://parabank.parasoft.com/parabank/index.htm";

  
	
	
	
	@BeforeClass
	public void invokeBrowser() throws Exception{
		System.out.println("Before Class0");
		

		cmnDriver = new CommonDriver();
		
		cmnDriver.setPageloadTimeout(60);
		cmnDriver.setElementDetectionTimeout(10);
		basepage=new BasePage();
		URL=basepage.getUrlp();
		cmnDriver.navigateToFirstUrl(URL);
		
		driver= cmnDriver.getDriver();
		loginpage=new LoginPage(driver);
		 // initialize the HtmlReporter
		extent = new  ExtentReports(System.getProperty("user.dir") +"/Reports/testReport.html");
        test = extent.startTest("ExtentDemo");

        test.log(LogStatus.PASS, "Navigated to the specified URL");
       
		
	}
	
	@AfterClass
	public void shutdown() throws Exception {
		cmnDriver.closeAllBrowsers();
		extent.flush();
	}
	
	
	
	
}
