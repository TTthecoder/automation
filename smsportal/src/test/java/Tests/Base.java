package Tests;

import Pages.LoginPage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    WebDriver driver = browserFactory.startBrowser("Chrome", "http://crmportal.ekurhuleni.gov.za/");
    protected LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
}
