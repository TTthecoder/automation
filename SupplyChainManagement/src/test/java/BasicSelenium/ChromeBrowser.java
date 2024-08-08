package BasicSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

    WebDriver driver;

    public void startBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://10.2.2.46/Scm/Account/Login");
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("jaclyn");
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Solar@2023");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/button")).click();
    }
}
