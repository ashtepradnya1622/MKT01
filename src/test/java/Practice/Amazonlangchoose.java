package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonlangchoose {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
driver.navigate().refresh();
WebElement e1=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
Actions a1=new Actions(driver);
a1.moveToElement(e1).build().perform();
//WebElement e1=driver.findElement(By.xpath("//div[@id='icp-nav-flyout']"));
//Actions action =new Actions(driver);
//action.moveToElement(e1).perform();
//Thread.sleep(2000);
//WebElement op=driver.findElement(By.xpath("//div[@class='nav-template nav-flyout-content nav-tpl-itemList']//ul/li[3]"));
//op.click();

	}

}
