package htm.index.parabank.com.parasoft.parabank.testsuit;


import htm.index.parabank.com.parasoft.parabank.pages.HomePage;
import htm.index.parabank.com.parasoft.parabank.pages.LoginPage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    //object creation
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //valid login and validate message
        loginPage.username("prime0010");
        loginPage.enterPassword("test");
        loginPage.clickOnLoginButton();
        String expectedDisplay = "Accounts Overview";
        String actualDisplay = loginPage.verifytext();
        Assert.assertEquals(actualDisplay, expectedDisplay, "Not Matching");

    }

    @Test
    public void verifyTheErrorMessage() {
        //invalid log in and validate message
        loginPage.username("}}}}}}}}}}}}}}}}}}}}}}}}}}}}");
        loginPage.enterPassword("}}}}}}}}}}}}}}}}}}}}}}}}}}}}}");
        loginPage.clickOnLoginButton();
        String expectedDisplay = "The username and password could not be verified.";
        String actualDisplay = loginPage.setinvlidlogerror();
        Assert.assertEquals(actualDisplay, expectedDisplay, "Not Matching");


    }

    @Test
    public void userShouldLogOutSuccessfully() {
        loginPage.username("prime0010");
        loginPage.enterPassword("test");
        loginPage.clickOnLoginButton();
        loginPage.logOut();

        String expectedDisplay = "Customer Login";
        String actualDisplay = loginPage.verifyCustomerLogintext();

        Assert.assertEquals(actualDisplay, expectedDisplay, "Not Matching");


    }

}



