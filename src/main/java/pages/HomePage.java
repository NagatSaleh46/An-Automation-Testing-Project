package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class HomePage {

    private WebDriver driver;

    private By UserNameLocator = By.id("user-name");
    private By PasswordLocator = By.xpath("//input[@id='password']");
    private By LoginButtonLocator = By.id("login-button");
    private By SuccessfulLogin=By.className("title");
    private By FailedLogin=By.xpath("//*[@id=\"login_credentials\"]/h4");


    public HomePage(WebDriver driver){
        this.driver=driver;
        }
    public void validUsername(String username) {
        WebElement usernameField = driver.findElement(UserNameLocator);
        usernameField.clear(); // Clear any existing data
        usernameField.sendKeys(username);
    }

    public void validPassword(String password) {
        WebElement passwordField = driver.findElement(PasswordLocator);
        passwordField.clear(); // Clear any existing data
        passwordField.sendKeys(password);
    }
    public void validLoginButton(){
        driver.findElement(LoginButtonLocator).click();
    }
    public String checkSuccessLogin(){
        return driver.findElement(SuccessfulLogin).getText();
   }
    public String checkFailedLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Maximum wait time of 10 seconds

        // Wait until the element is visible and can be located
        wait.until(ExpectedConditions.visibilityOfElementLocated(FailedLogin));

        // Retrieve the text of the element
        return driver.findElement(FailedLogin).getText();
    }

}
