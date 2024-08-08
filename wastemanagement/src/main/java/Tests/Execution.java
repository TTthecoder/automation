package Tests;

import org.junit.Test;

public class Execution extends Base{

    @Test
    public void clickAdvancedButtonTests(){
        loginPage.clickAdvancedButton();
    }

    @Test
    public void clickProceedLinkTests(){
        loginPage.clickProcceedLink();
    }

    @Test
    public void enterUsernameTests(){
        loginPage.enterUsername("jaclyne");
    }

    @Test
    public void enterPasswordTests(){
        loginPage.enterPassword("Solar@2023");
    }

    @Test
    public void clickLoginButtonTests(){
        loginPage.clickLoginButton();
    }
}
