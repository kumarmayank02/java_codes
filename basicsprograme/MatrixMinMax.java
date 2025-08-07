import java.util.Scanner;
class MatrixMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for matrix size
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");

        // Taking input and initializing min/max
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] < min) min = matrix[i][j];  // Finding min
                if (matrix[i][j] > max) max = matrix[i][j];  // Finding max
            }
        }

        // Displaying results
        System.out.println("Smallest number in the matrix: " + min);
        System.out.println("Biggest number in the matrix: " + max);

        sc.close();
    }
}
