package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    @Test (priority = 1)
    public void validlogin() throws InterruptedException {
        HomePage validlogin = new HomePage(driver);
        validlogin.validUsername("standard_user");
        validlogin.validPassword("secret_sauce");
        validlogin.validLoginButton();
        assertTrue(validlogin.checkSuccessLogin().contains("Products"));

    }

    @Test (priority = 2)
    public void invalidlogin() throws InterruptedException {
        HomePage invalidlogin = new HomePage(driver);
        invalidlogin.validUsername("standard_user");
        invalidlogin.validPassword("");
        invalidlogin.validLoginButton();
        assertTrue(invalidlogin.checkFailedLogin().contains("Accepted usernames are:"));

    }
}
