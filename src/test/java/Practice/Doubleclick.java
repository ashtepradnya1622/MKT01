package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa-practice.netlify.app/double-click");
		WebElement button=driver.findElement(By.xpath("//button[@id='double-click-btn']"));
		Actions action=new Actions(driver);
		action.doubleClick(button).build().perform();
		
		
		
	}

}
