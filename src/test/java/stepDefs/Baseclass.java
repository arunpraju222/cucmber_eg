package stepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Baseclass {
	
	static WebDriver driver;
	
	
	@Before
	public void setup() {
	
	driver = new ChromeDriver();
	System.setProperty("webdriver.chrome,driver","chromedriver");
	}
	@After
	public void teardown() {
		driver.quit();
		
	}
}
	
