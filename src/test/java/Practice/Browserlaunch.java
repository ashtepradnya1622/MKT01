package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
    driver.navigate().to("https://www.amazon.com/");
    driver.navigate().refresh();
    driver.navigate().refresh();
   driver.manage().window().maximize();
    WebElement e=driver.findElement(By.xpath("//input[@type='text']"));
    e.sendKeys("shoes");
    
    


	}

}
