package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeleteTests extends TestBase {

    @Test
    public void testContactDeleteTests() {
        app.getContactHelper().initContactModify(); // отркытие страницы изменения контакта
        app.getContactHelper().deleteContact(); // удаление контакта
    }
}
