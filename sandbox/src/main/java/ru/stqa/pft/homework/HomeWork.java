package ru.stqa.pft.homework;

public class HomeWork {

    public static void main(String[] args){
        Point p1 = new Point(5,10);
        Point p2 = new Point(8,13);

        System.out.print("Ответ " + p1.distance(p2)); // вызываем метод distance и внутрь прокидываем обьект p2
    }
}
