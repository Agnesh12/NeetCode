package Stack;

import java.util.Stack;

public class LargestRectangleInHistogram {
    static int RectangleArea(int[] arr) {
        int[] LeftArr = new int[arr.length];
        int[] RightArr = new int[arr.length];
        Stack<Integer> Index = new Stack();
        for(int i = 0; i < arr.length; i++) {
            LeftArr[i] = -1;
            while(!Index.isEmpty() && arr[Index.peek()] >= arr[i]) {
                Index.pop();
            }
            if(!Index.isEmpty()) {
            LeftArr[i] = Index.peek();
            }
            Index.push(i);
        }
        Index.clear();
        for(int i = arr.length - 1; i >= 0; i--) {
            RightArr[i] = arr.length;
            while(!Index.isEmpty() && arr[Index.peek()] >= arr[i]) {
                Index.pop();
            }
            if(!Index.isEmpty()) {
                RightArr[i] = Index.peek();
            }
            Index.push(i);
        }
        int MaxArea = 0;
        for(int i = 0; i < arr.length; i++) {
            int Width = RightArr[i] - LeftArr[i] - 1;
            int Area = arr[i] * Width;
            MaxArea = Math.max(MaxArea, Area);
        }
        return MaxArea;
    }
    public static void main(String[] args) {
        int[] arr = {7, 3, 4, 5, 2, 2, 1};
        System.out.print(RectangleArea(arr));
    }
}
