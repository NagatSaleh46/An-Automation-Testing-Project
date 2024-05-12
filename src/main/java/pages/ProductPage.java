package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
    private By sauceLabsAddToCartButton= By.id("add-to-cart-sauce-labs-backpack");
    private By ShoppingCartLink= By.className("shopping_cart_link");
    public void ClickonAddToCart(){
         driver.findElement(sauceLabsAddToCartButton).click();
    }
    public void ClicjkOnCartPage(){
    driver.findElement(ShoppingCartLink).click();

}

}