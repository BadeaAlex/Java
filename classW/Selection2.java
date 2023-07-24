package classW;

import java.util.Scanner;

public class Selection2 {

public static void main(String[] args) {

    double x=0;

    try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Enter a number (greater than zero): ");

        x = scan.nextInt();
    }

    if (x >= 0 && x <= 5.5){

        System.out.println("Between 0 and 5.5");

    }

    else

        System.out.println("Not between 0 and 5.5");

    }

}

