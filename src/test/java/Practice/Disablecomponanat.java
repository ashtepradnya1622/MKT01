package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disablecomponanat {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://selectorshub.com/xpath-practice-page/");
		WebElement uid=driver.findElement(By.name("test"));
		JavascriptExecutor js=driver;
		js.executeScript("arguments[0].removeAttribute('disabled')",uid);
		Thread.sleep(2000);
		uid.sendKeys("pradnya");
		
	}

}
