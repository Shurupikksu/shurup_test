package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {


    public ContactHelper(WebDriver driver) {

      super(driver);
    }

    public void submitContactCreation() {
     click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]"));
    }

    public void fillContactInfo(ContactData contactData) {
      click(By.name("firstname"));
      type(By.name("firstname"),contactData.getFirstname());
      type(By.name("middlename"), contactData.getMiddlename());
      type(By.name("lastname"), contactData.getLastname());
      type(By.name("nickname"), contactData.getNickname());
      type(By.name("company"), contactData.getCompany());
      type(By.name("address"),contactData.getAddress());
    }

    public void initContactModify() {
        click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Moscow'])[1]/following::td[4]"));
    }

    public void submitContactModify() {
        click(By.xpath("(//input[@name='update'])[2]"));
    }
}
