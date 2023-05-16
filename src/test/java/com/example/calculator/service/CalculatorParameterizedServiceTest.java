package com.example.calculator.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.IntStream;
import java.util.stream.Stream;


class CalculatorParameterizedServiceTest {
    private final CalculatorService out = new CalculatorService();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void plusTest() {

    }

    @Test
    void minus() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }

    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(5, 5, 10),
                Arguments.of(-5, 5, 0)
        );
    }
}