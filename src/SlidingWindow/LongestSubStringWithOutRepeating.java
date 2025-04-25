package SlidingWindow;

import java.util.HashMap;

public class LongestSubStringWithOutRepeating {
    static int Longest(String Str) {
        HashMap<Character, Integer> Result = new HashMap();
        int Left = 0;
        int Right = 0;
        int MaxLen = 0;
        while(Right < Str.length()) {
            if(Result.containsKey(Str.charAt(Right))) {
                Left = Math.max(Left, Result.get(Str.charAt(Right)) + 1);
            }
            Result.put(Str.charAt(Right), Right);
            MaxLen = Math.max(MaxLen, Right - Left + 1);
            Right++;
        }
        return MaxLen;
    }
    public static void main(String[] args) {
        String Str = "abcdabcd";
        System.out.print(Longest(Str));
    }
}
