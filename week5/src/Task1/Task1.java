package Task1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 ;
        int num2 ;

        while (true) {
            try {
                System.out.print("Enter the first number :");
                num1 = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter number");
                input.next();
            }
        }

        while (true) {
            try {
                System.out.print("Enter the second number: ");
                num2 = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter number");
                input.next();
            }
        }

        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
}