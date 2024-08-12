package testngcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;

public class CommandsNg extends Base
{
@Test

	
	public void verifyUserLogin()
	{
	 driver.get("https://demowebshop.tricentis.com/login");
		WebElement email=driver.findElement(By.id("Email"));
		String expectedresult="bhavyajs239@gmail.com";

		email.sendKeys(expectedresult);
		WebElement password=driver.findElement(By.id("Password"));
		password.sendKeys("bhavyajs123");
		WebElement login=driver.findElement(By.xpath("//input[@value='Log in']"));
		login.click();
		WebElement email1=driver.findElement(By.xpath("//a[text()='bhavyajs239@gmail.com']"));
		String actualresult=email1.getText();
		
	}
@Test
public void VerifyRegistration()
{ 
	driver.get("https://demowebshop.tricentis.com/");
		WebElement register=driver.findElement(By.className("ico-register"));
		register.click();;
		WebElement gender=driver.findElement(By.id("gender-female"));
		gender.click();
		WebElement firstName=driver.findElement(By.id("FirstName"));
		firstName.sendKeys("wtGladis");
	WebElement lastName=driver.findElement(By.id("LastName"));
	lastName.sendKeys("rhVarghese");
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys("ibhavyjs2er39@gmail.com");
		WebElement password=driver.findElement(By.id("Password"));
		password.sendKeys("bhavyajs623");
		WebElement conformpassword=driver.findElement(By.id("ConfirmPassword"));
		conformpassword.sendKeys("bhavyajs623");
		WebElement register1=driver.findElement(By.id("register-button"));
		register1.click();
		WebElement reg_msg=driver.findElement(By.className("result"));
		String actualrseult=reg_msg.getText();
		String expected="Your registration completed";
		Assert.assertEquals(actualrseult, expected,"invalidmessage");
	}
@Test
public void VerifyGetTitle()
{
	 driver.get("https://demowebshop.tricentis.com/login");
	 String title=driver.getTitle();
	 //System.out.println("Title "+title);
	 String expectedtitle="Demo Work Shop";
	 Assert.assertEquals(title, expectedtitle, "invalidtitle");
}
@Test
public void verifyIsDispalyed()
{

	driver.get("https://demowebshop.tricentis.com");
	WebElement vote_displayed=driver.findElement(By.id("vote-poll-1"));
	boolean isDisplayselected= vote_displayed.isDisplayed();
	//System.out.println("Vote element is displayed "+isDisplayselected
	Assert.assertTrue(isDisplayselected, "displayed");

}
@Test
public void is_enabled()
{
	
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement subscription=driver.findElement(By.id("newsletter-subscribe-button"));
		boolean isSubscriptionisenabled=subscription.isEnabled();
		//System.out.println("Subscription button is enabled");
		 
		Assert.assertTrue(isSubscriptionisenabled, "enabled");
}
@Test
public void	is_selected()
{ 
	boolean isButtonSelected;
	driver.get("https://demowebshop.tricentis.com/register");
	WebElement gender=driver.findElement(By.id("gender-male"));
	isButtonSelected=gender.isSelected();
	//System.out.println("gender element before selected "+isButtonSelected);
	Assert.assertFalse(isButtonSelected, "false");
	// gender.click();
	 isButtonSelected=gender.isSelected();
	 //System.out.println("gender element after selected "+isButtonSelected);
	Assert.assertTrue(isButtonSelected, "true");
	}
		

	

	
	
}

