package ParabankTests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
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
	
	}

}
