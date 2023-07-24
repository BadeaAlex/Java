package classW;
import java.util.Scanner;

public class classW {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            String[] names = new String[4];
            int[] grades = new int[4]; 

            System.out.println("--------------------------------");
            System.out.println("Enter the student name");
            System.out.println("--------------------------------");
            names[0] = scan.nextLine();
            System.out.println("Enter the student grade");
            grades[0] = scan.nextInt();
            scan.nextLine();

            System.out.println("--------------------------------");
            System.out.println("Enter the student name");
            System.out.println("--------------------------------");
            names[1] = scan.nextLine();
            System.out.println("Enter the student grade");
            grades[1] = scan.nextInt();
            scan.nextLine();

            System.out.println("--------------------------------");
            System.out.println("Enter the student name");
            System.out.println("--------------------------------");
            names[2] = scan.nextLine();
            System.out.println("Enter the student grade");
            grades[2] = scan.nextInt();
            scan.nextLine();

            System.out.println("--------------------------------");
            System.out.println("Enter the student name");
            System.out.println("--------------------------------");
            names[3] = scan.nextLine();
            System.out.println("Enter the student grade");
            grades[3] = scan.nextInt();
            scan.nextLine();

            for (int i = 0; i < 4; i++) {
                System.out.println("*******Student grade list*******");
                System.out.println(names[i] + " grade is: " + grades[i]);
                System.out.println("*******************************");
            }
        }
    }
}

