package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scrollip {
	@Test
	public void Assert() {

		// TODO Auto-generated method stub
    ChromeDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.amazon.in/");
   String title=driver.getTitle();
   String Expectedtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
   Assert.assertEquals(title, "expected title");
//WebElement e1=driver.findElement(By.linkText("Careers"));
//Point p1=e1.getLocation();
//int x=p1.getX();
//int y=p1.getY();
//JavascriptExecutor js=driver;
//js.executeScript("window.scrollBy(0,600)");
//js.executeScript("window.scrollBy(0,-400)");
//js.executeScript("window.scrollBy(0,"+y+")");
}

}
