package com.mycompany.app;

import java.util.Arrays;

public class ConvertDigits0To99 {
    /**
     * Convert the digits from 0 to 99 into letters
     * @param args
     */
    public static void main(String[] args) {
        for (int i1 = 0; i1 <= 99; i1++) {
            char[] chars = ("" + i1).toCharArray();
            Integer[] numbers = new Integer[chars.length];
            for (int i2 = 0; i2 < chars.length; i2++) {
                numbers[i2] = Integer.parseInt(Character.toString(chars[i2]));
            }

            System.out.print(Arrays.toString(numbers));
            System.out.print("\t");
            System.out.print(App.possibleLetterCombinations(numbers));
            System.out.print("\n");
        }
    }
}
