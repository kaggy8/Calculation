package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculationTest {

    @BeforeAll
    public static void setUp() {
        System.out.println("Before all");
    }

    @BeforeEach
    public void setUpEach() {
    System.out.println("Before each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After each");
    }

    @ParameterizedTest(name = "#{index} - cложение {0} и {1} даёт {2}.")
    @DisplayName("Проверка сложения")
    @CsvSource({"1, 2 ,3", "5, 5, 10", "6, 3454, 3460"})
    @Tag("Sum")
    void sum(int a, int b, int expectedResult) {
        Calculation calc = new Calculation();
        int result = calc.sum(a, b);
        Assertions.assertEquals(expectedResult, result, "Метод сложения не верен.");
    }

    @ParameterizedTest(name = "#{index} - разница {0} и {1} даёт {2}.")
    @DisplayName("Проверка вычитания")
    @CsvSource({"5, 2 ,3", "545, 5, 540", "4324, 3454, 870"})
    @Tag("Sub")
    void sub(int a, int b, int expectedResult) {
        Calculation calc = new Calculation();
        int result = calc.sub(a, b);
        Assertions.assertEquals(expectedResult, result, "Метод вычитания не верен.");
    }
}