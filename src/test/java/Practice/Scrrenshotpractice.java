package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrrenshotpractice {
WebDriver driver;
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\krish\\eclipse-workspace\\Selenium\\src\\test\\Mahadev.png");
	FileHandler.copy(src, des);
	
	
//TakesScreenshot ts=(TakesScreenshot)driver;
//File src=ts.getScreenshotAs(OutputType.FILE);
//File des=new File("C:\\Users\\krish\\eclipse-workspace\\Selenium\\src\\test\\SS2shiv.png");
//FileHandler.copy(src, des);
}

}
