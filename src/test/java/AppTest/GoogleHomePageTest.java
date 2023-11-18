package AppTest;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import Steps.GoogleHomePageSteps;
import org.openqa.selenium.WebDriver;
//Removed unused imports
@RunWith(SerenityRunner.class)
public class GoogleHomePageTest {

    @Managed(uniqueSession = true)
    WebDriver browser;

    @Steps
    GoogleHomePageSteps googleHomePageSteps;



    @Test

    public void test1() {
        googleHomePageSteps.openLoginPage();
    }

   /*@Test

    public void test2(){

        googleHomePageSteps.validateGoogleLogo();


    }

    /*@Test

    public void test3(){
        googleHomePageSteps.performSearch("current serenity version","serenity latest version maven");
        //Assert.assertTrue(result.equals("serenity latest version maven"));
    }
*/
}
