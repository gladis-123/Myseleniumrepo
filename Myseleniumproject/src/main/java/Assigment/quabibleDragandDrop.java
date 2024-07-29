package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class quabibleDragandDrop {
	WebDriver driver;
	public void dragAndDrop()
	{
		
	
	 driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/drag-drop.php");
	driver.manage().window().maximize();
	WebElement drag=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	WebElement drop=driver.findElement(By.id("mydropzone"));
	Actions action=new Actions(driver);
	action.dragAndDrop(drag, drop).build().perform();
	WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
	WebElement drop1=driver.findElement(By.id("mydropzone"));
	Actions action1=new Actions(driver);
	action1.dragAndDrop(drag1, drop1).build().perform();
	WebElement drag2=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
	WebElement drop2=driver.findElement(By.id("mydropzone"));
	Actions action2=new Actions(driver);
	action2.dragAndDrop(drag2, drop2).build().perform();
	WebElement drag3=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
	WebElement drop3=driver.findElement(By.id("mydropzone"));
	Actions action3=new Actions(driver);
	action3.dragAndDrop(drag3, drop3).build().perform();
	driver.quit();
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quabibleDragandDrop obj=new quabibleDragandDrop();
		obj.dragAndDrop();
	}

}
