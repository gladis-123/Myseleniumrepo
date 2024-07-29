package Seleniumcommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
	public void  verifyValueFromDropdown()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement countrydropdown=driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select (countrydropdown);
		select.selectByVisibleText("BURMA");
		select.selectByIndex(4);
		select.selectByValue("ANGUILLA");
		
		
		
		
	}
	public void getTotalDropDown()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement countrydropdown=driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select (countrydropdown);
       List<WebElement>dropdown=select.getOptions();
       System.out.println(dropdown.size());
       driver.close();
       
		
	}
	public void verifyRightClick()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions action= new Actions(driver);
		action.contextClick(rightclick).build().perform();
	}
	
	public void verifyDoubleClick()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions action= new Actions(driver);
		action.contextClick(doubleclick).build().perform();
	}
	
	public void mouseOver()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/menu/");
		WebElement mouseOver=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		Actions action=new Actions(driver);
		action.moveToElement(mouseOver).build().perform();
	}
	public void verifyDragandDrop()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		WebElement dragg=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(dragg, drop).build().perform();
	}
	public void verifyDragandDropusingOffset()
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dragabble");
		WebElement draganadrop=driver.findElement(By.xpath("dragBox"));
		Actions action=new Actions(driver);
		action.dragAndDropBy(draganadrop, 150, 200)	.build().perform();	
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
		//obj.isDisplayed();
		//obj.isSelected();
		//obj.isEnabled();
			//obj.verify_user_registration();
		//obj.verifyValueFromDropdown();
		//obj.getTotalDropDown();
		//obj.verifyRightClick();
		obj.verifyDoubleClick();
		//obj.mouseOver();
		//obj.verifyDragandDrop();
		//obj.verifyDragandDropusingOffset();
	}

}
