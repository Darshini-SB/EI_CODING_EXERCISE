package factorymethodpattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the type of notification (email/sms) or 'exit' to quit: ");
            String type = scanner.nextLine();

            if (type.equalsIgnoreCase("exit")) {
                break;
            }

            NotificationFactory factory;

            if (type.equalsIgnoreCase("email")) {
                factory = new EmailNotificationFactory();
            } else if (type.equalsIgnoreCase("sms")) {
                factory = new SMSNotificationFactory();
            } else {
                System.out.println("Unknown notification type.");
                continue;
            }

            factory.notifyUser();
        }

        scanner.close();
    }
}
