package Runner;

import Tests.Base;
import org.testng.annotations.Test;

public class Execute extends Base {

    @Test
    public void enterEmailTests(){
        signInPage.enterEmail("jaclyne");
    }

    @Test(dependsOnMethods = {"enterEmailTests"})
    public void enterPasswordTests(){
        signInPage.enterPassword("Solar@2023");
    }

    @Test(dependsOnMethods = {"enterPasswordTests"})
    public void clickSignInButtonTests(){
        signInPage.clickSignInButton();
    }
}

