package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBase { // теперь этот класс перед каждым тестом инициализирует обьект app типа ApplicationManager, запускает и в конце останавливает

    protected final ApplicationManager app = new ApplicationManager(); // ссылка на applicationManager

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        app.init(); // тут вызываются методы в обьекте типа ApplicationManager для подключения драйвера и логина

    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop(); // для выхода
    }

}
