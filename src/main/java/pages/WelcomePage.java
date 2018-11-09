package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomePage extends BasePage {
    // Fields
    MobileElement btn_skip;

    public WelcomePage(MobileDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    // Actions
    public void clickSkip() {
        btn_skip = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Skip")));
        btn_skip.click();
    }
}
