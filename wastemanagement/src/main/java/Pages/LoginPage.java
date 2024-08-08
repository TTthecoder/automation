package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"details-button\"]")
    WebElement Advanced_xpath;
    @FindBy(xpath = "//*[@id=\"proceed-link\"]")
    WebElement proceed_xpath;
    @FindBy(xpath = "//input[contains(@name,'username')]")
    WebElement username_xpath;
    @FindBy(xpath = "//input[contains(@name,'password')]")
    WebElement password_xpath;
    @FindBy(xpath = "//button[contains(.,'Login')]")
    WebElement Login_xpath;

    public void clickAdvancedButton(){
        Advanced_xpath.click();
    }

    public void clickProcceedLink(){
        proceed_xpath.click();
    }

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void enterUsername(String username){
        username_xpath.sendKeys("jaclyne");
    }

    public void enterPassword(String password){
        password_xpath.sendKeys("Solar@2023");
    }

    public void clickLoginButton(){
        Login_xpath.click();
    }


}
