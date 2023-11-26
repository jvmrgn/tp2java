package org.example.package1;

import lombok.Getter;

public class MathUtils {
    @Getter
    private int result;

    public void add(int a, int b) {
        result = a + b;
            if (result < 10) {
                System.out.println("é menor que 10");
            }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}

