import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isValid(s));

    }

    static public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (!stack.isEmpty() && ((c == ')'
                    && stack.peek() == '(') || (c == '}'
                    && stack.peek() == '{')
                    || (c == ']' && stack.peek() == '['))) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}