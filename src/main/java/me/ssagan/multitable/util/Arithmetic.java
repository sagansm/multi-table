package me.ssagan.multitable.util;

public class Arithmetic {
    public static String[] getMultiplicationTable(int from, int to) {
        int l = (to - from + 1) * (to - from + 1);
        int ind = 0;
        String[] multiplicationTable = new String[l];
        for (int i = from; i <= to; i++) {
            for (int j = from; j <= to; j++) {
                multiplicationTable[ind] = i + " x " + j + " = " + i * j;
                ind++;
            }
        }
        return multiplicationTable;
    }
}
