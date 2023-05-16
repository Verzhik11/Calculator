package com.example.calculator.service;

import com.example.calculator.exception.Num2IsNullException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    private final CalculatorService out = new CalculatorService();
    int num1 = 6;
    int num2 = 5;


    @Test
    void plus() {
        assertEquals(num1 + num2, out.plus(num1, num2));
    }

    @Test
    void minus() {
        assertEquals(num1 - num2, out.minus(num1, num2));
    }

    @Test
    void multiply() {
        assertEquals(num1 * num2, out.multiply(num1, num2));
    }

    @Test
    void divide() {
        assertEquals((double) num1 / num2, out.divide(num1, num2));
    }

    @Test
    void checkDivideNull() {
        Num2IsNullException thrown =  assertThrows(Num2IsNullException.class,
                () -> {throw new Num2IsNullException("На ноль делить нельзя");
        });
        assertEquals("На ноль делить нельзя", thrown.getMessage());
    }
}