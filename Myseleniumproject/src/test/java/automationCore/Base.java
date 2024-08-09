package automationCore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;

	public void initializeBrowser(String browsername)
	{
	if(browsername.equals("Chrome"))	
	{
		driver=new ChromeDriver();
	}
		else if(browsername.equals("EdgeDriver"))
				{
			driver=new EdgeDriver();
			
				}
		else if(browsername.equals("FirefoxDriver"))
				{
			driver=new FirefoxDriver();
				}
			else
			{
				throw new RuntimeException("Invalid Browser Received ");
			}
	
	driver.manage().window().maximize();
	}
	@BeforeMethod
	public void setup()
	{
	initializeBrowser("Chrome");//this method
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
		
		
	}
}

