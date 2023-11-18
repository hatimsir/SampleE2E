package Steps;

import UIPages.GoogleHomePage;
import net.thucydides.core.annotations.Step;

public class GoogleHomePageSteps {

    private GoogleHomePage googlehomepage;

    @Step
    public void openLoginPage(){
        googlehomepage.open();
    }

    @Step
    public void validateGoogleLogo(){
        googlehomepage.isLogoDisplayed();
    }

    @Step
    public String performSearch(String searchKey, String searchResult){
        return googlehomepage.doSearch(searchKey,searchResult);
    }
}
