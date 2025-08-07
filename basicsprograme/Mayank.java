import java.util.Scanner;

public class Mayank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ✅ Taking input from the user for the range
        System.out.print("Enter the lower limit: ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper limit: ");
        int upper = sc.nextInt();

        System.out.println("Armstrong numbers from " + lower + " to " + upper + ":");

        // Looping through the given range to find Armstrong numbers
        for (int i = lower; i <= upper; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

    // ✅ Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = 0;

        // 🔹 Counting the number of digits
        int temp2 = num; // Creating another copy for digit count
        while (temp2 > 0) {
            temp2 /= 10;
            digits++;
        }

        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += power(digit, digits); // ✅ Using our own power function
            temp /= 10;
        }

        return sum == num;
    }

    // ✅ Custom function to calculate power (to avoid Math.pow() floating point issues)
    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base; // Multiplying base 'exp' times
        }
        return result;
    }
}