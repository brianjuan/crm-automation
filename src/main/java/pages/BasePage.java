package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected MobileDriver driver;
    protected WebDriverWait wait;

    // Fields
    MobileElement navbtn_today;
    MobileElement navbtn_activities;
    MobileElement navbtn_add;
    MobileElement navbtn_accounts;
    MobileElement navbtn_contacts;
    MobileElement btn_create_meeting;
    MobileElement btn_create_task;
    MobileElement btn_create_note;
    MobileElement btn_create_contact;
    MobileElement btn_create_account;
    MobileElement txt_create_new;

    public BasePage(MobileDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    // Actions
    public void clickNavButtonToday() {
        navbtn_today = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(("//XCUIElementTypeTabBar/XCUIElementTypeButton[@name=\"Today\"]"))));
        navbtn_today.click();
    }

    public void clickNavButtonActivities() {
        navbtn_activities = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(("//XCUIElementTypeTabBar/XCUIElementTypeButton[@name=\"Activities\"]"))));
        navbtn_activities.click();
    }

    public void clickNavButtonAdd() {
        navbtn_add = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(("//XCUIElementTypeTabBar/XCUIElementTypeButton[1]"))));
        navbtn_add.click();
    }

    public void clickNavButtonAccounts() {
        navbtn_accounts = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(("//XCUIElementTypeTabBar/XCUIElementTypeButton[@name=\"Accounts\"]"))));
        navbtn_accounts.click();
    }

    public void clickNavButtonContacts() {
        navbtn_contacts = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(("//XCUIElementTypeTabBar/XCUIElementTypeButton[@name=\"Contacts\"]"))));
        navbtn_contacts.click();
    }

    public void clickCreateNewMeeting() {
        btn_create_meeting = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(("//XCUIElementTypeOther/XCUIElementTypeButton[@name=\"Meeting\"]"))));
        btn_create_meeting.click();
    }

    public void clickCreateNewTask() {
        btn_create_task = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(("//XCUIElementTypeOther/XCUIElementTypeButton[@name=\"Tasks\"]"))));
        btn_create_task.click();
    }

    public void clickCreateNewNote() {
        btn_create_note = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(("//XCUIElementTypeOther/XCUIElementTypeButton[@name=\"Notes\"]"))));
        btn_create_note.click();
    }

    public void clickCreateNewContact() {
        btn_create_contact = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(("//XCUIElementTypeOther/XCUIElementTypeButton[@name=\"Contacts\"]"))));
        btn_create_contact.click();
    }

    public void clickCreateNewAccount() {
        btn_create_account = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(("//XCUIElementTypeOther/XCUIElementTypeButton[@name=\"Accounts\"]"))));
        btn_create_account.click();
    }

    // Validations
    public boolean isCreateNewDisplayed() {
        txt_create_new = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(("//XCUIElementTypeOther/XCUIElementTypeStaticText[@name=\"Create a new\"]"))));

        return txt_create_new.isDisplayed();
    }
}
