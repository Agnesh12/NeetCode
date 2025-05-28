package Stack;

import java.util.Stack;

public class DecodeStrings {
    public static String ChangeString(String Str) {
        Stack<String> Ans = new Stack();
        Stack<Integer> Number = new Stack();
        String Result = "";
        int Value = 0;
        for(char Ch : Str.toCharArray()) {
            if(Character.isDigit(Ch)) {
                Value = Value * 10 + Character.getNumericValue(Ch);
            }
            else if(Ch == '[') {
                Ans.push(Result);
                Result = "";
                Number.push(Value);
                Value = 0;
            }
            else if(Ch == ']') {
                String TempChar = Ans.pop();
                int TempNum = Number.pop();
                StringBuilder Store = new StringBuilder(TempChar);
                for(int i = 0; i < TempNum; i++) {
                    Store.append(Result);
                }
                Result = Store.toString();
            }
            else {
                Result += Ch;
            }
        }
        return Result;
    }
    public static void main(String[] args) {
        String Str = "3[a]2[bc]";
        System.out.print(ChangeString(Str));
    }
}
