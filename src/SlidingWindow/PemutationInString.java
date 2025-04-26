package SlidingWindow;

import java.util.Arrays;

public class PemutationInString {
    static boolean Permutation(String Str1, String Str2) {
        int[] Str1hash = new int[26];
        int[] Str2hash = new int[26];
        int Left = 0;
        for(int i = 0; i < Str2.length(); i++) {
            Str2hash[Str2.charAt(i) - 'a']++;
        }
        for(int Right = 0; Right < Str1.length(); Right++) {
            Str1hash[Str1.charAt(Right) - 'a']++;
            while((Right - Left + 1) > Str2.length() - 1) {
                if(Arrays.equals(Str1hash, Str2hash)) return true;
                Str1hash[Str1.charAt(Left) - 'a']--;
                Left++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
       String Str1 = "rhifhkghabc";
       String Str2 = "abc";
       System.out.print(Permutation(Str1, Str2));
    }
}
