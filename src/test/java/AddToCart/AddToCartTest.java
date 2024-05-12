package AddToCart;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertTrue;

public class AddToCartTest extends BaseTest {
    @Test
    public void addTocart() throws InterruptedException {
        HomePage validlogin = new HomePage(driver);
        validlogin.validUsername("standard_user");
        validlogin.validPassword("secret_sauce");
        validlogin.validLoginButton();
        ProductPage product = new ProductPage(driver);
        CartPage cart = new CartPage(driver);
        product.ClickonAddToCart();
        product.ClicjkOnCartPage();
        System.out.println(cart.isSoucelabdisplay());
        assertTrue(cart.isSoucelabdisplay());

    }

    @Test
    public void checkout() throws InterruptedException {
        HomePage validlogin = new HomePage(driver);
        validlogin.validUsername("standard_user");
        validlogin.validPassword("secret_sauce");
        validlogin.validLoginButton();
        ProductPage product = new ProductPage(driver);
        CartPage cart = new CartPage(driver);
        product.ClickonAddToCart();
        product.ClicjkOnCartPage();
        cart.ClickOnCheckOut();
        new CheckOutPage (driver).fillFirstName("nagat");
        new CheckOutPage(driver).fillLastName("saleh");
        new CheckOutPage(driver).fillpostalcode("123");
        new CheckOutPage(driver).clickOnContinue();
        new CheckOutStepTwo(driver).ClickOnFinishButton();
        assertTrue(new CheckOutComplete(driver).IscompleteMessageDisplayed());


    }
}