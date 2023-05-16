package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String calculate() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return buildView(num1, num2, "+");
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return buildView(num1, num2, "-");
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return buildView(num1, num2, "*");
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return buildView(num1, num2, "/");
    }

    private String buildView(Integer num1, Integer num2, String operation) {
        if (num1 == null || num2 == null) {
            return "Должны быть переданы все параметры";
        }
        Number result;
        switch (operation) {
            case "+":
                result = calculatorService.plus(num1, num2);
                break;
            case "-":
                result = calculatorService.minus(num1, num2);
                break;
            case "*":
                result = calculatorService.multiply(num1, num2);
                break;
            default:
                result = calculatorService.divide(num1, num2);
        }
        return num1 + " " + operation + " " + num2 + " = " + result;


    }
}
