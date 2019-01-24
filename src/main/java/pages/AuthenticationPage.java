package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticationPage extends BasePage {
    // Fields
    private MobileElement txtfield_username;
    private MobileElement txtfield_password;
    private MobileElement btn_signin;
    private MobileElement btn_allow;

    public AuthenticationPage(MobileDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    // Actions
    public void enterUsername(String username) {
        txtfield_username = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//XCUIElementTypeOther[@name=\"Sign On\"]/XCUIElementTypeOther[2]/XCUIElementTypeTextField")));
        txtfield_username.click();
        txtfield_username.sendKeys(username);
    }

    public void enterPassword(String password) {
        txtfield_username = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//XCUIElementTypeOther[@name=\"Sign On\"]/XCUIElementTypeOther[3]/XCUIElementTypeSecureTextField")));
        txtfield_username.click();
        txtfield_username.sendKeys(password);
    }

    public void clickSignIn() {
        btn_signin = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//XCUIElementTypeButton[@name=\"Sign In\"]")));
        btn_signin.click();
    }

    public void clickAllow() {
        btn_signin = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//XCUIElementTypeButton[@name=\"Allow\"]")));
        btn_signin.click();
    }
}
