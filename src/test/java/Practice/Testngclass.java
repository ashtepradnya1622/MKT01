package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Testngclass {
	WebDriver driver;
	@Test
	public void f2() {
	  WebDriver driver =new ChromeDriver();
	  driver.manage().window().maximize();
	 driver.get("https://www.google.com/");
	 
		  }
}
