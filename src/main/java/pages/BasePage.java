package pages;

import io.appium.java_client.MobileDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected MobileDriver driver;
    protected WebDriverWait wait;

    public BasePage(MobileDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
}
