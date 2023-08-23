package core;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Page 
{
	// global variable
	public WebDriver driver = null;  // predefined interface
	
	public void openBrowser(String browser,String url)
	{
		
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver(); // predefined class
		}
		else if(browser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
	//	driver.get(url); // open url but cannot do back, forward , refresh
		   // or..
		
		driver.navigate().to(url); // better -> back, forward, refresh
		
		PageFactory.initElements(driver, this); // to read xpath from external file using @FindBy
		// implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
		
		 // long way
		     /*
		WebDriver.Options o= driver.manage();
		WebDriver.Window w = o.window();
		w.maximize();
		    */
		// short way
		driver.manage().window().maximize();
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}

}
