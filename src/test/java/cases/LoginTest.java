package cases;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginToCRM() {
        super.loginToCRM();

        // Take Screenshot
        takeScreenshot("LoginTest");
    }
}
