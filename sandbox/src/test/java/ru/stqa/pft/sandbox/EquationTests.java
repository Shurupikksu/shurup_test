package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquationTests {

    @Test
    public void test0() { // для проверки 0 решений
        Equation e = new Equation(1,1,1);

        Assert.assertEquals(e.rootNumber(), 0);

    }

    @Test
    public void test1() { // для проверки 1 решения
        Equation e = new Equation(1,2,1);

        Assert.assertEquals(e.rootNumber(), 1);

    }

    @Test
    public void test2() { // для проверки 2 решеий
        Equation e = new Equation(1,5,6);

        Assert.assertEquals(e.rootNumber(), 2);

    }

}
