package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"includesBothBorders, 100, 9801, 90",
            "includesTopBorderAndLessNumber, 9000, 9801, 5",
            "includesTopBorderAndAboveNumber, 9801, 10000, 1",
            "includesBottomBorderAndAboveNumber, 100, 300, 8",
            "includesBottomBorderAndLessNumber, 1, 100, 1",
            "lessThanBottomBorder, 1, 99, 0",
            "moreThanTopBorder, 9802, 9999, 0",
            "fromIsMoreThanTo, 1200, 200, 0",
            "betweenBorders, 200, 300, 3"})
    void squareAmountTest(String testName, int from, int to, int expected) {
        SQRService prompt = new SQRService();
        int actual = prompt.squareAmount(from, to);
        assertEquals(expected, actual);
    }
}