import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maxUnique = Integer.MIN_VALUE;
        boolean hasUnique = false;

        for (int i = 0; i < numbers.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                if (numbers[i] > maxUnique) {
                    maxUnique = numbers[i];
                }
                hasUnique = true;
            }
        }

        if (hasUnique) {
            System.out.println("Max unique value is " + maxUnique);
        } else {
            System.out.println("No unique values in the array.");
        }

        scanner.close();
    }
}
