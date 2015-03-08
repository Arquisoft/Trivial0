package es.uniovi.asw.steps;

import es.uniovi.asw.game.UserDb;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.PendingException;
import static org.assertj.core.api.Assertions.*;

public class UserManagementSteps {
	UserDb users ;

	@Given("^there are no users$")
	public void there_are_no_users() throws Throwable {
		users = new UserDb();
	}

	@When("^I create a user \"(.+)\" with password \"(.+)\"$")
	public void i_create_a_user(String name, String password) throws Throwable {
	    users.addUser(name,password);
	}

	@Then("^The number of users is (\\d+)$")
	public void the_number_of_users_is(int n) throws Throwable {
	    assertThat(users.size()).isEqualTo(1);  
	}
}
