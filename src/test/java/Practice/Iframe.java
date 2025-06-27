package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://netbanking.hdfcbank.com/netbanking/");
		   WebElement frame=driver.findElement(By.name("login_page"));
		   driver.switchTo().frame("login_page");
		  WebElement uid= driver.findElement(By.name("fldLoginUserId"));
		   uid.sendKeys("112233");
	}

}
