package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.homework.Point;

public class PointTests {

    @Test
    public void TestDistance(){
        Point p1 = new Point(5,10);
        Point p2 = new Point(8,13);
        Assert.assertEquals(p1.distance(p2), 4.242640687119285);
    }
}
