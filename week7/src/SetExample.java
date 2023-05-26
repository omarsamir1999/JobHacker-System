import java.util.HashSet;
import java.util.Scanner;

public class SetExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int Q = input.nextInt();
            HashSet<Integer> HashSet = new HashSet<>();
            while (Q-- > 0) {
                String query = input.next();
                switch (query) {
                    case "a":
                        int x = input.nextInt();
                        HashSet.add(x);
                        break;
                    case "b":
                        for (int element : HashSet) {
                            System.out.println(element);
                        }
                        break;
                    case "c":
                        int removeElement = input.nextInt();
                        HashSet.remove(removeElement);
                        break;

                    case "d":
                        int searchElement = input.nextInt();
                        if (HashSet.contains(searchElement)) {
                            System.out.println("1");
                        } else {
                            System.out.println("-1");
                        }
                        break;
                    case "e":
                        System.out.println(HashSet.size());
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
