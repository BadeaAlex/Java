import java.util.Scanner;// import scanner class
 
public class demo {
 
    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner (System.in)) {
            System.out.println("Welcome to our travel offers!");
            System.out.println("***For each month of the year we offer 50% discount for the following destinations: ");
            System.out.println(" Type 1 to 12 to find whats waiting for you: ");
            
            
            int month=12;
            
            month=scan.nextInt();
            
            switch (month) {
            
            
            case 1:
                System.out.println("*********************************");
                System.out.println("---Rio de Janeiro--- ");
                System.out.println("*********************************");
                
                break;
            case 2:
                System.out.println("*********************************");
                System.out.println("---London--- ");
                System.out.println("*********************************");
                
                break;
            case 3:
                System.out.println("*********************************");
                System.out.println("---Paris--- ");
                System.out.println("*********************************");
                
                break;
            case 4:
                System.out.println("*********************************");
                System.out.println("---New York--- ");
                System.out.println("*********************************");
                
                break;
            case 5:
                System.out.println("*********************************");
                System.out.println("---Tokyo--- ");
                System.out.println("*********************************");
                
                break;
            case 6:
                System.out.println("*********************************");
                System.out.println("---Sydney--- ");
                System.out.println("*********************************");
                
                break;
            case 7:
                System.out.println("*********************************");
                System.out.println("---Los Angeles--- ");
                System.out.println("*********************************");
                
                break;
            case 8:
                System.out.println("*********************************");
                System.out.println("---Cape Town--- ");
                System.out.println("*********************************");
                
                break;
            case 9:
                System.out.println("*********************************");
                System.out.println("---Madrid--- ");
                System.out.println("*********************************");
                
                break;
            case 10:
                System.out.println("*********************************");
                System.out.println("---Berlin--- ");
                System.out.println("*********************************");
                
                break;
            case 11:
                System.out.println("*********************************");
                System.out.println("---Bucharest--- ");
                System.out.println("*********************************");
                
                break;
                
            default:
                
                System.out.println(" Wrong! Nice try...");
                
            }
        }
        
 
    }
 
}