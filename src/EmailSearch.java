import java.util.Arrays;
import java.util.Scanner;

public class EmailSearch {
    public static void main(String[] args) {
        String[] emailIds = {
                "employee1@example.com",
                "employee2@example.com",
                "employee3@example.com",
                "employee4@example.com",
                "employee5@example.com"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the email ID to search: ");
        String searchEmail = scanner.nextLine();

        boolean found = false;

        for (String emailId : emailIds) {
            if (emailId.equals(searchEmail)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Email ID found!");
        } else {
            System.out.println("Email ID not found!");
        }
    }
}