package testngcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationCore.Base;

public class CommandsNg extends Base
{
@Test

	
	public void verifyUserLogin()
	{
	 driver.get("https://demowebshop.tricentis.com/login");
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys("bhavyajs239@gmail.com");
		WebElement password=driver.findElement(By.id("Password"));
		password.sendKeys("bhavyajs123");
		WebElement login=driver.findElement(By.xpath("//input[@value='Log in']"));
		login.click();
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
		firstName.sendKeys("Gladis");
	WebElement lastName=driver.findElement(By.id("LastName"));
	lastName.sendKeys("Varghese");
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys("bhavyajs239@gmail.com");
		WebElement password=driver.findElement(By.id("Password"));
		password.sendKeys("bhavyajs123");
		WebElement conformpassword=driver.findElement(By.id("ConfirmPassword"));
		conformpassword.sendKeys("bhavyajs123");
		WebElement register1=driver.findElement(By.id("register-button"));
		register1.click();
	}
@Test
public void VerifyGetTitle()
{
	 driver.get("https://demowebshop.tricentis.com/login");
	 String title=driver.getTitle();
	 System.out.println("Title "+title);
	 
}
@Test
public void registartion()
{
	
		 boolean isButton;
		 driver.get("https://demowebshop.tricentis.com/register");
		 WebElement gender_fld=driver.findElement(By.id("gender-female"));
		 isButton=gender_fld.isSelected();
		 System.out.println("Gender field brfore selected : " +isButton);
		 gender_fld.click();
		 isButton=gender_fld.isSelected();
		 System.out.println("Gender field after selected : " +isButton);
		 
}
}
