package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class Screenshot {
	WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File destination=new File("C:\\Users\\krish\\eclipse\\java-2025-03\\eclipse\\SS\\mahadev.png");
FileHandler.copy(src, destination);

	}
	

}
