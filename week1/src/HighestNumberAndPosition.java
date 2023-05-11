import java.util.Scanner;

public class HighestNumberAndPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int highestNumber = Integer.MIN_VALUE;
        int highestPosition = -1;

        for (int i = 0; i < 100; i++) {
            int number = scanner.nextInt();
            if (number > highestNumber) {
                highestNumber = number;
                highestPosition = i + 1;
            }
        }

        System.out.println(highestNumber);
        System.out.println(highestPosition);
    }
}