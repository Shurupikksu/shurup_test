package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModificationTests() {

        app.getContactHelper().initContactModify();
        app.getContactHelper().fillContactInfo(new ContactData("Inoshka", "Masochkin", "Bandit", "Testing", "Mail", "Moscow"));
        app.getContactHelper().submitContactModify();
    }


}
