package org.cliveford.kata;

public class Converter {

    public static String convertNumberToNumeral(int number) {

        // set up arrays
        final int[] VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] NUMERALS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String romanNumeral = "";

        // loop through length of values
        for (int valueIndex = 0; valueIndex < VALUES.length; valueIndex++) {
            // loop through values while input number >= value -- starting at 1000
            while (number >= VALUES[valueIndex]) {
                // concatenate roman numeral to romanNumeral String
                romanNumeral += NUMERALS[valueIndex];
                // reassign number - subtract current value
                number -= VALUES[valueIndex];
            }
        }
        return romanNumeral;
    }
}
