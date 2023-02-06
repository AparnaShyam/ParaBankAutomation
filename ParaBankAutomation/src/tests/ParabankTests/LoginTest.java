package ParabankTests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class LoginTest extends BaseTest{
	
	public LoginTest(){
		super();
		// TODO Auto-generated constructor stub
	}

	WebDriver driver;
	String expectedRegistrationTitle="ParaBank | Register for Free Online Account Access";
	//String registrationSuccessMessage="Your account was created successfully. You are now logged in.";
	
	@Test
	public void verifyRegistration() throws Exception
	{	
	loginpage.navigateToregister();
	String actualRegistrationTitle=cmnDriver.getTitle();
	assertEquals(actualRegistrationTitle, expectedRegistrationTitle);
	loginpage.registerAccount("a","b", "address", "city", "state", "zip", 0123, "ssn", "abc", "abc");
	test.log(LogStatus.PASS, "Registration Completed");
	
	}

}
