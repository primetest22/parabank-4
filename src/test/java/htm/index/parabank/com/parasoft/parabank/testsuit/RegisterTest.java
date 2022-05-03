package htm.index.parabank.com.parasoft.parabank.testsuit;

import htm.index.parabank.com.parasoft.parabank.pages.HomePage;
import htm.index.parabank.com.parasoft.parabank.pages.RegisterPage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        //enter valid entry and validate registration successful
        homePage.registerLink();
        registerPage.enterFirstName("abcde");
        registerPage.enterLastName("xyz1");
        registerPage.enterAddress("hkjhjhkj");
        registerPage.enterCity("jhkhk");
        registerPage.enterState("jkjk");
        registerPage.zipcode("67577");
        registerPage.phone("00000000");
        registerPage.ssn("jhjhj");
        registerPage.username("prime0010");
        registerPage.password("test");
        registerPage.confirmPass("test");
        registerPage.clickOnRegister();

        String expectedDisplay = "Your account was created successfully. You are now logged in.";
        String actualDisplay = registerPage.verifyAccountCreated();
        Assert.assertEquals(actualDisplay, expectedDisplay, "Not Matching");


    }


}
