package Runner;

import Tests.Base;
import org.testng.annotations.Test;

public class Execution extends Base {

    @Test
    public void enterUsernameTests(){
        loginPage.enterUsername("jaclyne");
    }

    @Test(dependsOnMethods = {"enterUsernameTests"})
    public void enterPasswordTests(){
        loginPage.enterPassword("Solar@2023");
    }

    @Test(dependsOnMethods = {"enterPasswordTests"})
    public void clickloginButton(){
        loginPage.clickLoginButton();
    }
}
