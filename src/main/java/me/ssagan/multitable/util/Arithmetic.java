package me.ssagan.multitable.util;

public class Arithmetic {
    public static String[] getMultiplicationTable(int from, int to) {
        int tableLength = (to - from + 1) * (to - from + 1);
        int index = 0;
        String[] multiplicationTable = new String[tableLength];
        for (int multiplier1 = from; multiplier1 <= to; multiplier1++) {
            for (int multiplier2 = from; multiplier2 <= to; multiplier2++) {
                multiplicationTable[index] = multiplier1 + " x " + multiplier2 + " = " + multiplier1 * multiplier2;
                index++;
            }
        }
        return multiplicationTable;
    }
}
