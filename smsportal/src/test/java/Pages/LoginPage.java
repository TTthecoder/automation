package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"usr\"]")
    WebElement Username_xpath;
    @FindBy(xpath = "//*[@id=\"pwd\"]")
    WebElement Password_xpath;
    @FindBy(xpath = "/html/body/div[2]/div[1]/form/p/button")
    WebElement Login_xpath;

    public void enterUsername(String Username) {
        Username_xpath.sendKeys("jaclyne");
    }

    public void enterPassword(String Password) {
        Password_xpath.sendKeys("Solar@2023");
    }

    public void clickLoginButton(){
        Login_xpath.click();
    }

}
