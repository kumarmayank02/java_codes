import java.util.Scanner;

class Armstrong1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Taking input from the user for the range
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

    //  Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = 0;

        //  Counting the number of digits
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits); // Summing (digit^digits)
            temp /= 10;
        }

        return sum == num;
    }
}
