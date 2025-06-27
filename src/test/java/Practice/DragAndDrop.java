package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

public class DragAndDrop {

	public static void main(String[] args) {
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Static.html");
	    driver.manage().window().maximize();
	    
	    WebElement drag =driver.findElement(By.id("mongo"));
	    WebElement drop=driver.findElement(By.id("droparea"));
Actions action=new Actions(driver);
action.dragAndDrop(drag, drop).perform();
	}

}
