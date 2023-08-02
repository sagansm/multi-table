package me.ssagan.multitable.util;

public class Arithmetic {
    public static String[] getMultiplicationTable(int from, int to) {
        int tableLength = (to - from + 1) * (to - from + 1);
        int ind = 0;
        String[] multiplicationTable = new String[tableLength];
        for (int miltiplier1 = from; miltiplier1 <= to; miltiplier1++) {
            for (int multiplier2 = from; multiplier2 <= to; multiplier2++) {
                multiplicationTable[ind] = miltiplier1 + " x " + multiplier2 + " = " + miltiplier1 * multiplier2;
                ind++;
            }
        }
        return multiplicationTable;
    }
}
