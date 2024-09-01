import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two float: ");
        float a1 = scanner.nextFloat();
        float b1 = scanner.nextFloat();

        System.out.println("Enter two integer: ");
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        System.out.println("Enter two float: ");
        float a3 = scanner.nextFloat();
        float b3 = scanner.nextFloat();

        if ((b1 * b1 - 2) != 0 && (a1 * a1 + 2) != 0) {
            double res1 = a1 / (b1 * b1 - 2) + b1 / (a1 * a1 + 2) + Math.pow(a1 * b1, 3);
            System.out.println("Result double (float): " + res1);
        } else {
            System.out.println("Error!");
        }

        if ((b2 * b2 - 2) != 0 && (a2 * a2 + 2) != 0) {
            double res2 = (float) a2 / (b2 * b2 - 2) + (float) b2 / (a2 * a2 + 2) + Math.pow(a2 * b2, 3);
            System.out.println("Result double (int): " + res2);
        } else {
            System.out.println("Error!");
        }

        if ((b3 * b3 - 2) != 0 && (a3 * a3 + 2) != 0) {
            int res3 = (int) (a3 / (b3 * b3 - 2) + b3 / (a3 * a3 + 2) + Math.pow(a3 * b3, 3));
            System.out.println("Result int (float): " + res3);
        } else {
            System.out.println("Error!");
        }

        scanner.close();

    }
}
