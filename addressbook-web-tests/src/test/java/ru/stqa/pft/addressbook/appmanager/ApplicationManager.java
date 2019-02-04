package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class ApplicationManager {
    WebDriver driver;

    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;

    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    public void init() { //этот метод может вызываться несколько раз
        System.setProperty("webdriver.gecko.driver","/Users/k.sharapova/Documents/GitHub/shurup_test/addressbook-web-tests/geckodriver");
        driver = new FirefoxDriver();
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/index.php");

        groupHelper = new GroupHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper(driver);

        sessionHelper.login("admin", "secret");
    }



    public void stop() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
          fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
      try {
        driver.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    private boolean isAlertPresent() {
      try {
        driver.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    private String closeAlertAndGetItsText() {
      try {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        if (acceptNextAlert) {
          alert.accept();
        } else {
          alert.dismiss();
        }
        return alertText;
      } finally {
        acceptNextAlert = true;
      }
    }

    public void submitContactCreation() {
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]")).click();
    }

    public void goToAddContactForm() {
      driver.findElement(By.linkText("add new")).click();
    }

    public void fillContactInfo(ContactData contactData) {
      driver.findElement(By.name("firstname")).click();
      driver.findElement(By.name("firstname")).clear();
      driver.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
      driver.findElement(By.name("middlename")).clear();
      driver.findElement(By.name("middlename")).sendKeys(contactData.getMiddlename());
      driver.findElement(By.name("lastname")).clear();
      driver.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
      driver.findElement(By.name("nickname")).clear();
      driver.findElement(By.name("nickname")).sendKeys(contactData.getNickname());
      driver.findElement(By.name("company")).click();
      driver.findElement(By.name("company")).clear();
      driver.findElement(By.name("company")).sendKeys(contactData.getCompany());
      driver.findElement(By.name("address")).click();
      driver.findElement(By.name("address")).clear();
      driver.findElement(By.name("address")).sendKeys(contactData.getAddress());
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
