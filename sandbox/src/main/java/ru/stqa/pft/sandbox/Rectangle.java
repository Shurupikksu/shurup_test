package ru.stqa.pft.sandbox;

public class Rectangle {

    public double a; // сторона1 аттрибут
    public double b; // сторона2 аттрибут

        public Rectangle(double a, double b){
            this.a = a;
            this.b = b;
        }


    public double area () {
        return this.a * this.b;

    }

}
