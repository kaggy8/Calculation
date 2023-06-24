package org.example;

public class Calculation {
    public int sum(int a, int b) {
        int result;
        result = a + b;
        System.out.printf("Сумма %d и %d равна %d\n", a, b, result);

        return result;
    }

    public int sub(int a, int b) {
        int result;
        result = a - b;
        System.out.printf("Разница %d и %d равна %d\n", a, b, result);

        return result;
    }
}
