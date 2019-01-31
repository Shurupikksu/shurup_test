package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
  @Test
  public void testContactCreate() throws Exception {
    goToAddContactForm();
    fillContactInfo(new ContactData("Ivan", "Sergeevich", "Sorokhin", "Testing", "Mail", "Moscow"));
    submitContactCreation();
  }
}


