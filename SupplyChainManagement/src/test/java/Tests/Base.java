package Tests;

import Pages.SignInPage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    WebDriver driver = browserFactory.startBrowser("Chrome", "http://10.2.2.46/Scm/Account/Login");
    protected SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
}
