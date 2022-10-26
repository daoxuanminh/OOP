import java.util.Scanner;

public class DisplayTriangle {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Input height of triangle: ");
            int height = input.nextInt();
            // int step = height;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < height + i; j++) {
                    if (j < (height - i - 1)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}
