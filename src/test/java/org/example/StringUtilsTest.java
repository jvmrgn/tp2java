package org.example;

import org.example.package2.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testConcatenate() {
        StringUtils stringUtils = new StringUtils();

        stringUtils.concatenate("Hello, ", "World!");

        Assertions.assertEquals("Hello, World!", stringUtils.getResult());
    }

    @Test
    public void testConcatenate2() {
        StringUtils stringUtils = new StringUtils();

        stringUtils.concatenate("Teste, ", "Concatenação!");

        Assertions.assertEquals("Teste, Concatenação!", stringUtils.getResult());
    }
}
