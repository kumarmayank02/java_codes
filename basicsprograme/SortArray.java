import java.util.Arrays;
import java.util.Scanner;

class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Taking input for array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting the array
        Arrays.sort(arr);

        // Displaying the sorted array
        System.out.println("Sorted array in ascending order: " + Arrays.toString(arr));

        sc.close();
    }
}
