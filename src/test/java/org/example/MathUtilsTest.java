package org.example;

import org.example.package1.MathUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testAdd() {
        MathUtils mathUtils = new MathUtils();

        mathUtils.add(10, 5);

        Assertions.assertEquals(15, mathUtils.getResult());
    }

    @Test
    public void testAddResultLessThanTen() {
        MathUtils mathUtils = new MathUtils();

        mathUtils.add(1, 2);

        Assertions.assertEquals(3, mathUtils.getResult());
    }
}
