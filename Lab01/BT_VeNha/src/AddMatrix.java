import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        int row, column;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of matrix!");
        System.out.print("Enter row: ");
        row = input.nextInt();
        System.out.print("Enter column: ");
        column = input.nextInt();
        int a[][] = new int[row][column];
        int b[][] = new int[row][column];
        int result[][] = new int[row][column];
        // input a matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("A[%d][%d]: ", i, j);
                a[i][j] = input.nextInt();
            }
        }
        // input b matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("B[%d][%d]: ", i, j);
                b[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        // Printf result
        System.out.println("Result: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
