package com.spr.sprart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SprArtApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
    public void testTempConversion() throws Throwable {

        TemperatureController underTest = new TemperatureController();
        double temperature = 27.0;
        String unit = "";
        double result = underTest.GetTemperature(temperature, unit);
        assertEquals(80.6, result, "Test result failed");

    }

	@Test
    public void testNumCompare() throws Throwable {

        TemperatureController underTest = new TemperatureController();
        //assertEquals(3, underTest.CompareNumbers(3, 5));
        assertEquals(7, underTest.CompareNumbers(3, 7), "Test failed...");

    }

}
