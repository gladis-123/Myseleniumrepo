package Assigment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox. FirefoxDriver;
public class BrowserFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver obj1=new FirefoxDriver();
obj1.manage().window().maximize();
obj1.get("https://www.instagram.com/aishwaryaraibachchan_arb/");
String title=obj1.getTitle();
System.out.println("Title "+title);
String Currenturl=obj1.getCurrentUrl();
System.out.println("Currenturl "+Currenturl);
String handleid=obj1.getWindowHandle();
System.out.println("handleid "+handleid);
String sourcecode=obj1.getPageSource();
System.out.println("Sourcecode "+sourcecode);
obj1.quit();

	}

}
