package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
    private WebDriver driver; //чтоб никто другой не смог получить к конструктору доступ

    public NavigationHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void gotoGroupPage() {
      driver.findElement(By.linkText("groups")).click();
    }
}
