package BITMANIPULATION;

import java.util.Arrays;

public class RotateLights {
    static int[] Lights(int[] arr, int[] Temp) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                if(i - 1 >= 0) {
                    Temp[i - 1] ^= 1;
                }
                if(i + 1 < arr.length) {
                    Temp[i + 1] ^= 1;
                }
            }
        }
        return Temp;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0};
        int[] Temp = new int[arr.length];
        int Start = 0;
        for(int num : arr) {
            Temp[Start++] = num;
        }
        System.out.print(Arrays.toString(Lights(arr, Temp)));
    }
}
