package Practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FB_login1
//step1{
	@FindBy(name="email")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="login")
	WebElement loginbutton;
	
	//step2
	
	public void uname() {
		username.sendKeys("");
	}
	public void upass() {
		password.sendKeys("");
	}
	public void login() {
		login.click();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
