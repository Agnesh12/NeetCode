package Stack;

import java.util.Stack;

public class ReversePolishNotation {
    static int Notation(String[] arr) {
        Stack<Integer> ans = new Stack<>();
        int FirstNo = 0;
        int SecondNo = 0;
        for(String ch : arr) {
            if(ch.equals("+")) {
                ans.push(ans.pop() + ans.pop());
            }
            else if(ch.equals("-")) {
                FirstNo = ans.pop();
                SecondNo = ans.pop();
                ans.push(SecondNo - FirstNo);
            }
            else if(ch.equals("*")) {
                ans.push(ans.pop() * ans.pop());
            }
            else if(ch.equals("/")) {
                FirstNo = ans.pop();
                SecondNo = ans.pop();
                ans.push(SecondNo / FirstNo);
            }
            else {
                ans.push(Integer.parseInt(ch));
            }
        }
        return ans.pop();
    }
    public static void main(String[] args) {
        String[] arr = {"5", "2", "+", "3", "-", "5", "*"};
        System.out.print(Notation(arr));
    }
}
