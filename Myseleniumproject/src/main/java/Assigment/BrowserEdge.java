package Assigment;
import org.openqa.selenium. WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class BrowserEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver obj=new EdgeDriver();
obj.manage().window().maximize();
obj.get("https://github.com/gladis-123/seleniumbasics");
String title=obj.getTitle();
System.out.println("Title  "+title);
String currentUrl=obj.getCurrentUrl();
System.out.println("Current Url  "+currentUrl);
String handleid=obj.getWindowHandle();
System.out.println("Handleid  "+handleid);
String sourcecode=obj.getPageSource();
System.out.println("Sourcecode "+sourcecode);
obj.close();
	}

}
