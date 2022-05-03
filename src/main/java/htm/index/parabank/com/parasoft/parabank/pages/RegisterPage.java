package htm.index.parabank.com.parasoft.parabank.pages;

import com.google.common.base.Verify;
import com.sun.org.apache.bcel.internal.classfile.Code;
import htm.index.parabank.com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.io.Zip;
import sun.security.util.Password;

public class RegisterPage extends Utility {

    By verifySigningUpText = By.xpath("//div[@id = 'mainPanel']/descendant::div[9]/child::h1");

    By firstName = By.xpath("//input[@id='customer.firstName']");
    By lastName = By.xpath("//input[@id='customer.lastName']");
	By addresS = By.xpath("//input[@id='customer.address.street']");
    By city =   By.xpath("//input[@id='customer.address.city']");
	By state  =   By.xpath("//input[@id='customer.address.state']");
	By zipCode =   By.xpath("//input[@id='customer.address.zipCode']");
	By phone =   By.xpath("//input[@id='customer.phoneNumber']");
	By SSN  =   By.xpath("//input[@id='customer.ssn']");
	By userName =   By.xpath("//input[@id='customer.username']");
	By password  =   By.xpath("//input[@id='customer.password']");
	By confirmPass =  By.xpath("//input[@id='repeatedPassword']");
	By registerButton  =   By.xpath("//tbody/tr[13]/td[2]/input[1]");

	By verifyAccountCreated   =   By.xpath("//div[@id='bodyPanel']/child::div[2]/child::p");

    public void enterFirstName(String Firstname) {
        sendTextToElement(firstName, Firstname);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastName, lastname);
    }

    public void enterAddress(String address) {
        sendTextToElement(addresS, address);
    }
    public void enterCity(String City) {
        sendTextToElement(city, City);
    }
    public void enterState(String State) {
        sendTextToElement(state, State);
    }
    public void zipcode(String Zipcode) {
        sendTextToElement(zipCode, Zipcode);
    }
    public void phone(String Phone) {
        sendTextToElement(phone, Phone);
    }
    public void ssn(String Ssn) {
        sendTextToElement(SSN, Ssn);
    }

    public void username(String Username) {
        sendTextToElement(userName, Username);
    }

    public void password(String Password) {
        sendTextToElement(password, Password);
    }


    public void confirmPass(String confirm) {
        sendTextToElement(confirmPass, confirm);
    }
    public String verifyAccountCreated(){
        return getTextFromElement(verifyAccountCreated);


    }

    public void clickOnRegister(){
        clickOnElement(registerButton);

    }






    public String verifySigningUpText(){
        return getTextFromElement(verifySigningUpText);

    }


}
