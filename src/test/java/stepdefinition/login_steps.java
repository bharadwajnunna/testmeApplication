package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.loginPage;

public class login_steps {
	
	WebDriver driver;
	loginPage lp;
	
	@Given("^I have chosen to login$")
	public void i_have_chosen_to_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_D4.05.01\\Desktop\\Testing_Automation_Stream_Training\\Week_3\\Reference Documents\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		lp=new loginPage(driver);
	}

	@When("^user enters valid username and password$")
	public void user_enters_valid_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		lp.userNameTextBox.sendKeys("Lalitha");
		lp.passwordTextBox.sendKeys("Password123");
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		lp.LoginButton.click();
		Thread.sleep(10000);
	}

	@Then("^user logins successfully and navigate to home page$")
	public void user_logins_successfully_and_navigate_to_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Assert.assertEquals("Home", driver.getTitle());
	}


}
