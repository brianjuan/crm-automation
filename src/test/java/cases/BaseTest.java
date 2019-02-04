package cases;

import constants.Platform;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    private DesiredCapabilities capabilities = new DesiredCapabilities();
    protected IOSDriver driver;
    protected WebDriverWait wait;

    WelcomePage welcome_page;
    LoginPage login_page;
    HomePage home_page;
    NewContactPage new_contact_page;
    AuthenticationPage auth_page;

    @BeforeMethod
    protected void setup() throws MalformedURLException {

        // Initialize Desired Capabilities
        initializeCapabilities();

        // Initialize pages
        initializePages();
    }

    @AfterMethod
    protected void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    protected void initializeCapabilities() throws MalformedURLException {
        if(Platform.NAME.equalsIgnoreCase("browserstack")) {
            // BrowserStack
            capabilities.setCapability("device", "iPhone XS Max");
            capabilities.setCapability("os_version", "12.1");
            capabilities.setCapability("browserstack.debug", "true");
            capabilities.setCapability("browserstack.video", "true");
            capabilities.setCapability("app", "InforCRM");
            capabilities.setCapability("realMobile", "true");

            driver = new IOSDriver(new URL(constants.Platform.BROWSERSTACK_URL), capabilities);
        } else if(Platform.NAME.equalsIgnoreCase("devicefarm")) {
            // AWS Device Farm
            capabilities.setCapability("platformName", "iOS");
            capabilities.setCapability("deviceName", "iPhone X");
            capabilities.setCapability("platformVersion", "12.0");
//        capabilities.setCapability("automationName", "XCUITest");

            driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        } else {
            Assert.fail("Invalid Platform Name: " + Platform.NAME);
        }

        wait = new WebDriverWait(driver, 10);
    }

    protected void initializePages() {
        welcome_page = new WelcomePage(driver, wait);
        login_page = new LoginPage(driver, wait);
        home_page = new HomePage(driver, wait);
        new_contact_page = new NewContactPage(driver, wait);
        auth_page = new AuthenticationPage(driver, wait);
    }

    protected void takeScreenshot(String filename) {
        String screenshot_directory = System.getenv("WORKING_DIRECTORY");
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        screenshot.renameTo(new File(screenshot_directory, String.format("%s.png", filename)));
    }

    protected void pushImage(String image_path) {
        String user_dir = System.getProperty("user.dir");
        image_path = user_dir + image_path;
        File image = new File(image_path);

        try {
            driver.pushFile("QR1.png", image);
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}
