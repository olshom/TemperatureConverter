public class TemperatureConverter {
    public static double fahrenheitToCelsius(double fahrenheits){
        return (fahrenheits - 32) * 5 / 9;
    }
    public static double celsiusToFahrenheit(double celsius){
        return celsius * 9 / 5 + 32;
    }
    public static boolean isExtremeTemperature(double celsius){
        return celsius<-40||celsius>50;
    }
    public static double kelvinToCelsius(double kelvins) {
        return kelvins - 273.15;
    }
}
