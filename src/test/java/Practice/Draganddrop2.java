package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement drag=driver.findElement(By.id("drag1"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='div2']"));
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.dragAndDrop(drag, drop).perform();
		
		
	}

}
