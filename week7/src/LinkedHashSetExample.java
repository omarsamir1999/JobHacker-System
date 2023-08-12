import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int Q = input.nextInt();
            LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
            while (Q-- > 0) {
                String query = input.next();
                switch (query) {
                    case "a":
                        int x = input.nextInt();
                        linkedHashSet.add(x);
                        break;
                    // I merged case b and case f because They have the same implementation
                    case "b":
                    case "f":
                        for (int element : linkedHashSet) {
                            System.out.println(element);
                        }
                        break;
                    case "c":
                        int removeElement = input.nextInt();
                        linkedHashSet.remove(removeElement);
                        break;

                    case "d":
                        int searchElement = input.nextInt();
                        if (linkedHashSet.contains(searchElement)) {
                            System.out.println("1");
                        } else {
                            System.out.println("-1");
                        }
                        break;
                    case "e":
                        System.out.println(linkedHashSet.size());
                        break;

                    default:
                        System.out.println("Invalid Query");
                        Q++;
                        break;
                }

            }
        }
    }
}
