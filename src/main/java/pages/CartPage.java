package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    public CartPage (WebDriver driver){
        this.driver=driver;
    }
        private By CheckOutButton= By.id("checkout");
        private By souceLabsItem = By.className("inventory_item_name");
        public  void ClickOnCheckOut(){
        driver.findElement(CheckOutButton).click();
    }
    //check if item exist or not
    public  boolean isSoucelabdisplay(){
       return driver.findElement(souceLabsItem).isDisplayed();

    }
}
