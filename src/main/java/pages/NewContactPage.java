package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileElement;

public class NewContactPage extends BasePage {
    // Fields
    MobileElement txtfield_firstname;
    MobileElement txtfield_lastname;
    MobileElement txtfield_title;
    MobileElement text_choose_account;
    MobileElement searchfield_search;
    MobileElement btn_add_phone;
    MobileElement text_searched_account;
    MobileElement txtfield_phone;
    MobileElement btn_add_email;
    MobileElement txtfield_email;

    public NewContactPage(MobileDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    // Actions
    public void enterFirstName(String first_name) {
        txtfield_firstname = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(("//XCUIElementTypeApplication[@name=\"Infor iOS CRM\"]/XCUIElementTypeWindow[1]" +
                "/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField"))));
        txtfield_firstname.sendKeys(first_name);
    }

    public void enterLastName(String last_name) {
        txtfield_lastname = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(("//XCUIElementTypeApplication[@name=\"Infor iOS CRM\"]/XCUIElementTypeWindow[1]" +
                "/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextField"))));
        txtfield_lastname.sendKeys(last_name);
    }

    public void enterTitle(String title) {
        txtfield_title = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Infor iOS CRM\"]/XCUIElementTypeWindow[1]" +
                "/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeTextField")));
        txtfield_title.sendKeys(title);

        if(driver != null) {
            driver.hideKeyboard();
        }
    }

    public void clickChooseAccount() {
        text_choose_account = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.name("Choose account")));
        text_choose_account.click();
    }

    public void searchAccount(String account) {
        searchfield_search = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Search")));
        searchfield_search.sendKeys(account);
    }

    public void clickSearchedAccount(String account) {
        text_searched_account = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId(account)));
        text_searched_account.click();
    }

    public void clickAddPhone() {
        btn_add_phone = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Add phone\"]/following-sibling::XCUIElementTypeButton")));
        btn_add_phone.click();
    }

    public void enterPhoneNumber(String number) {
        txtfield_phone = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Add phone\"]/../preceding-sibling::XCUIElementTypeCell" +
                "/XCUIElementTypeStaticText[@name=\"Main\"]/preceding-sibling::XCUIElementTypeTextField")));
        txtfield_phone.sendKeys(number);
    }

    public void clickAddEmail() {
        btn_add_email = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Add email\"]/following-sibling::XCUIElementTypeButton")));
        btn_add_email.click();
    }

    public void enterEmail(String email) {
        txtfield_phone = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Add email\"]/../preceding-sibling::XCUIElementTypeCell" +
                "/XCUIElementTypeStaticText[@name=\"Main\"]/preceding-sibling::XCUIElementTypeTextField")));
        txtfield_phone.sendKeys(email);
    }

    // Validations
}
