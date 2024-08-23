import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextInt();
        float b = scanner.nextInt();
        double res = a / (b * b - 2) + b / (a * a + 2) + Math.pow(a * b, 3);
        System.out.println(res);
        scanner.close();
    }
}
