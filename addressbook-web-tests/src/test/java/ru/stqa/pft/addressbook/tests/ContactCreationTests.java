package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {
  @Test
  public void testContactCreate() throws Exception {
    app.getNavigationHelper().goToAddContactForm();
    app.getContactHelper().fillContactInfo(new ContactData("Ivan", "Sergeevich", "Sorokhin", "Testing", "Mail", "Moscow"));
    app.getContactHelper().submitContactCreation();
  }
}


