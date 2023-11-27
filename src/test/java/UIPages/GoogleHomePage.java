package UIPages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class GoogleHomePage extends PageObject {

    public void isLogoDisplayed(){
        shouldBeVisible(By.xpath("//img[@class='lnXdpd']"));
    }

    //This method currently not in use so commented
    public String doSearch(String searchKey, String searchResult){
        typeInto($(By.xpath("//textarea[@title='Search']")),searchKey);
        waitForTextToAppear(searchResult);
        clickOn($(By.xpath("//div[@aria-label='"+searchResult+"']")));
        return find(By.xpath("//h3[text()='net.serenity-bdd']")).getText();
        //hatim updated some code latest
    }
}
