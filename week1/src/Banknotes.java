import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(n);

        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        for (int nota : notas) {
            int num_notes = n / nota;
            System.out.printf("%d nota(s) de R$ %d,00\n", num_notes, nota);
            n -= num_notes * nota;
        }

    }
}