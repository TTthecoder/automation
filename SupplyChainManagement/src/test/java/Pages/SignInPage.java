package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"Email\"]")
    WebElement email_xpath;
    @FindBy(xpath = "//*[@id=\"Password\"]")
    WebElement password_xpath;
    @FindBy(xpath = "//*[@id=\"loginForm\"]/button")
    WebElement signIn_xpath;

    public void enterEmail(String Email){
        email_xpath.sendKeys("jaclyne");
    }

    public void enterPassword(String Password){
        password_xpath.sendKeys("Solar@2023");
    }

    public void clickSignInButton(){
        signIn_xpath.click();
    }
}
