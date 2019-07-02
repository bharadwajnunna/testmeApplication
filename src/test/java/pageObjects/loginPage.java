package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;
	public loginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="userName")
	public  WebElement userNameTextBox;
	
	@FindBy(name="password")
	public WebElement passwordTextBox;
	
	@FindBy(name="Login")
	public   WebElement LoginButton;
}

