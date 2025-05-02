package BinarySearch;

public class MinimumInSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 2, 3, 4};
        int Left = 0;
        int Right = arr.length - 1;
        while(Left < Right) {
            int Mid = Left +(Right - Left) / 2;
            if(arr[Mid] < arr[Right]) {
                Right = Mid;
            }
            else {
                Left = Mid + 1;
            }
        }
        System.out.println(arr[Left]);
    }
}
