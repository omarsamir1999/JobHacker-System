import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(n);

        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        for (int nota : notas) {
            int qtd_notas = n / nota;
            System.out.printf("%d nota(s) de R$ %d,00\n", qtd_notas, nota);
            n -= qtd_notas * nota;
        }

    }
}