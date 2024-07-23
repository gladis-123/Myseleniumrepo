package Seleniumcommands;
import org.openqa.selenium. WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigationCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver  obj=new ChromeDriver();
		obj.manage().window().maximize();
		obj.get("https://www.selenium.dev/about");
		obj.navigate().back();
		obj.navigate().forward();
		obj.navigate().refresh();
		obj.navigate().to("https://www.seleniumeasy.com");
        obj.close();
	}

}
