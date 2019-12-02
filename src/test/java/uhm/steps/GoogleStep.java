package uhm.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.GooglePage;

public class GoogleStep {

	WebDriver driver;
	TestContext testContext;
	GooglePage gPage;
    
    public GoogleStep(TestContext context) {
    	testContext = context;
    	gPage = testContext.getPageObjectManager().getGooglePage();
    	driver = testContext.getWebDriverManager().getDriver();
    }
    
    @Given("^I navigate to the home page$")
    public void i_navigate_to_the_home_page() throws Throwable {
        gPage.navigateToGoogle();
    }

    @Given("^I enter the following for Search$")
    public void i_enter_the_following_for_Search(DataTable table) throws Throwable {
    	List<Map<String, String>> map = table.asMaps(String.class, String.class);
    	gPage.enterSearchValue(map.get(0).get("SearchInput"));
    }
    
    @Given("^I click Search button$")
    public void i_click_Search_button() throws Throwable {
    	gPage.clickOnSearchButton();
    }

    @Then("^I should see the Search Result$")
    public void i_should_see_the_Search_Result() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
