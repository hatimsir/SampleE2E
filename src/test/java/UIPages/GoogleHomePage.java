package UIPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class GoogleHomePage extends PageObject {

    @Step
    public void isLogoDisplayed(){
        shouldBeVisible(By.xpath("//img[@class='lnXdpd']"));
    }

    @Step
    public void doSearch(String searchKey, String searchResult){
        typeInto($(By.xpath("//textarea[@title='Search']")),searchKey);
        waitForTextToAppear(searchResult);
    }
}
