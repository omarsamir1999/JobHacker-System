import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString  = scanner.nextLine();
        String reversedStr = "";

        for (int i = inputString .length() - 1; i >= 0; i--) {
            reversedStr += inputString.charAt(i);
        }

        System.out.println("Reversed string: " + reversedStr);
    }
}
