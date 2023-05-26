import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int T =input.nextInt();
        while (T-->0){
            int Q =input.nextInt();
            TreeMap<Integer,Integer> treeMap = new TreeMap<>();
            while (Q-->0){
                String query = input.next();
                switch (query){
                    case "a":
                        int x = input.nextInt();
                        int y = input.nextInt();
                        treeMap.put(x,y);
                        break;
                    case "b":
                        int searchElement = input.nextInt();
                        if (treeMap.containsKey(searchElement)){
                            System.out.println("1");
                        }else {
                            System.out.println("-1");
                        }
                        break;
                    case "c":
                        System.out.println( treeMap.size());
                        break;
                    case "d":
                        int removeElement = input.nextInt();
                        treeMap.remove(removeElement);
                        break;
                    case "e":
                        for (Map.Entry<Integer,Integer> element: treeMap.entrySet()){
                            System.out.println(element.getKey());
                        }
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
