package BinarySearch;

public class SearchInaRotatedSortedArray {
    static int FindTarget(int[] arr, int target) {
        int Left = 0;
        int Right = arr.length - 1;
        while(Left <= Right) {
            int Mid = Left + (Right - Left) / 2;
            if (arr[Mid] == target) {
                return arr[Mid];
            }
            if(arr[Left] <= arr[Mid]) {
                if(target > arr[Mid] || target < arr[Left]) {
                    Left = Mid + 1;
                }
                else {
                    Right = Mid - 1;
                }
            }
            else {
                if(target < arr[Mid] || target > arr[Right]) {
                    Right = Mid - 1;
                }
                else {
                    Left = Mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 1, 2, 3, 4};
        int target = 8;
        System.out.print(FindTarget(arr, target));
    }
}
