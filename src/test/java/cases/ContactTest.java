package cases;

import org.testng.annotations.Test;
import pages.BasePage;

public class ContactTest extends BaseTest {

    @Test
    public void createContact() {
        loginToCRM();

        new_contact_page.clickNavButtonAdd();
        // validate if create new screen is displayed
//        new_contact_page.isCreateNewDisplayed();

        new_contact_page.clickCreateNewContact();
        // validate if create new contact screen is displayed
        new_contact_page.isAtNewContactPage();

        new_contact_page.enterFirstName("Mary");
        new_contact_page.enterLastName("James");
        new_contact_page.enterTitle("Senior Manager");
        new_contact_page.clickChooseAccount();
//        new_contact_page.searchAccount("_AA");
//        new_contact_page.clickSearchedAccount("_AA");
//        new_contact_page.clickAddPhone();
//        new_contact_page.enterPhoneNumber("973-888-8888");
//        new_contact_page.clickAddEmail();
//        new_contact_page.enterEmail("abrahambrian.juan@infor.com");

        takeScreenshot("ClickAdd");
    }
}
