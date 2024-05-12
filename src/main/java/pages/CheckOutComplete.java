package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutComplete {
    private WebDriver driver;
    public CheckOutComplete (WebDriver driver){
        this.driver=driver;
    }
    private By CompleteMessage = By.className("complete-header");
    public boolean IscompleteMessageDisplayed() {
    return driver.findElement(CompleteMessage).isDisplayed();

    }
}
