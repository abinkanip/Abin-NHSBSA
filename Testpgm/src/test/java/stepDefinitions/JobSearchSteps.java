package stepDefinitions;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Pages;
import utilities.Hooks;


public class JobSearchSteps extends Pages{

	  private WebDriver driver; 
	  
	  public JobSearchSteps() {
		  this.driver=Hooks.getDriver(); 
	  }


	  @Given("I am on the NHS Jobs website {string}")
	  public void openNhSJobsWebsite(String url) {
	      driver.get(url);
	  }

	  @When("I enter {string} in the search field")
	  public void enterSearchTerm(String searchTerm) {
		  searchTerm(searchTerm);
	  }

	  @When("I select {string} from the location dropdown")
	  public void seleLocation(String location){
		  selectLocation(location);
	  }

	  @And("^I click on the search button$")
	  public void SearchButton() throws InterruptedException {
		  clickSearchButton();
	  }

       @Then("I should see a list of jobs matching my search criteria {string}")

         public void verifySearchResults(String searchTerm) {
    	   checkSearchResult(searchTerm);
	    }

	  @Then("^the search results should be sorted with the newest job posted at the top$")
	  public void verifySortByDate() {
		  sortByDate();
	  }
	  @Then("I should see a No results found for {string}")
	  public void i_should_see_a_no_results_found_for(String string) {
		  negativeSearchResult1(string);
	  }

	  @Then("I should see {string} message")
	  public void i_should_see_message(String string) {
		  negativeSearchResult2(string);
	  }
	  @When("I select {string} distance")
	  public void i_select_distance(String string) {
		  selectDistance();
	  }
	  @When("I click on the more search options button")
	  public void i_click_on_the_more_search_options_button() {
		  selectmoreSearch();
	  }

	  @When("I select Payrange £{double} to £{double}")
	  public void i_select_payrange_£_to_£(Double double1, Double double2) {
	     
	  }

	}
