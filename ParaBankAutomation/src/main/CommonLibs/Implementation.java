package CommonLibs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Implementation {
	
	public WebDriver driver;
	public String getText(WebElement element) throws Exception {

		return element.getText();
	}
	public void clickElement(WebElement element) throws Exception {
		
		//Thread.sleep(10);
		element.click();

	}
	
	public String getAttribute(WebElement element, String attribute) throws Exception {

		return element.getAttribute(attribute);
	}
	
	public void setText(WebElement element, String textToWrite) throws Exception {

		element.sendKeys(textToWrite);
	}
	
	public void sendValues(WebElement element, CharSequence[] phone) throws Exception {

		element.sendKeys(phone);
	}

	
	public void clearText(WebElement element) throws Exception {
		element.clear();

	}
	public void sendValues(WebElement phoneLoc, int phone) {
		// TODO Auto-generated method stub
		
	}

}
