package Steps;


import com.microsoft.playwright.Page;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;





public class login {
	
	 Page page = Hooks.getPage(); 
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		
          page.navigate("https://www.saucedemo.com/");
          
	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {
	 
		// Write code here that turns the phrase above into concrete actions
		
		page.locator("#user-name").fill("standard_user");
		page.locator("#password").fill("secret_sauce");
	
	}
       

	@Then("user able to login to page")
	public void user_able_to_login_to_page() {
	    // Write code here that turns the phrase above into concrete actions
	    page.locator("#login-button").click();
	}

	@Given("user is on website page")
	public void user_is_on_website_page() {
	    // Write code here that turns the phrase above into concrete actions
	       page.navigate("https://www.saucedemo.com/");
	       page.locator("#user-name").fill("standard_user");
			page.locator("#password").fill("secret_sauce");
			 page.locator("#login-button").click();
	}

	@When("user select some product and add to cart")
	public void user_select_some_product_and_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    page.locator("#add-to-cart-sauce-labs-backpack").click();
	}

	@Then("click on cart")
	public void click_on_cart() {
	    // Write code here that turns the phrase above into concrete actions
	   page.locator(".shopping_cart_link").click();
	}


}
