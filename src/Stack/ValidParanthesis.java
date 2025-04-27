package Stack;

import java.util.Stack;

public class ValidParanthesis {
    static boolean Paranthesis(String Str) {
        Stack<Character> Check = new Stack();
        for(char ch : Str.toCharArray()) {
            if(ch == '(') {
                Check.push(')');
            }
            else if(ch == '[') {
                Check.push(']');
            }
            else if(ch == '{') {
                Check.push('}');
            }
            else if(Check.isEmpty() || Check.pop() != ch) {
                return false;
            }
        }
        return Check.isEmpty();
    }
    public static void main(String[] args) {
        String Str = "(())";
        System.out.print(Paranthesis(Str));
    }
}
