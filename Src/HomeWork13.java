import java.util.Random;
import java.util.Scanner;

public class HomeWork13 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введіть розмір матриці M ");
        int m = scanner.nextInt();

        System.out.println("Введіть розмір матриці N ");
        int n = scanner.nextInt();

        int[][] mas = new int[m][n];

        System.out.println("Матриця MxN:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = random.nextInt(10);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Матриця NxM:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
