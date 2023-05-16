package com.example.calculator.service;

import com.example.calculator.exception.Num2IsNullException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(int num1, int num2) {
        checkDivideNull(num2);
        return (double)num1 / num2;
    }
    public void checkDivideNull (int num2) {
        if (num2 == 0) {
            throw new Num2IsNullException("На ноль делить нельзя");
        }
    }
}
