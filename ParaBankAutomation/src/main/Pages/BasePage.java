package Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class BasePage {
	public WebDriver driver;
	
	//public BasePage()
	{
		//this.driver=driver;
	}
	FileInputStream fp;
	private String currentWorkingDriectory;
	public Properties getPropertiesObject() throws IOException 
	{
		
		currentWorkingDriectory=System.getProperty("user.dir");			
		fp = new FileInputStream(currentWorkingDriectory +"/src/main/config/parametersconfig.properties");
		
		Properties prop=new Properties();
	
			prop.load(fp);
		
		return prop;
		}
	
	public String getUrlp() throws IOException
	{
		
		return getPropertiesObject().getProperty("url");
	}
	
	

}
