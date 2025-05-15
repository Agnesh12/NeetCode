package ArraysAndHashing;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean ValidAnagram(String str1, String str2) {
        HashMap<Character, Integer> Str1Map = new HashMap();
        HashMap<Character, Integer> Str2Map = new HashMap();
        for(char Ch : str1.toCharArray()) {
            Str1Map.put(Ch, Str1Map.getOrDefault(Ch, 0) + 1);
        }
        for(char Ch : str2.toCharArray()) {
            Str2Map.put(Ch, Str2Map.getOrDefault(Ch, 0) + 1);
        }
        return Str1Map.equals(Str2Map);
    }
    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "act";
        System.out.print(ValidAnagram(str1, str2));
    }
}
