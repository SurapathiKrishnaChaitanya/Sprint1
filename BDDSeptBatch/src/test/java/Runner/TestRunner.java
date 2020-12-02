package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="Feature/outline.feature",
	monochrome= true,
	glue= {"stepDefinitions"},
	plugin= {"html:target/destination"}
)
public class TestRunner {

}
