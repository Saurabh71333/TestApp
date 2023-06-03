package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	
	
	@Given("user navigate to BLUE Website")
	public void user_navigate_to_blue_website() {
	}
	   

	@When("user Validates the title on Login page")
	public void user_validates_the_title_on_login_page() {
	    
	}

	@Then("user enters {string} Username")
	public void user_enters_username(String Username) {
		System.out.println("Username: "+Username);
	    
	}

	@And("user enters {string} password")
	public void user_eneters_the_password(String password) {
		System.out.println("Password: "+password);
	}
	   

	@And("user clicks on Login button")
	public void user_clicks_on_login_button() {
	  
	}

}
