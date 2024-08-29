import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the symbol: ");
        char searchChar = scanner.next().charAt(0);
        scanner.nextLine();

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        String[] words = text.split("[\\s,!.?;:]+");

        int maxFrequency = 0;
        String[] resultWords = new String[words.length];
        int resultIndex = 0;

        for (String word : words) {
            int frequency = countCharFrequency(word, searchChar);

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                resultIndex = 0;
                resultWords[resultIndex++] = word;
            } else if (frequency == maxFrequency) {
                resultWords[resultIndex++] = word;
            }
        }

        System.out.println("Words with the maximum frequency of '" + searchChar + "':");
        for (int i = 0; i < resultIndex; i++) {
            System.out.println(resultWords[i]);
        }

        scanner.close();
    }

    private static int countCharFrequency(String word, char searchChar) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (c == searchChar) {
                count++;
            }
        }
        return count;
    }
}
