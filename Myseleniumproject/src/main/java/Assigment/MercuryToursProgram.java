package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercuryToursProgram {
	WebDriver driver;
	public void demoGuru()
	{
	driver=new FirefoxDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	WebElement firstname=driver.findElement(By.xpath("//td[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='firstName']"));
	firstname.sendKeys("gladis");
	WebElement lastname=driver.findElement(By.xpath("//input[contains(@name,'lastName')]"));
	lastname.sendKeys("Varghese");
	WebElement phonenumber=driver.findElement(By.xpath("//input[@name='phone']"));
	phonenumber.sendKeys("9497234567");
	WebElement email=driver.findElement(By.id("userName"));
	email.sendKeys("annavarghese66@gmail.com");
	WebElement address=driver.findElement(By.xpath("//input[@name='address1']"));
	address.sendKeys("pathil,north45");
	WebElement city=driver.findElement(By.xpath("//input[starts-with(@name,'city')]"));
	city.sendKeys("Alappuzha");
	WebElement state=driver.findElement(By.xpath("//input[starts-with(@name,'state')]"));
	state.sendKeys("Kerala");
	WebElement postalcode=driver.findElement(By.xpath("//td[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='postalCode']"));
	postalcode.sendKeys("688589");
	WebElement country=driver.findElement(By.xpath("//option[text()='ANGOLA']"));
	country.click();
	WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
	username.sendKeys("annavarghese66@gmail.com");
	WebElement password=driver.findElement(By.xpath("//td[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='password']"));
	password.sendKeys("anna12345");
	WebElement confirmpassword= driver.findElement(By.xpath("//td[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='confirmPassword']"));
	confirmpassword.sendKeys("anna12345");
	WebElement submit=driver.findElement(By.xpath("//input[starts-with(@type, 'submit')]"));
	boolean issubmit=submit.isEnabled();
	System.out.println("submit button is enabled "+issubmit);
    submit.click();
    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MercuryToursProgram  obj=new  MercuryToursProgram ();
		 obj.demoGuru();
	}
}
