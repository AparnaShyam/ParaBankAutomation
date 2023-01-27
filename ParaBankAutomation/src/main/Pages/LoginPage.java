package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import CommonLibs.Implementation;


public class LoginPage{
	
	WebDriver driver;
	
	@CacheLookup
	@FindBy(linkText ="Register")
	private WebElement resgisterLink;
	
	@CacheLookup
	@FindBy(name ="customer.firstName")
	private WebElement fnameLoc;
	
	@CacheLookup
	@FindBy(name ="customer.lastName")
	private WebElement lnameLoc;
	
	@CacheLookup
	@FindBy(name ="customer.address.street")
	private WebElement addressLoc;
	
	@CacheLookup
	@FindBy(name ="customer.address.city")
	private WebElement cityLoc;
	
	@CacheLookup
	@FindBy(name ="customer.address.state")
	private WebElement stateLoc;
	
	@CacheLookup
	@FindBy(name ="customer.address.zipCode")
	private WebElement zcodeLoc;
	
	@CacheLookup
	@FindBy(name ="customer.phoneNumber")
	private WebElement phoneLoc;
	
	@CacheLookup
	@FindBy(name ="customer.ssn")
	private WebElement ssnLoc;
	
	@CacheLookup
	@FindBy(name ="customer.username")
	private WebElement usernameLoc;
	
	@CacheLookup
	@FindBy(name ="customer.password")
	private WebElement passwordLoc;
	
	@CacheLookup
	@FindBy(name ="repeatedPassword")
	private WebElement confirmLoc;
	
	@CacheLookup
	@FindBy(xpath ="//input[@value='Register']")
	private WebElement registerBtn;
	
	Implementation implement;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		implement = new Implementation();
		
	}	
	public void navigateToregister() throws Exception
	{
		implement.clickElement(resgisterLink);
		
	}
	
	public void registerAccount(String fname,String lname,String address,String city,String state,String zcode,int phone,String ssn,String username,String password) throws Exception
	{
		implement.setText(fnameLoc, fname);
		implement.setText(lnameLoc, lname);
		implement.setText(addressLoc, address);
		implement.setText(cityLoc, city);
		implement.setText(stateLoc, state);
		implement.setText(zcodeLoc, zcode);
		implement.sendValues(phoneLoc, phone);
		implement.setText(ssnLoc, ssn);
		implement.setText(usernameLoc, username);
		implement.setText(passwordLoc, password);
		implement.setText(confirmLoc, password);
		implement.clickElement(registerBtn);
	}


}
