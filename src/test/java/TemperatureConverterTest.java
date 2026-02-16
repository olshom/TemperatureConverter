import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void fahrenheitToCelsius() {
        assertEquals(0, TemperatureConverter.fahrenheitToCelsius(32));
    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(32, TemperatureConverter.celsiusToFahrenheit(0));
    }

    @Test
    void isExtremeTemperature() {
        assertTrue(TemperatureConverter.isExtremeTemperature(-100));
        assertTrue(TemperatureConverter.isExtremeTemperature(60));
        assertFalse(TemperatureConverter.isExtremeTemperature(10));
    }

    @Test
    void kelvinToCelsius() {
        assertEquals(- 273.15, TemperatureConverter.kelvinToCelsius(0));
    }
}