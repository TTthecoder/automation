package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {

    public static WebDriver driver;

    public static WebDriver startBrowser(String browserChoice, String url) {
        if ("Chrome".equalsIgnoreCase(browserChoice)) {
            WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();

        }else if ("Edge".equalsIgnoreCase(browserChoice)){
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get("https://wastemanagement.ekurhuleni.gov.za/");
        return driver;

    }

    @Test
    public void test(){
        startBrowser("Chrome", "https://wastemanagement.ekurhuleni.gov.za/");
    }

}
