package Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentscrooup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.amazon.in/");
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,550)", "");
		   js.executeScript("window.scrollBy(0,350)", "");		   
 
	}

}
