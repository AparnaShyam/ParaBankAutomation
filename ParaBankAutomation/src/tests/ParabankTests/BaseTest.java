package ParabankTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import CommonLibs.CommonDriver;
import Pages.LoginPage;

public class BaseTest {
	
public CommonDriver cmnDriver;
	
	String url = "https://parabank.parasoft.com/parabank/index.htm";
	
	WebDriver driver;
	LoginPage loginpage;
	
	@BeforeClass
	public void invokeBrowser() throws Exception{
		System.out.println("Before Class0");
		

		cmnDriver = new CommonDriver();
		
		cmnDriver.setPageloadTimeout(60);
		cmnDriver.setElementDetectionTimeout(10);
		
		cmnDriver.navigateToFirstUrl(url);
		
		driver= cmnDriver.getDriver();
		loginpage=new LoginPage(driver);
		
	}
	
	@AfterClass
	public void shutdown() throws Exception {
		cmnDriver.closeAllBrowsers();
	}
	
	
	
	
}
