package BasicSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

    WebDriver driver;

    public void startChromeBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://crmportal.ekurhuleni.gov.za/");
        driver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("jaclyne");
        driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("Solar@2023");
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/form/p/button")).click();

    }




}
