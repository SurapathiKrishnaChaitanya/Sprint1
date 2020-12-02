package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	@Given("^user on home page$")
    public void user_on_home_page() throws Throwable {
        System.out.println("home page");
    }

    @When("^user navigates to login page$")
    public void user_navigates_to_login_page() throws Throwable {
    }

    @Then("^login successfully$")
    public void login_successfully() throws Throwable {
    	System.out.println("login successful");
    }

    @And("^user enters (.+) and (.+) $")
    public void user_enters_and(String username, String password, String strArg1, String strArg2) throws Throwable {
    	System.out.println(username+"\n"+password);
    }
}
