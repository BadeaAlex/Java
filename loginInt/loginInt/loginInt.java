package loginInt;
import java.util.Scanner;

public class loginInt {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            String user, pass;

            System.out.println("Type your username:");
            user = scan.next();

            System.out.println("Enter your password");
            pass = scan.next();

            if (user.equals("Alex") && pass.equals("Badea")) {
                System.out.println("Welcome to the login system");
            } else {
                System.out.println("Nice try!... but no.");
            }
        }
    }
}