package Seleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {
	public void webelementCommand()
	{
		
	}
	public void isSelected()
	{
		boolean isButtonSelected;
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	WebElement gender=driver.findElement(By.id("gender-male"));
	isButtonSelected=gender.isSelected();
	System.out.println("gender element before selected "+isButtonSelected);
	 gender.click();
	 isButtonSelected=gender.isSelected();
	 System.out.println("gender element after selected "+isButtonSelected);
	
	}
	
	public void isEnabled()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement subscription=driver.findElement(By.id("newsletter-subscribe-button"));
		boolean isSubscriptionisenabled=subscription.isEnabled();
		System.out.println("Subscription button is enabled");
		
	}
	public void isDisplayed()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement vote_displayed=driver.findElement(By.id("vote-poll-1"));
		boolean isDisplayselected= vote_displayed.isDisplayed();
		System.out.println("Vote element is displayed "+isDisplayselected);
		driver.close();
		
	}
public void verify_user_registration()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement register=driver.findElement(By.className("ico-register"));
	register.click();
	WebElement gender=driver.findElement(By.id("gender-female"));
	gender.click();
	WebElement firstName=driver.findElement(By.id("FirstName"));
	firstName.sendKeys("Gladis");
WebElement lastName=driver.findElement(By.id("LastName"));
lastName.sendKeys("Varghese");
	WebElement email=driver.findElement(By.id("Email"));
	email.sendKeys("annavarhese6663@gmail.com");
	WebElement password=driver.findElement(By.id("Password"));
	password.sendKeys("addgh1235");
	WebElement conformpassword=driver.findElement(By.id("ConfirmPassword"));
	conformpassword.sendKeys("addgh1235");
	WebElement register1=driver.findElement(By.id("register-button"));
	register1.click();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commands  obj=new Commands ();
		obj.isDisplayed();
		obj.isSelected();
		obj.isEnabled();
			//obj.verify_user_registration();
		
	}

}
