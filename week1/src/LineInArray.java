
import java.util.Scanner;

public class LineInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int line = sc.nextInt();
        char op = sc.next().charAt(0);

        double[][] matrix = new double[12][12];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        double sum = 0.0;

        for (int j = 0; j < 12; j++) {
            sum += matrix[line][j];
        }

        if (op == 'M') {
            sum /= 12.0;
        }

        System.out.printf("%.1f\n", sum);
    }
}