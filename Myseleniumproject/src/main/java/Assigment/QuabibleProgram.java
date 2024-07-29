package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QuabibleProgram {
	WebDriver driver;
	public void quabible()
	{
		 driver=new ChromeDriver();
		 driver.get("https://selenium.qabible.in/simple-form-demo.php");
		 driver.manage().window().maximize();
		 WebElement enter=driver.findElement(By.id("single-input-field"));
		 enter.sendKeys("Hello");
		 WebElement valuea=driver.findElement(By.id("button-one"));
		 valuea.sendKeys("5");
		 WebElement valueb=driver.findElement(By.id("value-b"));
		 valueb.sendKeys("6");
		 WebElement radiobutton=driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
	    radiobutton.click();
	    WebElement gender=driver.findElement(By.xpath("//label[@for='inlineRadio2']"));
	    gender.click();
	    WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one' or @fdprocessedid='x12bkj']"));
	    showmessage.click();
	    WebElement patientgender=driver.findElement(By.xpath("//label[@for='inlineRadio21']"));
	    patientgender.click();
	    WebElement category=driver.findElement(By.xpath("//input[@value='19 to 44']"));
	    category.click();
	    WebElement getresult=driver.findElement(By.xpath("//button[@id='button-two' or fdprocessedid='693pfq']"));
	    getresult.click();
	    WebElement selectinput=driver.findElement(By.xpath("//a[text()='Select Input']"));
	    selectinput.click();
	    WebElement selectcolour=driver.findElement(By.id("single-input-field"));
	    Select select =new Select (selectcolour);
	    select.selectByVisibleText("Red");
	    
	    //WebElement 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		QuabibleProgram obj=new QuabibleProgram();
		obj.quabible();
	}

}
