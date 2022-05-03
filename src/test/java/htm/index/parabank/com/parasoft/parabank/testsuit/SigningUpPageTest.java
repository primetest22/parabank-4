package htm.index.parabank.com.parasoft.parabank.testsuit;

import htm.index.parabank.com.parasoft.parabank.pages.HomePage;
import htm.index.parabank.com.parasoft.parabank.pages.RegisterPage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SigningUpPageTest extends TestBase {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyThatSigningUpPageDisplay(){

     homePage.registerLink();
     String expectedText = "Signing up is easy!";
     String actualText = registerPage.verifySigningUpText();

        Assert.assertEquals(actualText,expectedText,"Not Matching");

    }


}
