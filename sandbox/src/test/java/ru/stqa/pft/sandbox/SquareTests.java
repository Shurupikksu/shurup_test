package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SquareTests {


    @Test
    public void TestArea() {
        Square s = new Square(5); // создаем обьект и задаем сторону 5
        Assert.assertEquals(s.area(),25.0); // проверяем вычисляемое значение и ожидаемое
    }
}
