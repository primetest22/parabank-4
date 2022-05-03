package htm.index.parabank.com.parasoft.parabank.pages;

import htm.index.parabank.com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By userName = By.xpath("//input[@name='username']");
    By passwordField = By.xpath("//input[@name='password']");
    By loginButton = By.xpath("//input[@value='Log In']");
    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");
    By verifyText = By.linkText("Accounts Overview");
    By customerLoginText = By.xpath("//div[@id = 'bodyPanel']/descendant::h2");
    By logoutBtton = By.linkText("Log Out");
    By invlidlogerror =By.xpath("//p[contains(text(),'The username and password could not be verified.')]");


    public String setinvlidlogerror(){
        return getTextFromElement(invlidlogerror);
    }
    public void logOut(){
        clickOnElement(logoutBtton);
    }

    public String verifyCustomerLogintext(){
        return getTextFromElement(customerLoginText);
    }

    public String verifytext(){
        return getTextFromElement(verifyText);
    }

    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

    public void username(String email){
        sendTextToElement(userName,email);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }











}
