import java.util.Scanner;

public class Level3Support extends SupportHandler {
    @Override
    public void handleRequest(SupportRequest request) {
        System.out.println("Level 3 support handled request: " + request.getDescription());
        if (!confirmHandling()) {
            escalate(request);
        }
    }

    private boolean confirmHandling() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Was the issue resolved by Level 3 support? (yes/no): ");
        String response = scanner.nextLine();
        return response.equalsIgnoreCase("yes");
    }

    private void escalate(SupportRequest request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No further escalation possible. Issue remains unresolved.");
        }
    }
}
