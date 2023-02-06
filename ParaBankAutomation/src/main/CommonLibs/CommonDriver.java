package CommonLibs;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonDriver {
	public WebDriver driver;
	private int pageloadTimeout;
	private int elementDetectionTimeout;
	
	private String currentWorkingDriectory;
	public CommonDriver() {
		System.out.println("First");
		currentWorkingDriectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",
				currentWorkingDriectory + "/drivers/chromedriver.exe");
        driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setPageloadTimeout(int pageloadTimeout) {
		this.pageloadTimeout = pageloadTimeout;
	}

	public void setElementDetectionTimeout(int elementDetectionTimeout) {
		this.elementDetectionTimeout = elementDetectionTimeout;
	}

	
	public void navigateToFirstUrl(String url) throws Exception {

		//driver.manage().timeouts().pageLoadTimeout(pageloadTimeout, TimeUnit.SECONDS);

		//driver.manage().timeouts().implicitlyWait(elementDetectionTimeout, TimeUnit.SECONDS);

		url = url.trim();

		driver.get(url);

	}
	
	public void waitInPage()
	{
		driver.manage().timeouts().pageLoadTimeout(pageloadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(elementDetectionTimeout, TimeUnit.SECONDS);
	}
	
	

	
	public String getTitle() throws Exception {
		String title = driver.getTitle();
		return title;
	}
	
	public String getpagesource() throws Exception {
		String title = driver.getPageSource();
		return title;
	}

	
	public String getCurrentUrl() throws Exception {

		return driver.getCurrentUrl();
	}

	
	public String getPageSource() throws Exception {

		return driver.getPageSource();
	}

	
	public void navigateToUrl(String url) throws Exception {

		url = url.trim();
		driver.navigate().to(url);

	}

	
	public void navigateForward() throws Exception {
		driver.navigate().forward();

	}

	
	public void navigateBackward() throws Exception {
		driver.navigate().back();

	}

	
	public void refresh() throws Exception {
		driver.navigate().refresh();

	}
	
	public void navigateToNextTab() {
	     
		ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());  
		driver.switchTo().window(wid.get(1));
		
	}

	
	public void closeBrowser() throws Exception {

		if (driver != null) {
			driver.close();

		}
	}

	
	public void closeAllBrowsers() throws Exception {
		if (driver != null) {
			driver.quit();
		}
		
	

	}

	
}
