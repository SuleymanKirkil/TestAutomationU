package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public LoginPage clickFormAuthentication(){
    driver.findElement(formAuthenticationLink).click();
    return new LoginPage(driver);
    };
    public DropdownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
            };

    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public void clickLink (String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
