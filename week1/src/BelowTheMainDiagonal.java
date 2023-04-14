
import java.util.Scanner;

public class BelowTheMainDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char operation = sc.next().charAt(0);
        double[][] matrix = new double[12][12];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        double sum = 0;
        int count = 0;
        for (int i = 1; i < 12; i++) {
            for (int j = 0; j < i; j++) {
                sum += matrix[i][j];
                count++;
            }
        }

        if (operation == 'S') {
            System.out.printf("%.1f\n", sum);
        } else {
            double avg = sum / count;
            System.out.printf("%.1f\n", avg);
        }

        sc.close();
    }
}