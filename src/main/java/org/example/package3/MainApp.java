package org.example.package3;

import org.example.package1.MathUtils;
import org.example.package2.StringUtils;

public class MainApp {
    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();
        mathUtils.add(10, 5);
        System.out.println("Resultado da adição: " + mathUtils.getResult());

        StringUtils stringUtils = new StringUtils();
        stringUtils.concatenate("Hello, ", "World!");
        System.out.println("String concatenada: " + stringUtils.getResult());
    }
}
