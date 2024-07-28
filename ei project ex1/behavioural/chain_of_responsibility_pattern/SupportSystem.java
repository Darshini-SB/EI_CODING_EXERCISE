import java.util.Scanner;

public class SupportSystem {
    public static void main(String[] args) {
        // Create the handlers
        SupportHandler level1 = new Level1Support();
        SupportHandler level2 = new Level2Support();
        SupportHandler level3 = new Level3Support();

        // Set the chain of responsibility
        level1.setNextHandler(level2);
        level2.setNextHandler(level3);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the description of the support request (or 'exit' to quit): ");
            String description = scanner.nextLine();
            if (description.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter the severity level of the request (1, 2, or 3): ");
            String severityInput = scanner.nextLine();
            int severityLevel;
            try {
                severityLevel = Integer.parseInt(severityInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value for severity level.");
                continue;
            }

            SupportRequest request = new SupportRequest(description, severityLevel);
            level1.handleRequest(request);
        }

        scanner.close();
    }
}
