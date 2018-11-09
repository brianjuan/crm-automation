import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginToCRM() {
        welcome_page.clickSkip();
        login_page.clickNext();
        login_page.clickSignIn();

        // Validate
        Assert.assertEquals(home_page.isAtHomePage(), true);
    }
}
