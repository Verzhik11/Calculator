package com.example.calculator.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.IntStream;
import java.util.stream.Stream;


class CalculatorParameterizedServiceTest {
    private final CalculatorService out = new CalculatorService();

    @ParameterizedTest
    @MethodSource("provideParamsForTestPlus")
    void plusTest(int num1, int num2, int expected) {
        Assertions.assertEquals(expected, out.plus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestMinus")
    void minusTest(int num1, int num2, int expected) {
        Assertions.assertEquals(expected, out.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestMultiply")
    void multiply(int num1, int num2, int expected) {
        Assertions.assertEquals(expected, out.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestDivide")
    void divide(int num1, int num2, double expected) {
        Assertions.assertEquals(expected, out.divide(num1, num2));
    }

    public static Stream<Arguments> provideParamsForTestPlus() {
        return Stream.of(
                Arguments.of(5, 5, 10),
                Arguments.of(-5, 5, 0)
        );
    }
    public static Stream<Arguments> provideParamsForTestMinus() {
        return Stream.of(
                Arguments.of(5, 5, 0),
                Arguments.of(-5, 5, -10)
        );
    }

    public static Stream<Arguments> provideParamsForTestMultiply() {
        return Stream.of(
                Arguments.of(5, 5, 25),
                Arguments.of(-5, 5, -25)
        );
    }
    public static Stream<Arguments> provideParamsForTestDivide() {
        return Stream.of(
                Arguments.of(5, 5, 1),
                Arguments.of(-5, 2, -2.5)
        );
    }
}