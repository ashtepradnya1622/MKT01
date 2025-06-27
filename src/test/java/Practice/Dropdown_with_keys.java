package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_with_keys {

	public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			//Launching chrome browser
			driver.navigate().to("https://www.amazon.in");
			driver.navigate().refresh();
			//launching amazon India
			driver.manage().window().maximize();
			//Maximize your browser
			WebElement dd=driver.findElement(By.id("searchDropdownBox"));
			//locate your dropdown
			dd.sendKeys(Keys.ARROW_DOWN);
			//using Keys press arrow down button
			dd.sendKeys(Keys.ARROW_DOWN);
			//using Keys press arrow down button
			dd.sendKeys(Keys.ARROW_DOWN);
			//using Keys press arrow down button
			dd.sendKeys(Keys.ARROW_DOWN);
			//using Keys press arrow down button
			dd.sendKeys(Keys.ARROW_DOWN);

		}
	}


