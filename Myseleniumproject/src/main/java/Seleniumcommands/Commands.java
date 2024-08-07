package Seleniumcommands;

import java.awt.AWTException;
import java.awt.Event;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Commands {
public void verifyUser()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
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
	email.sendKeys("annavarhese6663@gmail.com");
	WebElement password=driver.findElement(By.id("Password"));
	password.sendKeys("addgh1235");
	WebElement conformpassword=driver.findElement(By.id("ConfirmPassword"));
	conformpassword.sendKeys("addgh1235");
	WebElement register1=driver.findElement(By.id("register-button"));
	register1.click();
}
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
	public void verifyKeyBoadrEvents() throws AWTException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/select-input.php");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		driver.close();
		
	}
	public void verifySimpleAlert()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		WebElement simpleclick=driver.findElement(By.id("alertButton"));
		simpleclick.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
public void verifyConformationAlert()
{

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	WebElement conformationAlert=driver.findElement(By.id("confirmButton"));
	Alert alert=driver.switchTo().alert();
	String message=alert.getText();
	System.out.println("Alert msg "+message);
	alert.accept();
	WebElement conformationResult=driver.findElement(By.id("confirmResult"));
	String result=conformationResult.getText();
	System.out.println("the Result"+result);
	
	
}
public void verifyPromtAler()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	WebElement promtAler=driver.findElement(By.id("promtButton"));
	promtAler.click();
	Alert alert=driver.switchTo().alert();
	alert.sendKeys("hello");
	alert.accept();
	WebElement promtMessage=driver.findElement(By.id("promptResult"));
	String result=promtMessage.getText();
	System.out.println("message "+result);
	
	
}
public void verifyFrames()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/frames");
	List<WebElement>iframetag=driver.findElements(By.tagName("i frame"));
	int noOFTags=iframetag.size();
	System.out.println("no of tag "+noOFTags);
	//driver.switchTo().frame(0);
	//driver.switchTo().frame("frame1");
	WebElement frame=driver.findElement(By.id("frame1"));
	driver.switchTo().frame(frame);
	WebElement frameText=driver.findElement(By.id("sampleHeading"));
	String text=frameText.getText();
	System.out.println("Text "+text);
	driver.close();
}
public void verifyMultipleWindowHandling()
{

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/popup.php");	
	String parentWindowHandleId=driver.getWindowHandle();
			System.out.println("windowHandle"+parentWindowHandleId);
	WebElement clickhere=driver.findElement(By.xpath("//a[text()='Click Here']"));
	clickhere.click();
	//String childWindowHandleId=drivers();
	//System.out.println("CWH "+childWindowHandleId);
	Set<String>eIdhandl=driver.getWindowHandles();
	System.out.println("Hid "+eIdhandl);
	Iterator<String>values=eIdhandl.iterator();
	while(values.hasNext());
	{
		String currentid=values.next();
		if(!currentid.equals(parentWindowHandleId))
		{
			
			driver.switchTo().window(currentid);
			WebElement email=driver.findElement(By.xpath("//input[@name='emailid']"));
			email.sendKeys("annavarghese66123@gamil.com");
			WebElement submit=driver.findElement(By.xpath("//input[@name='btnLogin']"));
			submit.click();
			driver.switchTo().defaultContent();
		}
		
	}
}
public void verifyDynamicTable()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://money.rediff.com/indices/nse");
	driver.manage().window().minimize();
	WebElement showmore=driver.findElement(By.id("showMoreLess"));
	showmore.click();
	WebElement tableField=driver.findElement(By.xpath("//table[@id='dataTable']"));
	//System.out.println(tableField.getText());
	WebElement row=driver.findElement(By.xpath("//table[@id='dataTable']/tbody /tr[2]"));
	System.out.println(row.getText());
	List<WebElement>rows=tableField.findElements(By.tagName("tr"));
	int rows_count=rows.size();
	for(int i = 0;i< rows_count;i++)
	{
	List<WebElement>columns=rows.get(i).findElements(By.tagName("td"));
			int column_count=columns.size();
	for(int j=0;j<column_count;j++)
	{
	String cell_data=columns.get(j).getText();
	if(cell_data.equals("NIFTY 500"))
	{
		System.out.println("the data "+columns.get(2).getText());
	}
	
			
	}
}
}
public void verifyFileUpload()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/upload/");
	driver.manage().window().maximize();
	WebElement choose_fld=driver.findElement(By.id("uploadfile_0"));
	choose_fld.sendKeys("C:\\Users\\gladi\\git\\Myseleniumrepo\\Myseleniumproject\\src\\main\\resources\\Selenium Note.docx");
	WebElement checkbox=driver.findElement(By.id("terms"));
	checkbox.click();
	WebElement submit_fld=driver.findElement(By.id("submitbutton"));
	submit_fld.click();
}

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		Commands  obj=new Commands ();
		//obj.isDisplayed();
		//obj.isSelected();
		//obj.isEnabled();
			//obj.verifyUser();
		//obj.verifyValueFromDropdown();
		//obj.getTotalDropDown();
		//obj.verifyRightClick();
		//obj.verifyDoubleClick();
		//obj.mouseOver();
		//obj.verifyDragandDrop();
		//obj.verifyDragandDropusingOffset();
		//obj.verifyKeyBoadrEvents();
		//obj.verifySimpleAlert();
		//obj.verifyConformationAlert();
		//obj.verifyPromtAler();
		//obj.verifyFrames();
		//obj.verifyMultipleWindowHandling();
		//obj. verifyDynamicTable();
		obj.verifyFileUpload();
	}

}

