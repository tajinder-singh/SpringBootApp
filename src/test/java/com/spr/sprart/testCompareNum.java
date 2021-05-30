package com.spr.sprart;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class testCompareNum {
    @Test
    public void testNumCompare() throws Throwable {

        TemperatureController underTest = new TemperatureController();
        assertEquals(3, underTest.CompareNumbers(3, 5));

    }

}