package Steps;

import UIPages.GoogleHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GoogleHomePageSteps {


    //@Steps
    GoogleHomePage homepage;
    @Given("User navigate to google page")
    public void user_navigate_to_google_page() {
        homepage.open();
    }

    @When("User see google page is opened")
    public void user_see_google_page_is_opened() {
    homepage.isLogoDisplayed();
    }

    @Then("User check text box and close the browser")
    public void user_check_text_box_and_close_the_browser() {
    homepage.doSearch("BDD CUCUMBER","BDD");
    }


    @And("User see the page")
    public void userSeeThePage() {
    }
}
