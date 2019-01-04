import io.appium.java_client.MobileDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;
import pages.NewContactPage;
import pages.WelcomePage;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    private DesiredCapabilities capabilities = new DesiredCapabilities();
    protected MobileDriver driver;
    protected WebDriverWait wait;

    WelcomePage welcome_page;
    LoginPage login_page;
    HomePage home_page;
    NewContactPage new_contact_page;

    @BeforeMethod
    protected void setup() throws MalformedURLException {

        //BrowserStack
        capabilities.setCapability("device", "iPhone X");
        capabilities.setCapability("os_version", "11.0");
        capabilities.setCapability("browserstack.debug", "true");
        capabilities.setCapability("browserstack.video", "true");
        capabilities.setCapability("app", "InforCRM");

        driver = new IOSDriver(new URL(constants.URL.BS_URL), capabilities);

        //AWS Device Farm
//        capabilities.setCapability("platformName", "iOS");
//        capabilities.setCapability("deviceName", "iPhone X");
//        capabilities.setCapability("platformVersion", "12.0");
//        capabilities.setCapability("automationName", "XCUITest");
//
//        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), capabilities);

        wait = new WebDriverWait(driver, 5);

        // Initialize pages
        welcome_page = new WelcomePage(driver, wait);
        login_page = new LoginPage(driver, wait);
        home_page = new HomePage(driver, wait);
        new_contact_page = new NewContactPage(driver, wait);
    }

    @AfterMethod
    protected void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
