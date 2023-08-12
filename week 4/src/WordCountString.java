import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCountString {
    public static int countOccurrencesMethod1(String input, String word) {
        int count = (input.length() - input.replace(word, "").length()) / word.length();
        return count;
    }

    public static int countOccurrencesMethod2(String input, String word) {
        int count = 0;
        for (int i = 0; i < input.length(); ) {
            int index = input.indexOf(word, i);
            if (index != -1) {
                count++;
                i = index + word.length();
            } else {
                break;
            }
        }
        return count;
    }

    public static int countOccurrencesMethod3(String input, String word) {
        int count = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(input);
        while (stringTokenizer.hasMoreTokens()) {
            if (stringTokenizer.nextToken().equals(word)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter a word to count: ");
        String word = scanner.next();

        int count1 = countOccurrencesMethod1(input, word);
        System.out.println("Method 1 - Count of " + word + " is: " + count1);

        int count2 = countOccurrencesMethod2(input, word);
        System.out.println("Method 2 - Count of " + word + " is: " + count2);

        int count3 = countOccurrencesMethod3(input, word);
        System.out.println("Method 3 - Count of " + word + " is: " + count3);
    }
}
