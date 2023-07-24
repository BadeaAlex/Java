import java.util.Scanner;

public class loginInt2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int optionAvailable;
            do {
                System.out.println("Press 1 for Login");
                System.out.println("Press 2 for Registrations");
                System.out.println("Press 3 to Exit");
                System.out.print("Selected option: ");
                optionAvailable = scanner.nextInt();

                if (optionAvailable == 1) {
                    System.out.println("Login on the way\n");
                } else if (optionAvailable == 2) {
                    System.out.println("Registration processing\n");
                }
            } while (optionAvailable != 3);
        }

        System.out.println("Hope you enjoyed my application");
    }
}
