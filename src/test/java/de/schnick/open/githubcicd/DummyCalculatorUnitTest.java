package de.schnick.open.githubcicd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DummyCalculatorUnitTest {

    private final DummyCalculator dummyCalculator = new DummyCalculator();

    @Test()
    void additionDoesThrowException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> dummyCalculator.addition(-1, 0));

        Assertions.assertThrows(IllegalArgumentException.class, () -> dummyCalculator.addition(0, -1));
    }

    @Test
    void additionDoesReturnCorrectValue() {
        int a = 0;
        int b = 42;

        int expected = 42;
        int actual = dummyCalculator.addition(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void multiplicationDoesThrowException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> dummyCalculator.multiplication(-1, 0));

        Assertions.assertThrows(IllegalArgumentException.class, () -> dummyCalculator.multiplication(0, -1));
    }

    @Test
    void multiplicationReturnCorrectValue() {
        int a = 0;
        int b = 42;

        int expected = 0;
        int actual = dummyCalculator.multiplication(a, b);
        assertEquals(expected, actual);
    }
}