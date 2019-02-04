package cases;

import org.testng.annotations.Test;

public class ContactTest extends BaseTest {

//    @Test
    public void createContact() {
        welcome_page.clickSkip();
        login_page.clickNext();
        login_page.clickSignIn();

        home_page.clickCreateNew();
        home_page.clickContact();

        new_contact_page.enterFirstName("Mary");
        new_contact_page.enterLastName("James");
        new_contact_page.enterTitle("Senior Manager");
        new_contact_page.clickChooseAccount();
        new_contact_page.searchAccount("_AA");
        new_contact_page.clickSearchedAccount("_AA");
        new_contact_page.clickAddPhone();
        new_contact_page.enterPhoneNumber("973-888-8888");
        new_contact_page.clickAddEmail();
        new_contact_page.enterEmail("abrahambrian.juan@infor.com");
    }
}
