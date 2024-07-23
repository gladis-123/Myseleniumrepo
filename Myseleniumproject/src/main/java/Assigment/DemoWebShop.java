package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	public void command()
	{
		WebDriver obj=new ChromeDriver();
		obj.manage().window().maximize();
		obj.get("https://demowebshop.tricentis.com/login");
		WebElement email=obj.findElement(By.id("Email"));
		email.sendKeys("annavarghese6663@gmail.com");
		WebElement password=obj.findElement(By.id("Password"));
		password.sendKeys("addgh1235");
		WebElement login=obj.findElement(By.className("button-1 login-button"));
		login.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DemoWebShop  obj=new  DemoWebShop ();
		 obj.command();
	}

}
