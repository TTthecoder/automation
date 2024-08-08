package Tests;

import Pages.LoginPage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = BrowserFactory.startBrowser("Chrome", "https://wastemanagement.ekurhuleni.gov.za/");
    LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
}
