package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    // Fields
    private MobileElement btn_next;
    private MobileElement btn_signin;

    public LoginPage(MobileDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    // Actions
    public void clickNext() {
        btn_next = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Next")));
        btn_next.click();
    }

    public void clickSignIn() {
        btn_signin = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//XCUIElementTypeButton[@name=\"Sign In\"]")));
//        btn_signin = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Sign In\"]");
        btn_signin.click();
    }
}
