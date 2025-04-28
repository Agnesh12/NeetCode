package Stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperature {
    static int[] WarmerDay(int[] arr) {
        Stack<Integer> StIndex = new Stack();
        int Index = 0;
        int[] Ans = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            while(!StIndex.isEmpty() && arr[i] > arr[StIndex.peek()]) {
                Index = StIndex.pop();
                Ans[Index] = i - Index;
            }
            StIndex.push(i);
        }
        return Ans;
    }
    public static void main(String[] args) {
        int[] arr = {30, 31, 35, 28, 34, 36};
        System.out.print(Arrays.toString(WarmerDay(arr)));
    }
}
