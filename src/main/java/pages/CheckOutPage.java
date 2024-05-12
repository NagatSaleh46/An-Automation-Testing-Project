package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
    private  WebDriver driver;
    public CheckOutPage (WebDriver driver){
        this.driver=driver;
    }
    private  By firstname = By.id("first-name");
    private  By lastname = By.id("last-name");
    private   By postalcode = By.id("postal-code");
    private   By Continue = By.id("continue");
    public  void fillFirstName(String name){
        driver.findElement(firstname).sendKeys(name);
    }
    public  void fillLastName(String name){
        driver.findElement(lastname).sendKeys(name);
    }
    public  void fillpostalcode(String num){
        driver.findElement(postalcode).sendKeys(num);
    }
    public  void clickOnContinue(){
        driver.findElement(Continue).click();
    }
}
