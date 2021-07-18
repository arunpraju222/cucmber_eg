package stepDefs;

import org.junit.Assert;

import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calculatorsteps {
	int result;
	
	 @Given("^the calculator is open$")
	    public void the_calculator_is_open() throws Throwable {
	     System.out.println(" calculator application is open");   
	    }

	    @When("^i add two numbers \"([^\"]*)\" and\"([^\"]*)\"$")
	    public void i_add_two_numbers_something_andsomething(int num1, int num2) throws Throwable {
	    result = num1+num2;  
	    }
	    
	    @When("^i multiply two numbers \"([^\"]*)\" and\"([^\"]*)\"$")
	    public void i_multiply_two_numbers_something_andsomething(int num1, int num2) throws Throwable {
	    result = num1*num2;
	    }

	    @Then("^i get the result as \"([^\"]*)\"$")
	    public void i_get_the_result_as_something(int expResult) throws Throwable {
	    
	    	Assert.assertEquals(expResult, result);
	    }


}
