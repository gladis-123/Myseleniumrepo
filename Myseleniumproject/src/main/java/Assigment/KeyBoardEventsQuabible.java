package Assigment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardEventsQuabible {
	WebDriver driver;
	
public void  KeyBoardEvents()
{
	driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("https://selenium.qabible.in/bootstrap-alert.php");
	WebElement simpleClick=driver.findElement(By.id("normal-btn-success"));
	simpleClick.click();
	Alert alert=driver.switchTo().alert();
	alert.accept();
	WebElement normalclick=driver.findElement(By.id("normal-btn-warning"));
	simpleClick.click();
	Alert alert1=driver.switchTo().alert();
	alert1.accept();
	//WebElement simpleclik=driver.findElement(By.id("normal-btn-danger"));
}
public void bootStrapModel()
{
	driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("https://selenium.qabible.in/bootstrap-modal.php");
	WebElement simpleClick=driver.findElement(By.xpath("//button[@data-target='#exampleModalCenter']"));
	simpleClick.click();
	Alert alert=driver.switchTo().alert();
	alert.accept();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyBoardEventsQuabible obj=new KeyBoardEventsQuabible();
       // obj.KeyBoardEvents();
        obj.bootStrapModel();
        
	}

}
