package at.technikum.slmbbcalcapi.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    @Test
    void addTwoPositiveIntegers() {
        // Arrange
        CalculatorController controller =
                new CalculatorController();
        int a = 5;
        int b = 2;

        // Act
        int result = controller.add(a, b);

        // Assert
        assertEquals(7, result);
    }

    @Test
    void addTwoNegativeIntegers() {
        CalculatorController controller =
                new CalculatorController();
        int a = -15;
        int b = -5;

        int result = controller.add(a, b);

        assertEquals(-20, result);
    }

    @Test
    void addOnePositiveAndOneNegativeInteger() {
        CalculatorController controller =
                new CalculatorController();
        int a = 7;
        int b = -5;

        int result = controller.add(a, b);

        assertEquals(2, result);
    }
}