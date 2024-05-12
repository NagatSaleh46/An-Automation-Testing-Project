package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutStepTwo {
    private WebDriver driver;
    public CheckOutStepTwo(WebDriver driver) {
        this.driver = driver;
    }
    private By FinishButton = By.id("finish");
    public void ClickOnFinishButton(){

        driver.findElement(FinishButton).click();
    }
}
