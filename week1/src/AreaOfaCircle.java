import java.util.Scanner;
public class AreaOfaCircle {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        double R;
        double n = 3.14159;
        R = scanner.nextDouble();
        double A = n * R * R;
        System.out.printf("A=%.4f%n", A);

        scanner.close();
    }

}