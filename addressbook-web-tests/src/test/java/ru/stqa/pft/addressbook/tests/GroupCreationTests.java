package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage(); //переход на страницу со списком
    app.getGroupHelper().initGroupCreation(); // инициализировать создание новой группы (app обращается к помощнику по группам, а тот вызывает инициализацию создания)
    app.getGroupHelper().fillGroupForm(new GroupData("Енотик", "test2", "test3")); // заполнить поля
    app.getGroupHelper().submitGroupCreation(); // нажать кнопку подтверждения
    app.getGroupHelper().returnToGroupPage(); // возврат на страницу групп
  }

}
