package binarySearch;

import java.util.Arrays;

public class _2DArrays {
    /*
     * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
     * Output: true
     */
    public boolean searchMatrix(int[][] matrix, int target) {

        return helper(matrix, target, 0, matrix.length - 1);

    }

    private boolean helper(int[][] matrix, int target, int rowStart, int rowEnd) {

        if (rowStart > rowEnd) {
            return false;
        }
        int mid = rowStart + (rowEnd - rowStart) / 2;

        int low = 0;
        int high = matrix[mid].length - 1;

        while (low <= high) {
            int innerMid = low + (high - low) / 2;

            if (target == matrix[mid][innerMid]) {
                return true;
            }
            if (matrix[mid][innerMid] > target) {
                high = innerMid - 1;
            } else {
                low = innerMid + 1;
            }
        }
        // if (matrix[mid][0] >= target && target <= matrix[mid][matrix[mid].length -
        // 1]) {
        // return false;
        // }
        if (matrix[mid][0] > target) {
            return helper(matrix, target, rowStart, mid - 1);
        } else {
            return helper(matrix, target, mid + 1, rowEnd);

        }

    }

    public static void main(String[] args) {
        _2DArrays obj = new _2DArrays();
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        System.out.println(obj.searchMatrix(matrix, 13));
        ;

    }
}
