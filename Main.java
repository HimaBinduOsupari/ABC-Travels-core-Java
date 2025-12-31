import java.util.Scanner;
public class Main {
static Scanner sc = new Scanner(System.in);
 public static void main(String[] args) {
 while (true) {
            System.out.println("\n--- ABC Travels ---");
            System.out.println("1. Register");
            System.out.println("2. Plan Journey");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
   int choice = sc.nextInt();
    switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    planJourney();
                    break;
                case 3:
                    System.out.println("Thank you for using ABC Travels");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
 static void registerUser() {
        sc.nextLine();                     // clear input buffer
        System.out.print("Enter First Name: ");
        String name = sc.nextLine();
        System.out.println("Registration successful for " + name);
    }
 static void planJourney() {
        sc.nextLine();
        System.out.print("Enter Source: ");
        String source = sc.nextLine();
       System.out.print("Enter Destination: ");
        String destination = sc.nextLine();
       System.out.print("Enter Number of Passengers: ");
        int passengers = sc.nextInt();
         int fare = passengers * 500;
        System.out.println("Total Fare: ₹" + fare);
        System.out.println("Journey planned successfully");
    }
}
