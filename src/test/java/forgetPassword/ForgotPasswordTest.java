package forgetPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;

public class ForgotPasswordTest extends BaseTests {
    @Test
    public void testForgotPassword(){
        var forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.enterEmail("kirli@funmail.com");
        forgotPasswordPage.pressRetrieveButton();

    }

}
