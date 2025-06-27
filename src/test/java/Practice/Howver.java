package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Howver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement h=driver.findElement(By.xpath("//div[@id='nav-link-amazonprime']"));
        Actions action=new Actions(driver);
	    action.moveToElement(h).build().perform();
		

	}

}
