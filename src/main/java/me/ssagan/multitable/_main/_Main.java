package me.ssagan.multitable._main;

import me.ssagan.multitable.util.Arithmetic;

public class _Main {
    public static void main(String[] args) {
        //Вывести таблицу умножения (для чисел от 2 до 5) в консоль используя циклы в виде:  2 x 2 = 4. (числа должны вычисляться)
        String[] multiplicationTable = Arithmetic.getMultiplicationTable(2, 5);
        for (String equation : multiplicationTable
        ) {
            System.out.println(equation);
        }
    }
}
