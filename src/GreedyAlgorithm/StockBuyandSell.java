package GreedyAlgorithm;

public class StockBuyandSell {
    static int MaxProfit(int[] arr) {
        int MinPrice = Integer.MAX_VALUE;
        int MaxPrice = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            MinPrice = Math.min(MinPrice, arr[i]);
            MaxPrice = Math.max(MaxPrice, arr[i] - MinPrice);
        }
        return MaxPrice;
    }
    public static void main(String[] args) {
        int[] arr = {7, 1, 4, 5, 9};
        System.out.print(MaxProfit(arr));
    }
}
