package Assigment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommand3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver obj=new FirefoxDriver();
obj.manage().window().maximize();
obj.get("https://www.selenium.dev/about");
obj.navigate().back();
obj.navigate().forward();
obj.navigate().refresh();
obj.navigate().to("https://www.seleniumeasy.com");
	}

}
