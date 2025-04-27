package SlidingWindow;

import java.util.HashMap;

public class MinimumWindowSubString {
    static String SubString(String Str1, String Str2) {
        HashMap<Character, Integer> Check = new HashMap();
        HashMap<Character, Integer> Store = new HashMap();
        for(char ch : Str2.toCharArray()) {
            Check.put(ch, Check.getOrDefault(ch, 0) + 1);
        }
        int ResLen = Integer.MAX_VALUE;
        int[] SubIndex = {-1, -1};
        int Left = 0;
        int have = 0;
        int need = Check.size();
        for(int Right = 0; Right < Str2.length(); Right++) {
            char ch = Str2.charAt(Right);
            Store.put(ch, Store.getOrDefault(ch, 0) + 1);
            if(Check.containsKey(ch) && Store.get(ch).equals(Check.get(ch))) {
                have++;
            }
            while(have == need) {
                if((Right - Left + 1) < ResLen) {
                    ResLen = Right - Left + 1;
                    SubIndex[0] = Left;
                    SubIndex[1] = Right;
                }
                char LeftChar = Str2.charAt(Left);
                Store.put(LeftChar, Store.get(LeftChar) - 1);
                if(Check.containsKey(LeftChar) && Store.get(LeftChar) < Check.get(LeftChar)) {
                    have--;
                }
                Left++;
            }

        }
        return (ResLen == Integer.MAX_VALUE) ? "" : Str2.substring(SubIndex[0], SubIndex[1] + 1);
    }
    public static void main(String[] args) {
        String Str1 = "hsiohioabc";
        String Str2 = "abc";
        System.out.print(SubString(Str1, Str2));
    }
}
