package stepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		plugin= {"pretty","html:target/cucumber-html"},
		features= "src/features",
		tags= {"@LoginFeature"},
		glue= {"stepDefs"}
		
		)

public class TestRunner {

}
