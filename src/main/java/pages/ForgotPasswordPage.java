package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailBox = By.id("email");
    private By retrieveButton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver){
        this.driver=driver;
    }
    public void enterEmail(String email){
       driver.findElement(emailBox).sendKeys(email);
    }

    public void pressRetrieveButton(){
        driver.findElement(retrieveButton).click();
    }

}
