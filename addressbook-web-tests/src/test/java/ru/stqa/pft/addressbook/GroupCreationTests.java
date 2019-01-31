package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage(); //переход на страницу со списком
    initGroupCreation(); // инициализировать создание новой группы
    fillGroupForm(new GroupData("test1", "test2", "test3")); // заполнить поля
    submitGroupCreation(); // нажать кнопку подтверждения
    returnToGroupPage(); // возврат на страницу групп
  }

}
