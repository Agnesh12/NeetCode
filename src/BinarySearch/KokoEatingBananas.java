package BinarySearch;

public class KokoEatingBananas {
    static int SpeedEating(int[] arr, int limit) {
        int Left = 1;
        int Right = 0;
        int TotalSpeed = 0;
        for(int i = 0; i < arr.length; i++) {
            Right = Math.max(Right, arr[i]);
        }
        int Result = Right;
        while(Left <= Right) {
            int Mid =Left + (Right - Left)/ 2;
            TotalSpeed = 0;
            for(int num : arr) {
                TotalSpeed += (int) Math.ceil((double) num / Mid);
            }
            if(TotalSpeed <= limit) {
                Result = Mid;
                Right = Mid - 1;
            }
            else {
                Left = Mid + 1;
            }
        }
        return Result;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 8, 9, 10};
        int limit = 6;
        System.out.print(SpeedEating(arr, limit));
    }
}
