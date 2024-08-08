package BasicSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    WebDriver driver;

    @Test
    public void startChromeBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://wastemanagement.ekurhuleni.gov.za/");
        driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
      //  driver.navigate().to("//*[@id=\"proceed-link\"]");
        driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();

        driver.findElement(By.xpath("/html/body/app-root/block-ui/app-login/div/div/div/div[1]/div/div/div/div/div[2]/form/div[1]/div/input"))
                .sendKeys("jaclyne");
        driver.findElement(By.xpath("/html/body/app-root/block-ui/app-login/div/div/div/div[1]/div/div/div/div/div[2]/form/div[2]/div/input"))
                .sendKeys("Solar@2023");
        driver.findElement(By.xpath("/html/body/app-root/block-ui/app-login/div/div/div/div[1]/div/div/div/div/div[2]/form/div[3]/button"))
                .click();

    }
}
