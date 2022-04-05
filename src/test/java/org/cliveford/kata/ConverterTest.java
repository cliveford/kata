package org.cliveford.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConverterTest {

    @Test
    void checkThat1ConvertsToI() {
        // arrange
        int input = 1;
        String expected = "I";
        // act
        String result = Converter.convertNumberToNumeral(input);
        // assert
        assertEquals(expected, result);
    }

    @Test
    void checkThat34ConvertsToXXXIV() {
        // arrange
        int input = 34;
        String expected = "XXXIV";
        // act
        String result = Converter.convertNumberToNumeral(input);
        // assert
        assertEquals(expected, result);
    }

    @Test
    void checkThat183ConvertsToCLXXXIII() {
        // arrange
        int input = 183;
        String expected = "CLXXXIII";
        // act
        String result = Converter.convertNumberToNumeral(input);
        // assert
        assertEquals(expected, result);
    }

    @Test
    void checkThat556ConvertsToDLVI() {
        // arrange
        int input = 556;
        String expected = "DLVI";
        // act
        String result = Converter.convertNumberToNumeral(input);
        // assert
        assertEquals(expected, result);
    }

    @Test
    void checkThat1589ConvertsToMDLXXXIX() {
        // arrange
        int input = 1589;
        String expected = "MDLXXXIX";
        // act
        String result = Converter.convertNumberToNumeral(input);
        // assert
        assertEquals(expected, result);
    }


}