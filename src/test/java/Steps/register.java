package Steps;


import com.microsoft.playwright.Page;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class register {
	
	 Page page = Hooks.getPage(); 
	
	@Given("user is on register page")
	public void user_is_on_register_page() {
	    // Write code here that turns the phrase above into concrete actions
	     page.navigate("https://practicetestautomation.com/practice-test-login/");
	}

	@When("user enters valid credentials in websites")
	public void user_enters_valid_credentials_in_websites() {
	    // Write code here that turns the phrase above into concrete actions
	    page.locator("#username").fill("student");
	    page.locator("#password").fill("Password123");
	}

	@Then("user able to register to page")
	public void user_able_to_register_to_page() {
	    // Write code here that turns the phrase above into concrete actions
	    page.locator("#submit").click();
	}

}
