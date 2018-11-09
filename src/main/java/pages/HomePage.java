package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    // Fields
    MobileElement navbar_today;
    MobileElement btn_create_new;
    MobileElement btn_contact;

    public HomePage(MobileDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    // Actions
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
        navbar_today = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(("//XCUIElementTypeNavigationBar[@name=\"Today\"]"))));
        System.out.println(navbar_today);
        return navbar_today.isDisplayed();
    }
}
