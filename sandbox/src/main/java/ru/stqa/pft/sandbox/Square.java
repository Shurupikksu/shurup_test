package ru.stqa.pft.sandbox;

public class Square {

    public double l; // квадрат описывается длинной его стороны - это аттрибут

        public Square(double l) { // конструктор
            this.l = l; // первая l - аттрибут, вторая l - переменная, обьявленная как аргумент функции
        }

    public double area() {
        return this.l * this.l;
    }


}


