import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input range from the user
        System.out.print("Enter start range: ");
        int start = sc.nextInt();
        System.out.print("Enter end range: ");
        int end = sc.nextInt();
        sc.close();

        System.out.println("Armstrong numbers from " + start + " to " + end + ":");

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = 0;

        // Count the number of digits
        int n = num;
        while (n > 0) {
            digits++;
            n /= 10;
        }

        // Calculate sum of each digit raised to the power of total digits
        n = num;
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        return sum == num;
    }
}
