package htm.index.parabank.com.parasoft.parabank.pages;

import htm.index.parabank.com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

       By loginLink = By.xpath("//div[3][@class = 'login']/child::input");
       By registerLink = By.xpath("//a[contains(text(),'Register')]");

       public void clickOnLoginLink(){

           clickOnElement(loginLink);

       }
       public void registerLink(){

           clickOnElement(registerLink);
       }





}
