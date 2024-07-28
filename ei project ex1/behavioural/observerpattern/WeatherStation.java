import java.util.Scanner;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter temperature (or 'exit' to quit): ");
            String tempInput = scanner.nextLine();
            if (tempInput.equalsIgnoreCase("exit")) {
                break;
            }
            
            System.out.println("Enter humidity: ");
            String humidityInput = scanner.nextLine();

            System.out.println("Enter pressure: ");
            String pressureInput = scanner.nextLine();

            try {
                float temperature = Float.parseFloat(tempInput);
                float humidity = Float.parseFloat(humidityInput);
                float pressure = Float.parseFloat(pressureInput);

                weatherData.setMeasurements(temperature, humidity, pressure);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numeric values.");
            }
        }

        scanner.close();
    }
}
