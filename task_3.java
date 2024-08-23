import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[] X = new int[n];
        System.out.println("A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = scanner.nextInt();
            }
        }
        int k1 = 0;
        int k2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] < 0) {
                    k1++;
                }
                if (B[i][j] < 0) {
                    k2++;
                }

            }
            if (k1 == k2) {
                X[i] = 1;
            } else {
                X[i] = 0;
            }
            k1 = 0;
            k2 = 0;
        }

        System.out.println("X:");
        for (int i : X) {
            System.out.println(X[i]);
        }
        scanner.close();
    }
}
