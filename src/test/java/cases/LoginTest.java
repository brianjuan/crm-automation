package cases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginToCRM() {
        welcome_page.clickSkip();
        login_page.clickSignIn();
        auth_page.enterUsername("janahbeatriz.intal@infor.com");
        auth_page.enterPassword("Thinkas1!");
        auth_page.clickSignIn();
        auth_page.clickAllow();
        auth_page.clickAllow();

        driver.launchApp();

        // Validate
//        Assert.assertEquals(home_page.isAtHomePage(), true);

        // Take Screenshot
        takeScreenshot("LoginTest");
    }
}
