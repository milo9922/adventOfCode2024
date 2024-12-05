package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DayThreeTest {

    @Test
    void shouldReturnCorrectValueForSingleMulInput() {
        String input = "mul(954,447)";

        long result = DayThree.count(input);

        assertEquals(426438, result);
    }

    @Test
    void shouldCountCorrectSumForSingleMulInputWithinCorruptedData() {
        String input = "^where()~mul(548,799)-<what()m";

        long result = DayThree.count(input);

        assertEquals(437852, result);
    }

    @Test
    void shouldReturnZeroSumForInvalidInput() {
        String input = "70,836why()who()select()#when()select()where()from(812,299)nul(12,33)";

        long result = DayThree.count(input);

        assertEquals(0, result);
    }

    @Test
    void shouldCountCorrectSumForAdventOfCodeFileInput() {
        String input = DayThree.readInputData();

        long result = DayThree.count(input);

        assertEquals(161289189, result);
    }
}
