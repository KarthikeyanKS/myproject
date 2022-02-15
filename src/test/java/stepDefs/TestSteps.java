package stepDefs;


import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testRunner.Runner;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;


public class TestSteps extends Runner{
	public WebDriver driver;
	public TestSteps() {
		driver = Runner.driver;
	}
	
	@Given("^User is on Home Page \"(.*)\"$")
	public void user_is_on_home_page(String url) {
		driver.navigate().to(url);
	}

	@Then("^Title should match \"(.*)\"$")
	public void title_should_match(String title) {
		String actualTitle = driver.getTitle();		
		System.out.println(actualTitle);
		System.out.println(title);
		assertThat("asdfsad", actualTitle, equalToIgnoringCase(title)); 
				
	}

	@When("User LogOut from the Application")
	public void user_log_out_from_the_application() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Message displayed LogOut Successfully")
	public void message_displayed_log_out_successfully() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
