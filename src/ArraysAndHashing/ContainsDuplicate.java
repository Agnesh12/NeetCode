package ArraysAndHashing;

import java.util.HashMap;

public class ContainsDuplicate {
    public static boolean Duplicate(int[] arr) {
        HashMap<Integer, Integer> Check = new HashMap();
        for(int num : arr) {
            if(Check.containsKey(num)) {
                return true;
            }
            Check.put(num, 1);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1};
        System.out.print(Duplicate(arr));
    }
}
