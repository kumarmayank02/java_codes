import java.util.Scanner;

public class BinaryConversionUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option: ");
        System.out.println("1. Convert Decimal to Binary");
        System.out.println("2. Convert Binary to Decimal");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter a decimal number: ");
            int num = sc.nextInt();
            String binary = Integer.toBinaryString(num);
            System.out.println("Binary form: " + binary);
        } else if (choice == 2) {
            System.out.print("Enter a binary number: ");
            String bin = sc.next();
            int decimal = Integer.parseInt(bin, 2);
            System.out.println("Decimal form: " + decimal);
        } else {
            System.out.println("Invalid choice!");
        }
        
        sc.close();
    }
}
