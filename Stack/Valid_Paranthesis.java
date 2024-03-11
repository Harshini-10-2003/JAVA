package Stack;
import java.util.Stack; 

public class Valid_Paranthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } 
                char top = stack.pop();
                if ((c == ')' && top != '(') ||                       
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;     
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "()[]{}";
        String test2 = "([)]";
        String test3 = "{[()]}";

        System.out.println("Test 1 is valid: " + isValid(test1));
        System.out.println("Test 2 is valid: " + isValid(test2));
        System.out.println("Test 3 is valid: " + isValid(test3));
    }
}