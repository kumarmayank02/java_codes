import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the units consumed: ");
        int units = sc.nextInt();
        double bill = 0;

        if (units > 500) {
            bill += (units - 500) * 10;
            units = 500;
        }
        if (units > 300) {
            bill += (units - 300) * 7;
            units = 300;
        }
        if (units > 100) {
            bill += (units - 100) * 5;
            units = 100;
        }
        bill += units * 3;

        System.out.println("Total Bill Amount: ₹" + bill);
        sc.close();
    }
}
