package UIPages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://google.com")
public class GoogleHomePage extends PageObject {

    @Step
    public void isLogoDisplayed(){
        shouldBeVisible(By.xpath("//img[@class='lnXdpd']"));
    }

    @Step
    public void doSearch(String searchKey, String searchResult){
        typeInto($(By.xpath("//textarea[@title='Search']")),searchKey);
        //waitForTextToAppear(searchResult);
    }
}
