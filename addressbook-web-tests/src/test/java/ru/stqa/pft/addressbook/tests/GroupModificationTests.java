package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase { // тут еще выполняется логин в базовом классе

    @Test
    public void testGroupModificationTests() {
        app.getNavigationHelper().gotoGroupPage(); //переход на страницу со списком групп
        app.getGroupHelper().selectGroup(); // выбор группы
        app.getGroupHelper().initGroupModification(); // нажатие кнопки изменить
        app.getGroupHelper().fillGroupForm(new GroupData("Енотик", "test2", "test3")); // заполнить поля
        app.getGroupHelper().submitGroupModification(); // подтверждение изменений
        app.getGroupHelper().returnToGroupPage(); // возврат на список
    }
}
