package Stack;

import java.util.Stack;

public class ReverseSubStrings {
    public static String Reverse(String Str) {
        String Result = "";
        for(int i = Str.length() - 1; i >= 0; i--) {
            Result += Str.charAt(i);
        }
        return Result;
    }
    public static void main(String[] args) {
        String Str = "a(bc{de}f)g";
        Stack<String> Store = new Stack<>();
        String Result = "";
        for(char Ch : Str.toCharArray()) {
            if(Ch == '(' || Ch == '{') {
                Store.push(Result);
                Store.push(String.valueOf(Ch));
                Result = "";
            }
            else if(Ch == ')' || Ch == '}') {
                String Bracket = Store.pop();;
                String Prev = Store.pop();
                if(Bracket.equals(")") && Ch == ')') {

                    Result = Prev + Reverse(Result);;
                }
                else if(Bracket.equals("}") && Ch == '}') {
                    String Rever = Reverse(Result);
                    Result = Prev + Rever + Rever;
                }
            }
            else {
                Result += Ch;
            }
        }
        System.out.println(Result);

    }
}
