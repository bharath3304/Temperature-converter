import java.util.Scanner;
class TemperatureConverter {

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double c) {
        return c + 273.15;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double kelvinToCelsius(double k) {
        return k - 273.15;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double input, result;

        System.out.println("=== Temperature Converter ===");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Kelvin to Celsius");
        System.out.print("Enter your choice (1-4): ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                input = sc.nextDouble();
                result = celsiusToFahrenheit(input);
                System.out.println("Fahrenheit: " + result);
                break;

            case 2:
                System.out.print("Enter temperature in Celsius: ");
                input = sc.nextDouble();
                result = celsiusToKelvin(input);
                System.out.println("Kelvin: " + result);
                break;

            case 3:
                System.out.print("Enter temperature in Fahrenheit: ");
                input = sc.nextDouble();
                result = fahrenheitToCelsius(input);
                System.out.println("Celsius: " + result);
                break;

            case 4:
                System.out.print("Enter temperature in Kelvin: ");
                input = sc.nextDouble();
                result = kelvinToCelsius(input);
                System.out.println("Celsius: " + result);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
