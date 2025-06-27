package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testngone {
	@Test(priority=1)
	public void login() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("shoes",Keys.ENTER);
		System.out.println(driver.getTitle());
		}
	@Test(priority=-1)
	public void operation() {
	}
	@Test(priority=0)
	public void logout() {
	}

}
