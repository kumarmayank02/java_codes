import java.util.Scanner;
public class ParkingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalAmount = 0;
        int choice;
            choice = sc.nextInt();

            // Condition check
            if (choice == 1) {
                totalAmount += 10;
                System.out.println("Cycle parked successfully. Charge: ₹10");
            } else if (choice == 2) {
                totalAmount += 20;
                System.out.println("Motorbike parked successfully. Charge: ₹20");
            } else if (choice == 3) {
                totalAmount += 50;
                System.out.println("Car parked successfully. Charge: ₹50");
            } else if (choice == 4) {
                System.out.println("Exiting the system. Thank you!");
              
            } else if (choice == 5) {
                System.out.println("Total Amount Collected: ₹" + totalAmount);
            } else {
                System.out.println("Enter a valid choice!"); // Invalid input
            }
        
 
    }
}
