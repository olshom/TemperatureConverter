import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Kelvin to Celsius");
        String i = scanner.nextLine();
        if (i.equals("1")){
            double fahrenheits = Double.parseDouble((scanner.nextLine()));
            double celsius = TemperatureConverter.fahrenheitToCelsius(fahrenheits);
            System.out.println("Fahrenheit to Celsius: " + celsius);
        } else if (i.equals("2")) {
            double celsius = Double.parseDouble((scanner.nextLine()));
            double farenheits = TemperatureConverter.celsiusToFahrenheit(celsius);
            System.out.println("Celsius to Fahrenheit: " + farenheits);
        } else if (i.equals("3")) {
            double kelvin = Double.parseDouble((scanner.nextLine()));
            double celsius = TemperatureConverter.kelvinToCelsius(kelvin);
            System.out.println("Kelvin to Celsius: " + celsius);
        }
    }
}
