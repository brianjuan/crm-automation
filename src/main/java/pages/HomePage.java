package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    // Fields
    MobileElement btn_today;
    MobileElement btn_settings;
    MobileElement btn_create_new;
    MobileElement btn_contact;

    public HomePage(MobileDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    // Actions
    public void clickSettings() {
        btn_settings = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(("//XCUIElementTypeButton[@name=\"Icon Square\"]"))));
        btn_settings.click();
    }

    public void clickCreateNew() {
        btn_create_new = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Create New")));
        btn_create_new.click();
    }

    public void clickContact() {
        btn_contact = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("CNContacts")));
        btn_contact.click();
    }

    // Validations
    public boolean isAtHomePage() {
        btn_today = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(("//XCUIElementTypeButton[@name=\"Today\"]"))));

        return btn_today.isDisplayed();
    }
}
