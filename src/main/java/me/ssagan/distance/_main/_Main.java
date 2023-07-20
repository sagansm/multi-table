package me.ssagan.distance._main;

import me.ssagan.distance.model.Point;
import me.ssagan.distance.util.Geometry;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        //Ввести с клавиатуры координаты первой точки A (x1, y1) и координаты второй точки B (x2, y2).
        // (т.е. с клавиатуры было введено 4 числа, по 2 на каждую точку).
        // Вычислить и вывести в консоль длину отрезка AB на плоскости.
        System.out.println("Введите координаты точки A");
        Scanner sc = new Scanner(System.in);
        Point a = new Point(sc.nextInt(), sc.nextInt());
        System.out.println("Введите координаты точки B");
        Point b = new Point(sc.nextInt(), sc.nextInt());
        System.out.println("Расстояние между точками A" + a.toString() + " и B" + b.toString() + " равно " + Geometry.getDistance(a, b));
    }
}
