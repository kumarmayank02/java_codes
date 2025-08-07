import java.util.Scanner; // Scanner class import for user input

public class Arm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object to take user input

        // Taking range input from the user
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers from " + start + " to " + end + ":");

        // Looping through the given range
        for (int i = start; i <= end; i++) {
            int n = i, sum = 0; // Initialize number and sum variable

            // Extracting each digit and calculating the sum of their cubes
            while (n > 0) {
                int digit = n % 10; // Extract last digit
                sum += (digit * digit * digit); // Add cube of the digit to sum
                n /= 10; // Remove last digit from the number
            }

            // If sum is equal to the original number, it is an Armstrong number
            if (sum == i) {
                System.out.print(i + " "); // Print Armstrong number
            }
        }

        sc.close(); // Close scanner object to prevent memory leak
    }
}
