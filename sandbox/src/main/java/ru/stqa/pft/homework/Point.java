package ru.stqa.pft.homework;

public class Point {

    public double x; // координата x
    public double y; // координата y

        public Point(double x, double y){ // конструктор
            this.x = x;
            this.y = y;
        }

    public double distance(Point p1){ // делаем функцию distance и в параметрах указываем объект p1 класса Point
            double a = Math.pow((this.x - p1.x), 2);
            double b = Math.pow((this.y - p1.y), 2);
            double c = Math.sqrt(a + b);
            return c;
    }

}
