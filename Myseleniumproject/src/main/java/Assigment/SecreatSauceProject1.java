package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecreatSauceProject1 {
	public void command()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecreatSauceProject1 obj=new SecreatSauceProject1();
		obj.command();
	}

}
