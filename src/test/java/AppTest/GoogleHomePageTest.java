package AppTest;
//removed blank spaces
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

//add new commented line
//John kutty adding this commentssss
    // Comment from hatim on Nov 27
    @Test

    public void test1() {
        googleHomePageSteps.openLoginPage();
        //john updates on Nov 27 - john wrote
        //new john comment
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
