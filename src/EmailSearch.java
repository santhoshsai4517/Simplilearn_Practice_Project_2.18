import java.util.ArrayList;
import java.util.Scanner;

public class EmailSearch {
    public static void main(String[] args) {
        ArrayList<String> emailIds = new ArrayList<>();
        emailIds.add("employee1@example.com");
        emailIds.add("employee2@example.com");
        emailIds.add("employee3@example.com");
        emailIds.add("employee4@example.com");
        emailIds.add("employee5@example.com");

        Scanner scanner = new Scanner(System.in);
        String searchEmail;

        while (true) {
            System.out.print("Enter the email ID to search (press 'q' to quit): ");
            searchEmail = scanner.nextLine();

            if (searchEmail.equalsIgnoreCase("q")) {
            	scanner.close();
                break;
            }

            boolean isValid = isValidEmail(searchEmail);

            if (isValid) {
                boolean found = emailIds.contains(searchEmail);

                if (found) {
                    System.out.println("Email ID found!");
                } else {
                    System.out.println("Email ID not found!");
                }
            } else {
                System.out.println("Invalid email format!");
            }
        }
    }

    private static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(regex);
    }
}