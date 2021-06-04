package com.spr.sprart;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class testTempConvert {
    @Test
    public void testTempConversion() throws Throwable {

        TemperatureController underTest = new TemperatureController();
        double temperature = 22.0;
        String unit = "F";
        double result = underTest.GetTemperature(temperature, unit);
        assertEquals(-5.555555555555555, result, "Test result failed");

    }

}