package stepDefs;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver= Baseclass.driver;
	 @Given("^User has opened Simplilearn Application$")
	    public void user_has_opened_simplilearn_application() throws Throwable {
		 
			driver.get("https://www.simplilearn.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	        
	    }

	    @When("^User click on the Login Button$")
	    public void user_click_Login_button() throws Throwable {
	        
	    WebElement loginLink= driver.findElement(By.linkText("Log in"));
	    loginLink.click();
	    
	    }
	    
	    @And("^User enters correct username \"([^\"]*)\"$")
	    public void user_enters_correct_username_something(String username) throws Throwable {
	    
	    	WebElement UserName= driver.findElement(By.name("user_login"));
		    UserName.sendKeys(username);
	    	
	        
	    }
	    @And("^User enters correct password \"([^\"]*)\"$")
	    public void user_enters_correct_password_something(String password) throws Throwable {
	    	WebElement Password= driver.findElement(By.id("password"));
	    	Password.sendKeys(password);
	    }

	    @And("^User click login button$")
	    public void user_click_login_button() throws Throwable {
	    	WebElement Loginbutton= driver.findElement(By.name("btn_login"));
		    Loginbutton.click();
	       
	    }
	    @Then("^User should be loged in to the home page$")
	    public void user_should_be_loged_in_to_the_home_page() throws Throwable {
	    	
	        
	    }

	    

	    @And("^User can see the Successfull login message$")
	    public void user_can_see_the_successfull_login_message() throws Throwable {
	        
	    }


}
