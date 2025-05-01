package BinarySearch;

public class Searching2dMatrix {
    static boolean Target(int[][] matrix, int target) {
        int left = 0;
        int Right = (matrix.length * matrix[0].length) - 1;
        while(left <= Right) {
            int Mid = left + (Right - left) / 2;
            int Row = Mid / matrix[0].length;
            int col = Mid % matrix[0].length;
            if(target == matrix[Row][col]) {
                return true;
            }
            else if(target < matrix[Row][col]) {
                Right = Mid - 1;
            }
            else {
                left = Mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 4, 5}, {6, 7, 8, 9}, {10, 11, 12, 13}, {14, 15, 16, 17}};
        int target = 12;
        System.out.print(Target(matrix, target));
    }
}
