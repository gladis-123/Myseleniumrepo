package Assigment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesHyr {
	WebDriver driver;
	public void frames()
	
	{
	 driver=new ChromeDriver();	
	 driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	 driver.manage().window().maximize();
	 WebElement boxField=driver.findElement(By.id("name"));
	 boxField.sendKeys("Frame Work");
			 
	 List<WebElement>tagNumber=driver.findElements(By.tagName("iframe"));
	 int frameNo=tagNumber.size();
	  System.out.println("No of tags"+ frameNo);
	  WebElement frame=driver.findElement(By.id("frm1"));
	  driver.switchTo().frame(frame);
	  WebElement dropdown=driver.findElement(By.id("selectnav1"));
	  dropdown.sendKeys("Dropdowns");
	  WebElement selectf=driver.findElement(By.id("course"));
	  Select select=new Select(selectf);
	  select.selectByVisibleText("java");
	  WebElement frame2=driver.findElement(By.id("frm2"));
	  driver.switchTo().frame(frame2);
	  WebElement framefirst=driver.findElement(By.id("firstName"));
	  framefirst.sendKeys("anna");
	  WebElement frameflast=driver.findElement(By.id("lastName"));
	  frameflast.sendKeys("varghese");
	  WebElement framegender=driver.findElement(By.id("femalerb"));
	  framegender.click();
	  WebElement framelanguage=driver.findElement(By.id("englishchbx"));
	  framelanguage.click();
	  WebElement framemail=driver.findElement(By.id("email"));
	  framemail.sendKeys("annna66@gmail.com");
	  driver.close();
	  
	 
	 
	 
	 
	 
	 
	 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FramesHyr  obj=new FramesHyr ();
		obj.frames();
	}

}
